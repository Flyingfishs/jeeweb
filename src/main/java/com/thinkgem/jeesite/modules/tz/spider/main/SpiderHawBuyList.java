package com.thinkgem.jeesite.modules.tz.spider.main;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.fund.spider.core.craw.HttpClientCrawlerImpl;
import com.thinkgem.jeesite.modules.fund.spider.http.CrawlResult;
import com.thinkgem.jeesite.modules.fund.spider.http.Url;
import com.thinkgem.jeesite.modules.tz.dao.TzSfInfoMapper;
import com.thinkgem.jeesite.modules.tz.entity.TzSfInfo;
import com.thinkgem.jeesite.modules.tz.entity.TzSfInfoExample;

@Service
@Transactional(readOnly = true)
public class SpiderHawBuyList{
	

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	TzSfInfoMapper tzSfInfoMapper;
	
	private String url = "http://simu.howbuy.com/board.htm";
	private int max_page_number = 1000;

	public int getMax_page_number() {
		return max_page_number;
	}

	public void setMax_page_number(int max_page_number) {
		this.max_page_number = max_page_number;
	}

	
	//@Transactional(readOnly = true)
	public void processList(){
		Map<String, Object> parasMap = new HashMap<String, Object>();
		processList(parasMap,1);
		processList(parasMap,0);
	}
	
	//@Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次    
	private void processList(Map<String, Object> parasMap ,int isReal){

		Url urlPojo = new Url(url);
		
		int have_download_page_count = 0;

		int errorCount = 0;
		int item_count = 0;
		
		for (int pageNumber = 1; pageNumber <= max_page_number; pageNumber++) {
			if(errorCount>10){
				logger.error("spider.error.count 大于20次,退出本次任务");
				break;
			}
			have_download_page_count ++;
			parasMap.put("page", pageNumber);
			parasMap.put("gzkxd", isReal);
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
				List<TzSfInfo> page_items = parser(content);
				item_count += page_items.size();
				
				for(TzSfInfo f : page_items){
					//f.preInsert();
					TzSfInfoExample sfEx = new TzSfInfoExample();
					sfEx.createCriteria().andTargetUrlEqualTo(f.getTargetUrl());
					TzSfInfo f0 = tzSfInfoMapper.selectByInfoExample(sfEx);
					if(StringUtils.isEmpty(f0)){
						f.setIsReal(isReal);//设置估值是否可信
						tzSfInfoMapper.insertSelective(f);
					}else{
						//TzSfInfo f0 = sfList.get(0);
						f0.setNav(f.getNav());
						f0.setNavDate(f.getNavDate());
						tzSfInfoMapper.updateByPrimaryKeySelective(f0);
					}
				}

				have_download_page_count++;
			}
		}
		logger.info("all items size: {} ",item_count);
		logger.info("have_download_page_count: {} ",have_download_page_count);
		logger.info("save successfully~");
	}

		
	private List<TzSfInfo> parser(String html) {
		List<TzSfInfo> datas = new ArrayList<TzSfInfo>();
		//解析该json
		Document doc = Jsoup.parse(html);  
        Elements linksElements = doc.select("table#spreadDetails>tbody>tr"); 
        Element el;int i = 0;
        //以上代码的意思是 找id为“page”的div里面   id为“content”的div里面   id为“main”的div里面   class为“left”的div里面   id为“recommend”的div里面ul里面li里面a标签  
        for (Element tr:linksElements) {
        	//System.out.println("tr: "+tr.text());
        	TzSfInfo p = new TzSfInfo();
        	for(Element td :tr.select("td")){
        		i = td.siblingIndex();
        		//System.out.println(i+ "  td: "+td.text());
        		String v = td.text();
        		if(i==1){
        			el = td.select("input").first();
        			p.setFundCode(el.attr("code"));
        			p.setFundName(el.attr("showname"));
        			p.setTargetUrl(org.springframework.util.StringUtils.trimAllWhitespace(el.attr("url")));
        		}else{
        			switch(i){
        			case 5:
        				p.setFundFullName(v);
        			case 7:
        				p.setFundType(v);
        			case 9:
        				p.setNav(StringUtils.trimXStr(v));
        			case 11:
        				//p.setAddNav(v);
        			case 13:
        				p.setNavDate(StringUtils.trimXStr(v));
        			case 21:
        				p.setTargetOrg(v);
        				if(td.select("a")!=null){
        					p.setTargetOrgUrl(td.select("a").attr("href"));
        				}
        			case 23:
        				p.setTargetManager(v);
        				if(td.select("a")!=null){
        					p.setTargetManagerUrl(td.select("a").attr("href"));
        				}
        			case 25:
        				p.setFundationDate(v);
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
