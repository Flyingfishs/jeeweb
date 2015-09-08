package com.thinkgem.jeesite.modules.fund.spider.core;

import com.thinkgem.jeesite.modules.fund.spider.temp.HawBuy_ListImpl;


public class SpiderManager {

	public static void main(String[] args) {

	}
	
	HawBuy_ListImpl hawInpl = new HawBuy_ListImpl();
	
	/**
	 * 执行列表爬取
	 */
	public void runList(){
		hawInpl.max_page_number=1000;
		hawInpl.processList();
	}

}
