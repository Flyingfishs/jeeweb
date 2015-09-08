package com.thinkgem.jeesite.modules.tz.spider.http;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

/**
 * http client manager,负责httpclient实例的供给，包括单例、池管理
 * 
 * @author zel
 * 
 */
public class HttpClientManager {
	/**
	 * 饿汉式的单例模式 复杂的设计模式部分，会在后续专门来讲
	 */
	public static CloseableHttpClient httpclient = HttpClients.custom().build();
	public static HttpClientBuilder hb = HttpClients.custom();

	public static CloseableHttpClient getClient() {
		return httpclient;
	}
	
	public static HttpClientBuilder custom() {
		return hb;
	}
	
	/**
DefaultHttpClient client = new DefaultHttpClient();
HttpHost proxy = new HttpHost(ip, port);
client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
	 */
	
}
