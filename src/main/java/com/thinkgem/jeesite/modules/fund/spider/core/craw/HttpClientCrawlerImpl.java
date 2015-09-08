package com.thinkgem.jeesite.modules.fund.spider.core.craw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.message.BasicHeader;

import com.thinkgem.jeesite.modules.fund.spider.http.Agent;
import com.thinkgem.jeesite.modules.fund.spider.http.CrawlResult;
import com.thinkgem.jeesite.modules.fund.spider.http.HttpClientManager;
import com.thinkgem.jeesite.modules.fund.spider.http.Url;
import com.thinkgem.jeesite.modules.fund.spider.http.enums.HttpMethodEnum;

public class HttpClientCrawlerImpl implements ICrawler {
	private Url urlPojo;

	public Url getUrlPojo() {
		return urlPojo;
	}

	public void setUrlPojo(Url urlPojo) {
		this.urlPojo = urlPojo;
	}

	public void init() {
		System.out.println("init successfully!");
	}

	public HttpClientCrawlerImpl(Url urlPojo) {
		this.urlPojo = urlPojo;
	}

	/**
	 * 传入加入参数post参数的url pojo
	 */
	@Override
	public CrawlResult crawl() {
		if (urlPojo == null) {
			return null;
		}
		CrawlResult crawlResultPojo = new CrawlResult();
		CloseableHttpResponse response1 = null;
		BufferedReader br = null;
		try {
			RequestBuilder rb = null;
			if (urlPojo.getHttpMethodEnum() == HttpMethodEnum.GET) {
				rb = RequestBuilder.get().setUri(new URI(urlPojo.getUrl()));
			} else {
				rb = RequestBuilder.post().setUri(new URI(urlPojo.getUrl()));
			}
			Map<String, Object> parasMap = urlPojo.getParasMap();
			if (parasMap != null) {
				for (Entry<String, Object> entry : parasMap.entrySet()) {
					rb.addParameter(entry.getKey(), entry.getValue().toString());
				}
			}
			
			rb.setHeader(new BasicHeader("User-Agent", Agent.getUserAgent()));
			
			HttpUriRequest httpRequest = rb.build();
			response1 = HttpClientManager.getClient().execute(httpRequest);
			HttpEntity entity = response1.getEntity();
			InputStreamReader isr = new InputStreamReader(entity.getContent(),urlPojo.getReadCharset());
			br = new BufferedReader(isr);

			String line = null;
			StringBuilder stringBuilder = new StringBuilder();
			while ((line = br.readLine()) != null) {
				stringBuilder.append(line + "\n");
			}
			crawlResultPojo.setSuccess(true);
			crawlResultPojo.setPageContent(decode(stringBuilder.toString()));
			return crawlResultPojo;
		} catch (Exception e) {
			e.printStackTrace();
			crawlResultPojo.setSuccess(false);
		} finally {
			if (response1 != null) {
				try {
					response1.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

		return crawlResultPojo;
	}
	
	public static String decode(String unicodeStr) {
		if (unicodeStr == null) {
			return null;
		}
		StringBuffer retBuf = new StringBuffer();
		int maxLoop = unicodeStr.length();
		for (int i = 0; i < maxLoop; i++) {
			if (unicodeStr.charAt(i) == '\\') {
				if ((i < maxLoop - 5)
						&& ((unicodeStr.charAt(i + 1) == 'u') || (unicodeStr
								.charAt(i + 1) == 'U')))
					try {
						retBuf.append((char) Integer.parseInt(
								unicodeStr.substring(i + 2, i + 6), 16));
						i += 5;
					} catch (NumberFormatException localNumberFormatException) {
						retBuf.append(unicodeStr.charAt(i));
					}
				else
					retBuf.append(unicodeStr.charAt(i));
			} else {
				retBuf.append(unicodeStr.charAt(i));
			}
		}
		return retBuf.toString();
	}

	public static void main(String[] args) throws Exception {
		String s= "\u8bf7\u53d1\u9001\u90ae\u4ef6\u5230";
		s = decode(s);
		System.out.println(s);
		
		String url = "http://www.wangdaizhijia.com/front_select-plat";
		Url urlPojo = new Url(url);
		urlPojo.setHttpMethodEnum(HttpMethodEnum.POST);
		HttpClientCrawlerImpl httpClientCrawlerImpl = new HttpClientCrawlerImpl(
				urlPojo);
		Map<String, Object> parasMap = new HashMap<String, Object>();

		parasMap.put("currPage", 1);
		parasMap.put("params", "");
		parasMap.put("sort", 0);
		urlPojo.setParasMap(parasMap);
		CrawlResult resultPojo = httpClientCrawlerImpl.crawl();
		if (resultPojo != null) {
			System.out.println(resultPojo);
		}
	}
}
