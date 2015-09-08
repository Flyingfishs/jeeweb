package com.thinkgem.jeesite.modules.fund.spider.temp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thinkgem.jeesite.common.mapper.JsonMapper;
import com.thinkgem.jeesite.common.utils.SpringContextHolder;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundInfoDao;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundMemberDao;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundMemberIndexDao;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundNvDao;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundOrgDao;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundOrgIndexDao;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundInfo;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundMember;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundMemberIndex;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundNv;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundOrg;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundOrgIndex;
import com.thinkgem.jeesite.modules.fund.spider.core.craw.HttpClientCrawlerImpl;
import com.thinkgem.jeesite.modules.fund.spider.http.CrawlResult;
import com.thinkgem.jeesite.modules.fund.spider.http.RegexUtil;
import com.thinkgem.jeesite.modules.fund.spider.http.Url;

public class HawBuy_ProductImpl {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	private static TsFundInfoDao tsFundInfoDao = SpringContextHolder.getBean(TsFundInfoDao.class);
	private static TsFundNvDao tsFundNvDao = SpringContextHolder.getBean(TsFundNvDao.class);
	private static TsFundOrgDao tsFundOrgDao = SpringContextHolder.getBean(TsFundOrgDao.class);
	private static TsFundMemberDao tFundMemberDao = SpringContextHolder.getBean(TsFundMemberDao.class);
	
	private static TsFundMemberIndexDao tsFundMemberIndexDao = SpringContextHolder.getBean(TsFundMemberIndexDao.class);
	private static TsFundOrgIndexDao tsFundOrgIndexDao = SpringContextHolder.getBean(TsFundOrgIndexDao.class);
	
	//http://simu.howbuy.com/zexi/P00511/ :泽熙3期 
	//特殊数据：http://simu.howbuy.com/tangyin/M00131/ 多基金经理
	public void process(TsFundInfo tsFundInfo){
		
		tsFundInfo.setTargetUrl(StringUtils.trimAll(tsFundInfo.getTargetUrl()));
		Url urlPojo = new Url(tsFundInfo.getTargetUrl());
		
		TsFundInfo f = null;
		HttpClientCrawlerImpl httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
		CrawlResult resultPojo = httpClientCrawlerImpl.crawl();
		if (resultPojo != null) {
			f = parser(resultPojo.getPageContent(),tsFundInfo);
			f.setFundId(tsFundInfo.getFundId());
			f.setTargerRun("1");
			f.setTragetTime(new Date());
			if(true){//test
				return ;
			}
			
			//抓取历史净值
			urlPojo.setUrl(tsFundInfo.getTargetUrl()+"lsjz");
			httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
			resultPojo = httpClientCrawlerImpl.crawl();
			String lsjzUrl = RegexUtil.pattern("(<script type=\"text/javascript\" src=\"(http://static.howbuy.com/min/f=/upload/auto/script/fund/smjjlsjz_.*?.js)\"></script>)", resultPojo.getPageContent());
			
			//--------//
			urlPojo.setUrl(lsjzUrl);
			httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
			resultPojo = httpClientCrawlerImpl.crawl();
			parserFund(resultPojo.getPageContent(),tsFundInfo);
			
			//Org;
			TsFundOrg fo=null;
			if(StringUtils.isNotEmpty(tsFundInfo.getOrgUrl())){
				fo = new TsFundOrg();
				urlPojo.setUrl(tsFundInfo.getOrgUrl());
				httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
				resultPojo = httpClientCrawlerImpl.crawl();
				fo.setTragetUrl(tsFundInfo.getOrgUrl());
				//---
				fo = tsFundOrgDao.getByEnt(fo);
				if(fo==null){
					fo = new TsFundOrg();
					fo.setTragetUrl(tsFundInfo.getOrgUrl());
				}else{
				}
				parserOrg(resultPojo.getPageContent(),fo);
				
			}
			//同一个基金会存在对个基金经理
			//
			List<TsFundMember> fms = new ArrayList<TsFundMember>();
			//manage;
			if(StringUtils.isNotEmpty(tsFundInfo.getMUrl())){
				String[] urls = tsFundInfo.getMUrl().split(",");
				for(int i=0;i<urls.length;i++){
					urlPojo.setUrl(urls[i]);
					httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
					resultPojo = httpClientCrawlerImpl.crawl();
					
					TsFundMember fm = new TsFundMember();
					fm.setTargetUrl(urls[i]);
					fm =  tFundMemberDao.getByEnt(fm);
					if(fm==null){
						fm = new TsFundMember();
						fm.setTargetUrl(urls[i]);
					}
					
					parserManager(resultPojo.getPageContent(),fm);
					fm.setFundId(f.getFundId());
					
					fms.add(fm);
					
					//设置公司简介
					fo.setProfile(fm.getOrgDesc());
				}
				
			}
			
			//--org
			if(fo!=null && StringUtils.isNotEmpty(fo.getOrgName())){
				if(null==fo.getOrgId()){
					fo.preInsert();
					fo.setIsNewRecord(true);
					tsFundOrgDao.insert(fo);
				}else{
					fo.preUpdate();
					tsFundOrgDao.update(fo);
				}
				f.setOrgId(fo.getOrgId());
				//fm.setOrgId(fo.getOrgId());
				//设置
				TsFundOrgIndex orgIndex = new TsFundOrgIndex();
				orgIndex.setOrgId(fo.getOrgId());
				orgIndex.setFundId(f.getFundId());
				
				orgIndex = tsFundOrgIndexDao.getByEnt(orgIndex);
				if(orgIndex!=null){
				}else{
					orgIndex = new TsFundOrgIndex();
					orgIndex.setOrgId(fo.getOrgId());
					orgIndex.setFundId(f.getFundId());
					orgIndex.setDispindex("1");
					orgIndex.preInsert();
					
					tsFundOrgIndexDao.insert(orgIndex);
				}
			}
			
			
			for(TsFundMember fm :fms){
				if(fm!=null && StringUtils.isNotEmpty(fm.getMname())){
					
					if(fo!=null && StringUtils.isNotEmpty(StringUtils.isNotEmpty(fm.getMname())))
						fm.setOrgId(fo.getOrgId());//设置人员所属公司
					
					if(null==fm.getMId()){
						fm.preInsert();
						fm.setIsNewRecord(true);
						tFundMemberDao.insert(fm);
					}else{
						fm.preUpdate();
						tFundMemberDao.update(fm);
					}
					//--设置
					TsFundMemberIndex memberIndex = new TsFundMemberIndex();
					memberIndex.setFundId(f.getFundId());
					memberIndex.setMId(fm.getMId());
					
					memberIndex = tsFundMemberIndexDao.getByEnt(memberIndex);
					if(memberIndex!=null){
						
					}else{
						memberIndex = new TsFundMemberIndex();
						memberIndex.setFundId(f.getFundId());
						memberIndex.setMId(fm.getMId());
						memberIndex.setDispindex("1");
						memberIndex.preInsert();
						tsFundMemberIndexDao.insert(memberIndex);
						
					}
					
				}
			}
			
			tsFundInfoDao.update(f);
		}
		logger.debug("save successfully~");
	}
	
