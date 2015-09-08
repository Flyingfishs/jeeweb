package com.thinkgem.jeesite.modules.tz.spider.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.mapper.JsonMapper;
import com.thinkgem.jeesite.common.utils.DateTimeUtil;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.fund.spider.core.craw.HttpClientCrawlerImpl;
import com.thinkgem.jeesite.modules.fund.spider.http.CrawlResult;
import com.thinkgem.jeesite.modules.fund.spider.http.RegexUtil;
import com.thinkgem.jeesite.modules.fund.spider.http.Url;
import com.thinkgem.jeesite.modules.tz.dao.TzSfDividendMapper;
import com.thinkgem.jeesite.modules.tz.dao.TzSfInfoMapper;
import com.thinkgem.jeesite.modules.tz.dao.TzSfMemberIndexMapper;
import com.thinkgem.jeesite.modules.tz.dao.TzSfMemberMapper;
import com.thinkgem.jeesite.modules.tz.dao.TzSfNvMapper;
import com.thinkgem.jeesite.modules.tz.dao.TzSfOrgIndexMapper;
import com.thinkgem.jeesite.modules.tz.dao.TzSfOrgMapper;
import com.thinkgem.jeesite.modules.tz.dao.TzSfSplitMapper;
import com.thinkgem.jeesite.modules.tz.dao.TzSfStockMapper;
import com.thinkgem.jeesite.modules.tz.entity.TzSfDividend;
import com.thinkgem.jeesite.modules.tz.entity.TzSfDividendExample;
import com.thinkgem.jeesite.modules.tz.entity.TzSfInfo;
import com.thinkgem.jeesite.modules.tz.entity.TzSfInfoExample;
import com.thinkgem.jeesite.modules.tz.entity.TzSfMember;
import com.thinkgem.jeesite.modules.tz.entity.TzSfMemberExample;
import com.thinkgem.jeesite.modules.tz.entity.TzSfMemberIndex;
import com.thinkgem.jeesite.modules.tz.entity.TzSfMemberIndexExample;
import com.thinkgem.jeesite.modules.tz.entity.TzSfNv;
import com.thinkgem.jeesite.modules.tz.entity.TzSfNvExample;
import com.thinkgem.jeesite.modules.tz.entity.TzSfOrg;
import com.thinkgem.jeesite.modules.tz.entity.TzSfOrgExample;
import com.thinkgem.jeesite.modules.tz.entity.TzSfOrgIndex;
import com.thinkgem.jeesite.modules.tz.entity.TzSfOrgIndexExample;
import com.thinkgem.jeesite.modules.tz.entity.TzSfSplit;
import com.thinkgem.jeesite.modules.tz.entity.TzSfSplitExample;
import com.thinkgem.jeesite.modules.tz.entity.TzSfStock;
import com.thinkgem.jeesite.modules.tz.entity.TzSfStockExample;

@Service
@Transactional(readOnly = true)
public class SpiderHawBuySfInfo {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TzSfInfoMapper tzSfInfoMapper;//
	
	@Autowired
	private TzSfMemberIndexMapper TzSfMemberIndexMapper;
	@Autowired
	private TzSfMemberMapper tzSfMemberMapper;
	
	@Autowired
	private TzSfNvMapper tzSfNvMapper;
	
	@Autowired
	private TzSfOrgMapper tzSfOrgMapper;
	@Autowired
	private TzSfOrgIndexMapper tzSfOrgIndexMapper;
	
	@Autowired
	private TzSfSplitMapper tzSfSplitMapper;
	@Autowired
	private TzSfStockMapper tzSfStockMapper;
	
	@Autowired
	private TzSfDividendMapper tzSfDividendMapper;
	
	public void execSfInfoZeTest(){
		TzSfInfoExample example = new TzSfInfoExample();
		example.createCriteria().andTargetUrlEqualTo("http://simu.howbuy.com/zexi/P00511/");
		TzSfInfo tzSfInfo = tzSfInfoMapper.selectByInfoExample(example);
		if(StringUtils.isNotEmpty(tzSfInfo)){
			this.process(tzSfInfo);
		}
	}
	
