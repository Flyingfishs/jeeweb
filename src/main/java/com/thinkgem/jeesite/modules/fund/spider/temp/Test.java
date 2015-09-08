package com.thinkgem.jeesite.modules.fund.spider.temp;

import java.util.Map;

import com.thinkgem.jeesite.common.mapper.JsonMapper;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String html = "var SmlsjzDateObj={cats:['基金净值','累计净值'],hisNavCats:[],latestJzInfo:['','',''],jzdw:[1],navList:['2010,6,7,1.0,1.0','2015,6,31,3.9504,8.4507'],navStrListTenDay:[],navStrListOneMonth:[],navStrListThreeMonth:[],navStrListSixMonth:[],navStrListOneYear:[],navStrListJnylDay:[],jlbdStrList:[]};var SmlsjzDateObj_P00511=SmlsjzDateObj;";
		html = html.substring(html.indexOf("{"),html.lastIndexOf("}")+1);
		@SuppressWarnings("unchecked")
		Map<String,Object> m = JsonMapper.getInstance().fromJson(html, Map.class);
		Object[] navList = (Object[]) m.get("navList");
		System.out.println(m.get("navList"));

	}

}
