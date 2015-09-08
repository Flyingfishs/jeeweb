package com.thinkgem.jeesite.modules.fund.spider.temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.thinkgem.jeesite.common.utils.JsonOperatorUtil;
import com.thinkgem.jeesite.common.utils.SpringContextHolder;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundInfoDao;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundInfo;
import com.thinkgem.jeesite.modules.fund.spider.core.craw.HttpClientCrawlerImpl;
import com.thinkgem.jeesite.modules.fund.spider.core.parser.IHtmlParser;
import com.thinkgem.jeesite.modules.fund.spider.http.CrawlResult;
import com.thinkgem.jeesite.modules.fund.spider.http.Url;

public class SimuListImpl implements IHtmlParser{
	
	private static TsFundInfoDao tsFundInfoDao = SpringContextHolder.getBean(TsFundInfoDao.class);
	
	public static int item_count = 0;
	public static String url = "http://dc.simuwang.com/api/api_pep.php";
	public static int max_page_number = 2;
	
	public void processList(){
		// 负责抓取到的文件的存储
		//ISave<String> iSave = new SaveImplToFile4WangYiDai(filePath);
		// 存储所有的抓取条目
		//StringBuilder all_items = new StringBuilder();

		Url urlPojo = new Url(url);
		Map<String, Object> parasMap = new HashMap<String, Object>();
		int have_download_page_count = 0;
		Set<String> uniqSet = new HashSet<String>();

		for (int pageNumber = 1; pageNumber <= max_page_number; pageNumber++) {
			System.out.println("pageNumber:"+pageNumber);
			parasMap.put("page_index", pageNumber);
			parasMap.put("page_size", "20");
			parasMap.put("fund_type_id", "1,6,3,4,8,2,7,5");
			parasMap.put("register_flag", "0");
			parasMap.put("fund_status", "2");
			parasMap.put("sort_name", "ret_ytd");
			urlPojo.setParasMap(parasMap);

			HttpClientCrawlerImpl httpClientCrawlerImpl = new HttpClientCrawlerImpl(urlPojo);
			CrawlResult resultPojo = httpClientCrawlerImpl.crawl();

			if (uniqSet.contains(resultPojo.getPageContent())) {
				System.out.println("碰到重复，代表已抓取完成!");
				break;
			} else {
				uniqSet.add(resultPojo.getPageContent());
			}
			if (resultPojo != null) {
				String content = resultPojo.getPageContent();
				System.out.println(" size---" + content);
				parser(content);
				have_download_page_count++;
			}
		}
		System.out.println("all items size---" + item_count);
		System.out.println("已经下载了---" + have_download_page_count);

		//iSave.save(all_items.toString());

		System.out.println("save successfully~");
	}
	
	public static void main(String[] args) {
		SimuListImpl t = new SimuListImpl();
		t.processList();
	}
		
	@Override
	public List<TsFundInfo> parser(String html) {
		List<TsFundInfo> datas = new ArrayList<TsFundInfo>();
		JSONObject jsonObj = JsonOperatorUtil.toJSONObject(html);
		if(jsonObj.get("data")==null){
			return null;
		}
		JSONArray jsonArray = JsonOperatorUtil.toJSONArray(jsonObj.get("data").toString());
		for (Object json : jsonArray) {
			JSONObject itemJson = (JSONObject) json;
			TsFundInfo f = new TsFundInfo();
			f.setTargetType("simu");
			f.setFundName(itemJson.get("fund_short_name")+"");
			f.setFundFullName(itemJson.get("fund_short_name")+"");
			if(itemJson.get("futures_type")!=null)
			f.setType(itemJson.get("futures_type")+"");
			f.setStatusCn(itemJson.get("fund_status")+"");
			f.setNav(itemJson.get("nav")+"");
			f.setNavDate(itemJson.get("fund_status")+"");
			f.setTargetCode(itemJson.get("fund_id")+"");
			f.setTargetUrl("http://dc.simuwang.com/product/"+itemJson.get("fund_id")+".html");
			f.setMName(itemJson.get("managers")+"");
			//
			TsFundInfo f0 = tsFundInfoDao.getByEnt(f);
			if(StringUtils.isEmpty(f0)){
				f.preInsert();
				tsFundInfoDao.insert(f);
			}else{
				f0.setNav(f.getNav());
				//f0.setAddNav(f.getAddNav());
				//f0.setNavDate(f.getNavDate());
				tsFundInfoDao.update(f0);
			}
		}
		return datas;
	}

	

}