	public void execSfInfo(){
		TzSfInfo tzSfInfo =null;
		try{
			logger.debug("init execSfInfo");
			TzSfInfoExample example = new TzSfInfoExample();
			example.createCriteria().andTargetUrlIsNotNull().andTargetStatusIsNull();
			example.setOrderByClause("navDate desc ");
			boolean runStart = true;
			while(runStart){
				tzSfInfo = tzSfInfoMapper.selectByInfoExample(example);
				if(StringUtils.isNotEmpty(tzSfInfo)){
					this.process(tzSfInfo);
				}else{
					runStart = false;
				}
			}
			logger.debug("exec no run data finshed");
			//
			example = new TzSfInfoExample();
			example.createCriteria().andTargetUrlIsNotNull().andTargetTimeLessThanOrEqualTo(DateTimeUtil.dateAdd("h", -3, new Date(), false));
			example.setOrderByClause("targetTime asc,navDate desc ");
			runStart = true;
			while(runStart){
				tzSfInfo = tzSfInfoMapper.selectByInfoExample(example);
				if(StringUtils.isNotEmpty(tzSfInfo)){
					this.process(tzSfInfo);
				}else{
					runStart = false;
				}
			}
			logger.debug("end execSfInfo");
		}catch(Exception e){
			logger.error("execSfInfo : {} faild", e);
			if(tzSfInfo!=null)
				logger.error("faild info:{} {}",tzSfInfo.getFundName(),tzSfInfo.getTargetUrl());
		}
	}
	
	
	//http://simu.howbuy.com/zexi/P00511/ :泽熙3期 
	//特殊数据：http://simu.howbuy.com/tangyin/M00131/ 多基金经理
	public void process(TzSfInfo tzSfInfo){
		logger.debug("process fundName:{} url:{}",tzSfInfo.getFundName(),tzSfInfo.getTargetUrl());
		tzSfInfo.setTargetUrl(StringUtils.trimAll(tzSfInfo.getTargetUrl()));
		Url urlPojo = new Url(tzSfInfo.getTargetUrl());
		
		//TzSfInfo f = null;
		HttpClientCrawlerImpl httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
		CrawlResult resultPojo = httpClientCrawlerImpl.crawl();
		if (resultPojo != null) {
			parserSf(resultPojo.getPageContent(),tzSfInfo);
			//f.setFundId(tzSfInfo.getFundId());
			tzSfInfo.setTargetStatus(1);
			tzSfInfo.setTargetTime(new Date());
			if(true){//test
				//return ;
			}
			
			//抓取历史净值
			urlPojo.setUrl(tzSfInfo.getTargetUrl()+"lsjz");
			httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
			resultPojo = httpClientCrawlerImpl.crawl();
			String lsjzUrl = RegexUtil.pattern("(<script type=\"text/javascript\" src=\"(http://static.howbuy.com/min/f=/upload/auto/script/fund/smjjlsjz_.*?.js)\"></script>)", resultPojo.getPageContent());
			
			//--------//
			urlPojo.setUrl(lsjzUrl);
			httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
			resultPojo = httpClientCrawlerImpl.crawl();
			parserNav(resultPojo.getPageContent(),tzSfInfo);
			
			//Org;
			TzSfOrg fo=null;
			if(StringUtils.isNotEmpty(tzSfInfo.getTargetOrgUrl())){
				TzSfOrgExample orgExample = new TzSfOrgExample();
				orgExample.createCriteria().andTargetUrlEqualTo(tzSfInfo.getTargetOrgUrl());
				//---
				fo = tzSfOrgMapper.selectByInfoExample(orgExample);
				
				if(fo==null){
					fo = new TzSfOrg();
					fo.setTargetUrl(tzSfInfo.getTargetOrgUrl());
				}else{
				}
				//-----------------------
				urlPojo.setUrl(tzSfInfo.getTargetOrgUrl());
				httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
				resultPojo = httpClientCrawlerImpl.crawl();
				parserOrg(resultPojo.getPageContent(),fo);
				
			}
			//同一个基金会存在对个基金经理
			//
			List<TzSfMember> fms = new ArrayList<TzSfMember>();
			//manage;
			if(StringUtils.isNotEmpty(tzSfInfo.getTargetManagerUrl())){
				String[] urls = tzSfInfo.getTargetManagerUrl().split(",");
				for(int i=0;i<urls.length;i++){
					TzSfMemberExample memberExample = new TzSfMemberExample();
					memberExample.createCriteria().andTargetUrlEqualTo(urls[i]);
					TzSfMember fm =  tzSfMemberMapper.selectByInfoExample(memberExample);
					if(fm==null){
						fm = new TzSfMember();
						fm.setTargetUrl(urls[i]);
					}
					
					urlPojo.setUrl(urls[i]);
					httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
					resultPojo = httpClientCrawlerImpl.crawl();
					
					
					parserManager(resultPojo.getPageContent(),fm);
					
					if(StringUtils.isNotEmpty(fm.getUserName())){
						fms.add(fm);
						
						//设置公司简介
						if(fo!=null) //TODO
						fo.setDescription(fm.getOrgDesc());
					}
				}
				
			}
			
			//--org
			if(fo!=null && StringUtils.isNotEmpty(fo.getOrgName())){
				if(null==fo.getId()){
					fo.preInsert();
					tzSfOrgMapper.insertSelective(fo);
				}else{
					fo.preUpdate();
					tzSfOrgMapper.updateByPrimaryKeySelective(fo);
				}
				//设置
				TzSfOrgIndexExample orgIndexExample = new TzSfOrgIndexExample();
				orgIndexExample.createCriteria().andOrgIdEqualTo(fo.getId()).andFundIdEqualTo(tzSfInfo.getId());
				TzSfOrgIndex orgIndex = tzSfOrgIndexMapper.selectByInfoExample(orgIndexExample);
				if(orgIndex!=null){
				}else{
					orgIndex = new TzSfOrgIndex();
					orgIndex.setOrgId(fo.getId());
					orgIndex.setFundId(tzSfInfo.getId());
					orgIndex.setDispIndex(1);
					
					tzSfOrgIndexMapper.insertSelective(orgIndex);
				}
			}
			
			
			for(TzSfMember fm :fms){
				if(fm!=null && StringUtils.isNotEmpty(fm.getUserName())){
					
					if(fo!=null ){
						fm.setOrgId(fo.getId());//设置人员所属公司
						fm.setOrgFullName(fo.getOrgFullName());
					}
					
					if(null==fm.getId()){
						fm.preInsert();
						tzSfMemberMapper.insertSelective(fm);
					}else{
						fm.preUpdate();
						tzSfMemberMapper.updateByPrimaryKeySelective(fm);
					}
					//--设置
					TzSfMemberIndexExample memberIndexExample = new TzSfMemberIndexExample();
					memberIndexExample.createCriteria().andUserIdEqualTo(fm.getId()).andFundIdEqualTo(tzSfInfo.getId());
					TzSfMemberIndex memberIndex = TzSfMemberIndexMapper.selectByInfoExample(memberIndexExample);
					if(memberIndex!=null){
						
					}else{
						memberIndex = new TzSfMemberIndex();
						memberIndex.setFundId(tzSfInfo.getId());
						memberIndex.setUserId(fm.getId());
						memberIndex.setDispIndex(1);
						TzSfMemberIndexMapper.insertSelective(memberIndex);
						
					}
					
				}
			}
			tzSfInfoMapper.updateByPrimaryKeySelective(tzSfInfo);
		}
		logger.debug("save successfully~");
	}
	