	/**
	 * 分析机构
	 * @param html
	 * @param fo
	 */
	private void parserOrg(String html, TsFundOrg fo) {
		if(StringUtils.isEmpty(html)){
			return;
		}
		Document doc = Jsoup.parse(html);  
        Elements els = doc.select("div.main");
        String v;
        //公司介绍;
        Elements trs =  els.select("div#nTab2_Con2>div.company_item>div.people>table>tbody>tr");
        
        if(StringUtils.isEmpty(trs)){
        	logger.error("TsFundOrg not find {}",fo.getTragetUrl());
			return;
		}
        //策略
        if(null!=els.select("div.review>div.review_rt")){
        	v = els.select("div.review>div.review_rt").text();
            fo.setInvestmentIdea(v);
        }
        
        v = els.select("h2").text();
        fo.setOrgName(v);
        
        v = trs.get(0).select("td.tdlt").text();
        fo.setOrgFullName(v);
        
        v = trs.get(4).select("td.tdlt").text();
        fo.setAddress(v);
        
        v = trs.get(6).select("td.tdlt").text();
        fo.setOrgType(v);
        
	}

	/**
	 * 分析经理
	 * @param html
	 * @param fm
	 */
	private void parserManager(String html, TsFundMember fm) {
		if(StringUtils.isEmpty(html)){
			return;
		}       
        
		Document doc = Jsoup.parse(html);  
        Elements els = doc.select("div.main");
        String v;
      
        //公司介绍;
        Elements trs =  els.select("div.manager_intro>table>tbody>tr");
        
        if(StringUtils.isEmpty(trs)){
        	logger.error("TsFundMember not find {}",fm.getTargetUrl());
			return;
		}
        
        v = els.select("div.manager_name").text();
        fm.setMname(v);
        
        
        v = els.select("div.manager_pic>img").attr("src");
        fm.setMimage(v);
        
        v = trs.get(0).select("td.w3").text().replace("从业年限：", "");
        fm.setInvestmentYears(v);
        v = trs.get(0).select("td.w4").text().replace("学历：", "");
        fm.setMeducation(v);
        
        v = els.select("div.manager_info>span").text();
        fm.setDesc(v);
        
        v = els.select("div.company_desc").text();
        fm.setOrgDesc(v);
	}

	public static void main(String[] args) {
		HawBuy_ProductImpl t = new HawBuy_ProductImpl();
		TsFundInfo tsFundInfo = new TsFundInfo();
		tsFundInfo.setTargetUrl("http://simu.howbuy.com/dayan/J00895/");
		t.process(tsFundInfo);		
	}
	
