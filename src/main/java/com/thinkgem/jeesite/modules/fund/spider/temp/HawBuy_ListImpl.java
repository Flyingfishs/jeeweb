package com.thinkgem.jeesite.modules.fund.spider.temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thinkgem.jeesite.common.utils.SpringContextHolder;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundInfoDao;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundInfo;
import com.thinkgem.jeesite.modules.fund.spider.core.craw.HttpClientCrawlerImpl;
import com.thinkgem.jeesite.modules.fund.spider.http.CrawlResult;
import com.thinkgem.jeesite.modules.fund.spider.http.Url;

public class HawBuy_ListImpl{
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	private static TsFundInfoDao tsFundInfoDao = SpringContextHolder.getBean(TsFundInfoDao.class);
	
	
	public static String url = "http://simu.howbuy.com/board.htm";
	public static int max_page_number = 1;
	
	//@Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次    
	public void processList(){

		Url urlPojo = new Url(url);
		Map<String, Object> parasMap = new HashMap<String, Object>();
		int have_download_page_count = 0;

		int errorCount = 0;
		int item_count = 0;
		
		for (int pageNumber = 1; pageNumber <= max_page_number; pageNumber++) {
			if(errorCount>20){
				logger.error("spider.error.count 大于20次,退出本次任务");
				break;
			}
			have_download_page_count ++;
			parasMap.put("page", pageNumber);
			parasMap.put("gzkxd", "1");
			parasMap.put("orderType", "Desc");
			urlPojo.setParasMap(parasMap);

			HttpClientCrawlerImpl httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
			CrawlResult resultPojo = httpClientCrawlerImpl.crawl();
			if (resultPojo == null) {
				errorCount++;
				continue;
			}
			if (resultPojo != null) {
				String content = resultPojo.getPageContent();
				List<TsFundInfo> page_items = parser(content);
				item_count += page_items.size();
				
				for(TsFundInfo f : page_items){
					f.preInsert();
					f.setTargetType("hawbuy");
					TsFundInfo f0 = tsFundInfoDao.getByEnt(f);
					if(StringUtils.isEmpty(f0)){
						tsFundInfoDao.insert(f);
					}else{
						f0.setNav(f.getNav());
						f0.setAddNav(f.getAddNav());
						f0.setNavDate(f.getNavDate());
						tsFundInfoDao.update(f0);
					}
				}

				have_download_page_count++;
			}
		}
		logger.info("all items size: {} ",item_count);
		logger.info("have_download_page_count: {} ",have_download_page_count);
		logger.info("save successfully~");
	}
	
	public static void main(String[] args) {
		HawBuy_ListImpl t = new HawBuy_ListImpl();
		t.processList();
	}
		
	public List<TsFundInfo> parser(String html) {
		List<TsFundInfo> datas = new ArrayList<TsFundInfo>();
		//解析该json
		Document doc = Jsoup.parse(html);  
        Elements linksElements = doc.select("table#spreadDetails>tbody>tr"); 
        Element el;int i = 0;
        //以上代码的意思是 找id为“page”的div里面   id为“content”的div里面   id为“main”的div里面   class为“left”的div里面   id为“recommend”的div里面ul里面li里面a标签  
        for (Element tr:linksElements) {
        	//System.out.println("tr: "+tr.text());
        	TsFundInfo p = new TsFundInfo();
        	for(Element td :tr.select("td")){
        		i = td.siblingIndex();
        		//System.out.println(i+ "  td: "+td.text());
        		String v = td.text();
        		if(i==1){
        			el = td.select("input").first();
        			p.setTargetCode(el.attr("code"));
        			p.setFundName(el.attr("showname"));
        			p.setTargetUrl(org.springframework.util.StringUtils.trimAllWhitespace(el.attr("url")));
        		}else{
        			switch(i){
        			case 5:
        				p.setFundFullName(v);
        			case 7:
        				p.setType(v);
        			case 9:
        				p.setNav(v);
        			case 11:
        				p.setAddNav(v);
        			case 13:
        				p.setNavDate(v);
        			case 21:
        				p.setOrgName(v);
        				if(td.select("a")!=null){
        					p.setOrgUrl(td.select("a").attr("href"));
        				}
        			case 23:
        				p.setMName(v);
        				if(td.select("a")!=null){
        					p.setMUrl(td.select("a").attr("href"));
        				}
        			case 25:
        				p.setFoundationDate(v);
        			}
        		}
        	}
        	if(StringUtils.isNoneBlank(p.getTargetUrl()) && StringUtils.isNoneBlank(p.getFundName())){
        		datas.add(p);
        	}
        	//System.out.println(p.getTargetOrgurl() +"\t"+ p.getType() +"\t"+ p.getFundName());
        }  
		return datas;
	}

	

}