	/**
	 * 分析机构
	 * @param html
	 * @param fo
	 */
	private void parserOrg(String html, TzSfOrg fo) {
		if(StringUtils.isEmpty(html)){
			return;
		}
		Document doc = Jsoup.parse(html);  
        Elements els = doc.select("div.main");
        String v;
        //公司介绍;
        Elements trs =  els.select("div#nTab2_Con2>div.company_item>div.people>table>tbody>tr");
        
        if(StringUtils.isEmpty(trs)){
        	logger.error("TzSfOrg not find {}",fo.getTargetUrl());
			return;
		}
        //策略
        if(null!=els.select("div.review>div.review_rt")){
        	v = els.select("div.review>div.review_rt").text();
            fo.setInvestmentIdea(v);
        }
        
        v = els.select("h2").text();
        fo.setOrgName(v);
        
        v = els.select("div.company_detail>ul.company_about>li").first().select("span").text();
        fo.setPutNo(v);
        
        //公 司 名
        v = trs.get(0).select("td.tdlt").text();
        fo.setOrgFullName(v);
        
        //成立日期
        v = trs.get(1).select("td.tdlt").text();
        fo.setBuildTime(v);
        
        //注册资本
        v = trs.get(2).select("td.tdlt").text();
        fo.setRefMoney(v);
        //所 在 地
        v = trs.get(4).select("td.tdlt").text();
        fo.setAddress(v);
        fo.setRegAddress(v);
        //公司类型
        v = trs.get(6).select("td.tdlt").text();
        fo.setOrgType(v);
        
	}