	/**净值数据;*/
	public void parserFund(String html,TsFundInfo f) {
		if(StringUtils.isEmpty(html)){
			return;
		}
		html = html.substring(html.indexOf("{"),html.lastIndexOf("}")+1);
		Map<?, ?> map = JsonMapper.getInstance().fromJson(html, Map.class);
		if(!map.containsKey("navList")){
			return;
		}
		
		TsFundNv nv = new TsFundNv();
		nv.setFundId(f.getFundId());
		String lastDate = tsFundNvDao.findLastNvDate(nv);
		
		
		List<?> navList = (List<?>) map.get("navList");
		String [] dataArr;String d;
		for(int i=0;i<navList.size();i++){
			dataArr = String.valueOf(navList.get(i)).split(",");
			int month = Integer.valueOf(dataArr[1])+1;
			int day = Integer.valueOf(dataArr[2]);
			d = dataArr[0]+"-"+(month<10?"0":"")+month+"-"+(day<10?"0":"")+day;
			nv.setNvDate(d);
			nv.setNav(dataArr[3]);
			nv.setAddNav(dataArr[3]);
			if(StringUtils.isEmpty(lastDate)){ //没有日期;直接添加
				nv.preInsert();
				nv.setIsNewRecord(true);
				tsFundNvDao.insert(nv);
			}else{
				TsFundNv nv0 = tsFundNvDao.getByEnt(nv);
				if(StringUtils.isEmpty(nv0)){
					nv.preInsert();
					nv.setIsNewRecord(true);
					tsFundNvDao.insert(nv);
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
	public TsFundInfo parser(String html,TsFundInfo p ) {
		//解析该json
		Document doc = Jsoup.parse(html);  
        Elements baseEl = doc.select("div.main");
        int i = 0;
        String v;
        
        //净值地址;
        String fundUrl = RegexUtil.pattern("(<script type=\"text/javascript\" src=\"(http://static.howbuy.com/min/f=/upload/auto/script/fund/smhb_.*?.js)\"></script>)", html);
        //System.out.println(fundUrl);
        p.setNavUrl(StringUtils.trimAll(fundUrl));
        String lsjzMore = doc.select("a#jinzhi_more").first().attr("href");
        p.setNavLsUrl(StringUtils.trimAll(lsjzMore));
        
        //产品详情;
        Elements pel = baseEl.select("div#nTab2_Con2>div>div.part_a>table>tbody>tr");
        for(Element tr:pel){
        	i = tr.siblingIndex();
        	v = tr.select("td.tdpd").text();
        	System.out.println(i+" - "+tr.text() +" "+v);
        	switch(i){
			case 0:
				p.setFundFullName(v);
			case 2:
				p.setType(v);
			case 6:
				p.setAccountName(v);
			case 8:
				//p.setOpenDate(v);
			case 16:
				p.setFoundationDate(v);
			case 22:
				p.setStatusCn(v);
			}
        }
        //认购须知
        pel = baseEl.select("div#nTab2_Con3>div.instruction_box>table>tbody>tr");
        for(Element tr:pel){
        	i = tr.siblingIndex();
        	v = tr.select("td.tdleft").first().text();
        	//System.out.println(i+" - "+tr.text() +" "+v);
        	switch(i){
			case 2:
				p.setRgF(v);
			case 4:
				p.setGlF(v);
			case 6:
				p.setFgdlF(v);
			case 8:
				p.setShF(v);
			}
        }
        
        //title;
        v = baseEl.select(".trade_fund_title>h1").first().text();
        p.setFundName(v);
        
        Elements els = baseEl.select("div.trade_fund_details");
        
        //最新净值
        v = els.select("div.net>dl>dd.ftArial>span").text();
        p.setNav(v);
        
        //净值日期
        v = els.select("div.net>dl>dd").get(2).text();
        if(StringUtils.isNotEmpty(v)){
        	v = v.replace("(", "").replace(")", "");
        	p.setNavDate(v);
        }
       //累计净值
        v = els.select("div.type>ul.stock>li").first().select("span").text();
        p.setAddNav(v);
        
        //类型;
        v = els.select("div.type>ul.stock>li.ptop>span").text();
        p.setType(v);
        
        //成立日期
        v = els.select("div.type>ul.date>li").first().select("span").text();
        p.setFoundationDate(v);
        //基金公司
        v = els.select("div.type>ul.fund>li").first().select("span").text();
        if(els.select("div.type>ul.fund>li").first().select("span>a")!=null){
        	p.setOrgUrl(StringUtils.trimAll(els.select("div.type>ul.fund>li").first().select("span>a").attr("href")));
        }
        p.setOrgName(v);
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
        	p.setMUrl(url);
        }
        p.setMName(v);
        
        //分红数据;
        pel = baseEl.select("div#nTab2_Con2>div>div.part_c>div.fl>table>tbody>tr");
        for(Element tr:pel){
        	i = tr.siblingIndex();
        	//v = tr.select("td.tdleft").first().text();
        	
        }
        
      //分拆数据;
        pel = baseEl.select("div#nTab2_Con2>div>div.part_c>div.fr>table>tbody>tr");
        
        
		return p;
	}

	

}
