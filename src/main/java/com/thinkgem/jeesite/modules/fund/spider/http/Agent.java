package com.thinkgem.jeesite.modules.fund.spider.http;

import java.util.Random;

public class Agent {
	
	private static String currAgent;
	private static Random random = new Random();
	
	//agent列表
	private static final String [] agents = new String []{
		//google爬虫
		"Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)",
		"Googlebot/2.1 (+http://www.googlebot.com/bot.html)",
		"Googlebot/2.1 (+http://www.google.com/bot.html)",
		//百度
		"Baiduspider+(+http://www.baidu.com/search/spider.htm)",
		//雅虎爬虫（分别是雅虎中国和美国总部的爬虫）
		"Mozilla/5.0 (compatible; Yahoo! Slurp China; http://misc.yahoo.com.cn/help.html)",
		"Mozilla/5.0 (compatible; Yahoo! Slurp; http://help.yahoo.com/help/us/ysearch/slurp)",
		//即刻搜索爬虫
		"Mozilla/5.0 (compatible; JikeSpider; +http://shoulu.jike.com/spider.html)",
		//有道
		"Mozilla/5.0 (compatible; YodaoBot/1.0; http://www.yodao.com/help/webmaster/spider/; )",
		//搜搜
		"Sosospider+(+http://help.soso.com/webspider.htm)",
		"Sosoimagespider+(+http://help.soso.com/soso-image-spider.htm)",
		//搜狗爬虫
		"Sogou Web Sprider(compatible; Mozilla 4.0; MSIE 6.0; Windows NT 5.1; SV1; Avant Browser; InfoPath.1; .NET CLR 2.0.50727; .NET CLR1.1.4322)",
		"Sogou web spider/4.0(+http://www.sogou.com/docs/help/webmasters.htm#07)",
		//bing
		"Mozilla/5.0 (compatible; bingbot/2.0; +http://www.bing.com/bingbot.htm)",
		//MSN爬虫
		"msnbot/1.1 (+http://search.msn.com/msnbot.htm)",
		
		"Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9) Gecko Minefield/3.0",
		"Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2) Gecko/20100115 Firefox/3.6",
		"Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0; MATP; MATP)",
		"Mozilla/5.0 (Windows NT 6.1; rv:22.0) Gecko/20100101 Firefox/22.0')",
		"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.22 (KHTML, like Gecko) Chrome/25.0.1364.160 Safari/537.22",
		"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36",
		"Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.1.2)",
		
	};
	
	/**
	 * 获取agent;
	 * @return
	 */
	public static String getUserAgent(){
		int agentIndex=0;
		String agent;
		do{
			agentIndex = random.nextInt(agents.length);
			agent = agents[agentIndex];
		}while(currAgent==agent);
		System.out.println("agentIndex:"+agentIndex +" agent："+agent);
		currAgent = agent;
		return agent;
	}
}