	/**
	 * 分析经理
	 * @param html
	 * @param fm
	 */
	private void parserManager(String html, TzSfMember fm) {
		if(StringUtils.isEmpty(html)){
			return;
		}       
        
		Document doc = Jsoup.parse(html);  
        Elements els = doc.select("div.main");
        String v;
      
        //公司介绍;
        Elements trs =  els.select("div.manager_intro>table>tbody>tr");
        
        if(StringUtils.isEmpty(trs)){
        	logger.error("TzSfMember not find {}",fm.getTargetUrl());
			return;
		}
        
        v = els.select("div.manager_name").text();
        fm.setUserName(v);
        if(StringUtils.isEmpty(fm.getNick()))
        	fm.setNick(fm.getUserName());
        
        
        v = els.select("div.manager_pic>img").attr("src");
        fm.setImageurl(v);
        
        v = trs.get(0).select("td.w1").text().replace("擅长策略：", "");
        fm.setGoodStrategy(v);
        v = trs.get(0).select("td.w2").text().replace("任职私募年限：", "");
        fm.setFundTime(v);
       
        v = trs.get(0).select("td.w3").text().replace("从业年限：", "");
        fm.setInvestmentYears(v);
        v = trs.get(0).select("td.w4").text().replace("学历：", "");
        fm.setUeducation(v);
        
        v = trs.get(1).select("td").get(0).text().replace("履历背景：", "");
        fm.setPlacement(v);
        v = trs.get(1).select("td").get(1).text().replace("任职日期：", "");
        fm.setMtimes(v);
        
        v = els.select("div.manager_info>span").text();
        fm.setDescription(v);
        
        v = els.select("div.company_desc").text();
        fm.setOrgDesc(v);
	}
	
	//获取基金数据
  private Object[] getNavListFunc(String script) {
	    ScriptEngineManager sem = new ScriptEngineManager();
	    ScriptEngine scriptEngine = sem.getEngineByName("js");
	    try {
	    	 scriptEngine.eval(script);
	         Object object2 = scriptEngine.eval("SmlsjzDateObj.navList");
	         if(null==object2){
	        	 return null;
	         }
	         Class<? extends Object> clazz = object2.getClass();
	         Field denseField = clazz.getDeclaredField("dense");
	         denseField.setAccessible(true);
	         return (Object[]) denseField.get(object2);
	    } catch (Exception e) {
	    	logger.error("faild ", e);
	    }
	    return null;
	  }
	
	/**净值数据;*/
	private void parserNav(String html,TzSfInfo f) {
		if(StringUtils.isEmpty(html)){
			return;
		}
		//数据截取处理;
		/*html = html.substring(html.indexOf("{"),html.lastIndexOf("}")+1);
		Map<?, ?> map = JsonMapper.getInstance().fromJson(html, Map.class);
		if(!map.containsKey("navList")){
			return;
		}
		List<?> navList = (List<?>) map.get("navList");*/
		
		TzSfNv nv = new TzSfNv();
		nv.setFundId(f.getId());
		String lastDate = tzSfNvMapper.selectLastNvDate(nv);
		logger.debug("this fund {} nav lastDate {} , lastDate {}",f.getFundName(),f.getNavDate(),lastDate);
		if(StringUtils.isNotEmpty(lastDate) && StringUtils.isNotEmpty(f.getNavDate()) &&  f.getNavDate().equals(lastDate)){
			logger.info("this fund {} nav lastDate {} equels",f.getFundName(),f.getNavDate());
			return;
		}
		
		Object [] navList = getNavListFunc(html);
		if(null==navList){
			return;
		}
		
		String [] dataArr;String d;
		for(int i=0;i<navList.length;i++){
			dataArr = String.valueOf(navList[i]).split(",");
			int month = Integer.valueOf(dataArr[1])+1;
			int day = Integer.valueOf(dataArr[2]);
			d = dataArr[0]+"-"+(month<10?"0":"")+month+"-"+(day<10?"0":"")+day;
			nv.setNavDate(d);
			nv.setNav(dataArr[3]);
			nv.setAddedNav(dataArr[4]);
			if(StringUtils.isEmpty(lastDate)){ //没有日期;直接添加
				nv.setId(null);
				tzSfNvMapper.insertSelective(nv);
			}else{
				if(DateTimeUtil.compareDateTime(lastDate,d)){
					//logger.debug("-----d:{} < {} ;",d,lastDate);
					continue;
				}
				
				TzSfNvExample nvExample = new TzSfNvExample();
				nvExample.createCriteria().andFundIdEqualTo(f.getId()).andNavDateEqualTo(nv.getNavDate());
				TzSfNv nv0 = tzSfNvMapper.selectByInfoExample(nvExample);
				if(StringUtils.isEmpty(nv0)){
					nv.setId(null);
					tzSfNvMapper.insertSelective(nv);
				}
			}
		}
	}
	
