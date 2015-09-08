package com.thinkgem.jeesite.modules.fund.spider.temp;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.thinkgem.jeesite.common.utils.JsonOperatorUtil;
import com.thinkgem.jeesite.common.utils.TimeUtils;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundInfo;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundMember;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundNv;
import com.thinkgem.jeesite.modules.fund.spider.core.craw.HttpClientCrawlerImpl;
import com.thinkgem.jeesite.modules.fund.spider.http.CrawlResult;
import com.thinkgem.jeesite.modules.fund.spider.http.Url;

public class Simu_ProductImpl{
	
	//private static TsFundInfoDao tsFundInfoDao = SpringContextHolder.getBean(TsFundInfoDao.class);
	//private static TsFundNvDao tsFundNvDao = SpringContextHolder.getBean(TsFundNvDao.class);
	
	public static int item_count = 0;
	
	public void process(){
		//process("http://dc.simuwang.com/product/HF000006TO.html");
	}
	public void process(TsFundInfo tsFundInfo){
		// 负责抓取到的文件的存储
		//ISave<String> iSave = new SaveImplToFile4WangYiDai(filePath);
		// 存储所有的抓取条目
		StringBuilder all_items = new StringBuilder();

		Url urlPojo = new Url(tsFundInfo.getTargetUrl());
		int have_download_page_count = 0;

		HttpClientCrawlerImpl httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo.setReadCharset("GBK"));
		CrawlResult resultPojo = httpClientCrawlerImpl.crawl();
		if (resultPojo != null) {
			String content = resultPojo.getPageContent();
			System.out.println(" size---" + content);
			TsFundInfo f = parser(content,tsFundInfo);
//			f.setFundId(tsFundInfo.getFundId());
//			f.setTargerRun("1");
//			f.setTragetTime(new Date());
//			//tsFundInfoDao.update(f);
//			// List<WangYiDaiItemPojo> list = htmlParser.parser(content);
//
//			//all_items.append(page_items);
//			// all_items.addAll(list);
//			have_download_page_count++;
		}
		System.out.println("all items size---" + item_count);
		System.out.println("已经下载了---" + have_download_page_count);
		
		//
		httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo.setUrl(tsFundInfo.getMUrl()));
		resultPojo = httpClientCrawlerImpl.crawl();
		TsFundMember m = new TsFundMember();
		
		parserMember(resultPojo.getPageContent(),m);
		

		//iSave.save(all_items.toString());
		//---下载基金数据
		urlPojo.setUrl("http://dc.simuwang.com/charts_for_mall/index_highcharts.php?type=jzdb_stock&fund_id="+tsFundInfo.getTargetCode());
		httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
		resultPojo = httpClientCrawlerImpl.crawl();
		parserFund(resultPojo.getPageContent(),tsFundInfo.getFundId());
		//System.out.println(" data---" + resultPojo.getPageContent());

		System.out.println("save successfully~");
	}
	
	public static void main(String[] args) {
		Simu_ProductImpl t = new Simu_ProductImpl();
		TsFundInfo f = new TsFundInfo();
		f.setTargetUrl("http://dc.simuwang.com/product/HF00000COK.html");
		f.setTargetCode("HF00000COK");
		t.process(f);		
	}
	
	public void parserMember(String html,TsFundMember m ) {
		//解析该json
		Document doc = Jsoup.parse(html);  
        Elements els = doc.select("div.main").get(1).select("div").get(0).select("div");
        //Element el;String []vArr;
        String v;
        
        v = els.get(0).select("img").attr("src");
        m.setMimage(v);
        
        v = els.get(1).select("input[name=personnel_id]").attr("value");
        m.setTargetCode(v);
        v = els.get(1).select("input[name=personnel_name]").attr("value");
        m.setMname(v);
        
	}
	
	
	/**净值数据; 只有累计净值*/
	public void parserFund(String html,String fid) {
		JSONObject jsonObj = JsonOperatorUtil.toJSONObject(html);
		if(jsonObj.get("data")==null  && ((JSONObject)jsonObj.get("data")).containsKey("0")){
			return;
		}
		JSONArray jsonArray = (JSONArray)((JSONObject)jsonObj.get("data")).get("0");
		for (Object json : jsonArray) {
			TsFundNv nv = new TsFundNv();
			JSONArray itemJson =(JSONArray) json;
			long times = (Long)itemJson.get(0);
			nv.setNvDate(TimeUtils.timeTrans(times, null));
			Object nav = itemJson.get(1);
			nv.setAddNav(String.valueOf(nav));
		}
	}
		
	public TsFundInfo parser(String html,TsFundInfo p ) {
		//解析该json
		Document doc = Jsoup.parse(html);  
        Elements els = doc.select("div.main").get(1).select("div.bor>div.borbblue>table>tbody>tr");
        Element el;String []vArr;
        String v;
        
        v = els.select("h1").text();
        p.setFundName(v);
        
        //
        v = els.select("td").get(1).text();
        vArr = v.replace("单位净值:※", "").replace("累计净值:※", "").split(" ");
        p.setNav(vArr[0]);
        p.setAddNav(vArr[1]);
        //
        v = els.select("td").get(2).text();
        vArr = v.replace("净值日期:", "").replace("成立日期:", "").split(" ");
        p.setNavDate(vArr[0]);
        p.setFoundationDate(vArr[1]);
        
        v = els.select("td").get(3).text();
        vArr = v.replace("投资顾问:", "").replace("投资经理:", "").split(" ");
        p.setMName(vArr[1]);
        p.setOrgName(vArr[0]);
        
        Elements mels = els.select("td").get(3).select("a");
        for(Element mel : mels){
        	if(mel.attr("href").indexOf("mod=company")>-1)
        		p.setOrgUrl(mel.attr("href"));
        	else
        		p.setMUrl(mel.attr("href"));
        }
        
        v = els.select("td").get(4).text();
        vArr = v.replace("运行状态:", "").split(" ");
        p.setStatusCn(vArr[0]);
        
        //基本资料
        els = doc.select("div.main").get(1).select("div.w740>div>table").get(2).select("tbody>tr");
        
        v = els.get(0).select("td").get(1).text();
        p.setFundFullName(v);
        //
        v = els.get(1).select("td").get(1).text();
        p.setFoundationDate(v);
        v = els.get(1).select("td").get(3).text();
        p.setType(v);
        
        //投资策略
        v = els.get(2).select("td").get(1).text();
        p.setInvestmentStrategy(v);
        v = els.get(2).select("td").get(3).text();
       // p.setType(v);
        
        v = els.get(7).select("td").get(1).text();
        p.setRgF(v);
        v = els.get(7).select("td").get(3).text();
        p.setGlF(v);
        
        v = els.get(8).select("td").get(1).text();
        p.setShF(v);
        //v = els.get(8).select("td").get(3).text();
        //p.setType(v);
        
		return p;
	}

	

}