	/**净值数据;*/
	/*public List<TsFundNv> parserFund(String html) {
		List<TsFundNv> fs = new ArrayList<TsFundNv>();
		Document doc = Jsoup.parse(html);  
        Elements trs = doc.select("div.fund_data>table>tbody>tr");
        boolean isTitle  =true;
        TsFundNv f;
        //
        for(Element tr: trs){
        	if(isTitle){
        		isTitle = false;
        		continue;
        	}
        	f = new TsFundNv();
        	f.setNvDate(tr.select("td").get(0).text());
        	f.setNav(tr.select("td").get(1).text());
        	f.setAddNav(tr.select("td").get(2).text());
        	f.setNvRate(tr.select("td").get(3).text());
        	fs.add(f);
        }
		return  fs;
	}*/
	
	/**
	 * 分析产品
	 * @param html
	 * @param p
	 * @return
	 */
	private void parserSf(String html,TzSfInfo p ) {
		//解析该json
		Document doc = Jsoup.parse(html);  
        Elements baseEl = doc.select("div.main");
        int i = 0;
        String v;
        
        //净值地址;
       // String fundUrl = RegexUtil.pattern("(<script type=\"text/javascript\" src=\"(http://static.howbuy.com/min/f=/upload/auto/script/fund/smhb_.*?.js)\"></script>)", html);
        //System.out.println(fundUrl);
        //p.setNavUrl(StringUtils.trimAll(fundUrl));
        //String lsjzMore = doc.select("a#jinzhi_more").first().attr("href");
        //p.setTargetNavLsUrl(StringUtils.trimAll(lsjzMore));
        
        //产品详情;
        Elements pel = baseEl.select("div#nTab2_Con2>div>div.part_a>table>tbody>tr");
        for(Element tr:pel){
        	i = tr.siblingIndex();
        	v = tr.select("td.tdpd").text();
        	//System.out.println(i+" - "+tr.text() +" "+v);
        	switch(i){
			case 0:
				p.setFundFullName(v);
			case 2:
				p.setFundType(v);
			case 4:
				p.setOrganization(v);
			case 6:
				p.setManagedBank(v);
				//p.setAccountName(v);
			case 8:
				//p.setOpenDate(v);
				p.setOpenDateDesc(v);
			case 12:
				p.setLockedTimeLimitDesc(v);
			case 14:
				p.setPutNo(v);
			case 16://成立日期
				p.setFundationDate(v);
			case 18://结构形式
				p.setStructures(v);
			case 20://基金发行人
				p.setFundPublisher(v);
			case 22:
				p.setDataStatus(v);
			case 24://净值单位
				p.setNavUnit(v);
			
			}
        }
        //认购须知
        pel = baseEl.select("div#nTab2_Con3>div.instruction_box>table>tbody>tr");
        for(Element tr:pel){
        	i = tr.siblingIndex();
        	v = tr.select("td.tdleft").first().text();
        	//System.out.println(i+" - "+tr.text() +" "+v);
        	switch(i){
			case 0:
				p.setMinPurchaseAmount(v);
			case 2:
				p.setSubscriptionFee(v);
			case 4:
				p.setManageFee(v);
			case 6:
				//p.setFgdlF(v);
			case 8:
				p.setRansomFee(v);
			case 10:
				p.setMinAppendAmount(v);
			}
        }
        
        //title;
        v = baseEl.select(".trade_fund_title>h1").first().text();
        p.setFundName(v);
        
        Elements els = baseEl.select("div.trade_fund_details");
        
        //最新净值
        v = els.select("div.net>dl>dd.ftArial>span").text();
        p.setNav(StringUtils.trimXStr(v));
        
        //净值日期
        v = els.select("div.net>dl>dd").get(2).text();
        if(StringUtils.isNotEmpty(v)){
        	v = v.replace("(", "").replace(")", "");
        	p.setNavDate(StringUtils.trimXStr(v));
        }
       //累计净值
        v = els.select("div.type>ul.stock>li").first().select("span").text();
        //p.setAddNav(v);
        
        //类型;
        v = els.select("div.type>ul.stock>li.ptop>span").text();
        p.setFundType(v);
        
        //成立日期
        v = els.select("div.type>ul.date>li").first().select("span").text();
        p.setFundationDate(v);
        //基金公司
        v = els.select("div.type>ul.fund>li").first().select("span").text();
        if(els.select("div.type>ul.fund>li").first().select("span>a")!=null){
        	p.setTargetOrgUrl(StringUtils.trimAll(els.select("div.type>ul.fund>li").first().select("span>a").attr("href")));
        }
        p.setTargetOrg(v);
        //基金经理
        v = els.select("div.type>ul.fund>li.ptop>span").text();
        if(els.select("div.type>ul.fund>li.ptop>span>a")!=null){
        	Elements mels = els.select("div.type>ul.fund>li.ptop>span>a");
        	String url = "";
        	for(Element e : mels){
        		if(url!=""){
        			url +=",";
        		}
        		url += StringUtils.trimAll(e.attr("href"));
        	}
        	p.setTargetManagerUrl(url);
        }
        p.setTargetManager(v);
        
        //重仓股数据
        pel = baseEl.select("div#publishStockTable>table>tbody>tr");
        for(Element tr:pel){
        	i = tr.siblingIndex();
        	if(i==0){
        		continue;
        	}
        	
        	TzSfStockExample stockExam = new TzSfStockExample();
        	stockExam.createCriteria().andFundIdEqualTo(p.getId())
        	.andStockCodeEqualTo(tr.select("td").get(1).text()).andEndDateEqualTo(tr.select("td").get(8).text());
        	TzSfStock st = tzSfStockMapper.selectByInfoExample(stockExam);
        	if(StringUtils.isNotEmpty(st)){
        		//continue;
        	}else{
        		st = new TzSfStock();
        		st.setFundId(p.getId());
        	}
        	st.setStockCode(tr.select("td").get(1).text());
        	st.setStockName(tr.select("td").get(2).text());
        	st.setStockNum(tr.select("td").get(3).text());
        	
        	st.setStockRate(tr.select("td").get(4).text());
        	st.setStockChange(tr.select("td").get(5).text());
        	st.setChangeNum(tr.select("td").get(6).text());
        	st.setChangeRate(tr.select("td").get(7).text());
        	st.setEndDate(tr.select("td").get(8).text());
        	
        	if(StringUtils.isNotEmpty(st)){
        		tzSfStockMapper.updateByPrimaryKeySelective(st);
        	}else{
        		tzSfStockMapper.insertSelective(st);
        	}
        }
        
        //分红数据;
        pel = baseEl.select("div#nTab2_Con2>div>div.part_c>div.fl>table>tbody>tr");
        for(Element tr:pel){
        	i = tr.siblingIndex();
        	if(i==0 ||i==2 ){
        		continue;
        	}
        	TzSfDividendExample sdExam = new TzSfDividendExample();
        	sdExam.createCriteria().andFundIdEqualTo(p.getId()).andDividendDateEqualTo(tr.select("td").get(1).text());
        	TzSfDividend sd = tzSfDividendMapper.selectByInfoExample(sdExam);
        	if(StringUtils.isNotEmpty(sd)){
        		continue;
        	}
        	sd = new TzSfDividend();
        	sd.setFundId(p.getId());
        	sd.setDividendDate(tr.select("td").get(1).text());
        	sd.setDividendRatio(tr.select("td").get(2).text());
        	tzSfDividendMapper.insertSelective(sd);
        }
        
      //分拆数据;
        pel = baseEl.select("div#nTab2_Con2>div>div.part_c>div.fr>table>tbody>tr");
        for(Element tr:pel){
        	i = tr.siblingIndex();
        	if(i==0 ||i==2 ){
        		continue;
        	}
        	TzSfSplitExample spExam = new TzSfSplitExample();
        	spExam.createCriteria().andFundIdEqualTo(p.getId()).andSplitDateEqualTo(tr.select("td").get(1).text());
        	TzSfSplit sp = tzSfSplitMapper.selectByInfoExample(spExam);
        	if(StringUtils.isNotEmpty(sp)){
        		continue;
        	}
        	sp = new TzSfSplit();
        	sp.setFundId(p.getId());
        	sp.setSplitDate(tr.select("td").get(1).text());
        	sp.setSplitRatio(tr.select("td").get(2).text());
        	tzSfSplitMapper.insertSelective(sp);
        }
	}

	

}
