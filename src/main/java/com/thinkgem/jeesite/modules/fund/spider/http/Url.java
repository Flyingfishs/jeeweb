package com.thinkgem.jeesite.modules.fund.spider.http;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.thinkgem.jeesite.modules.fund.spider.http.enums.HttpMethodEnum;
import com.thinkgem.jeesite.modules.fund.spider.http.enums.TaskLevel;

/**
 * url
 * 
 * @author zel
 * 
 */
public class Url {
	private Map<String, Object> parasMap;
	private HttpMethodEnum httpMethodEnum = HttpMethodEnum.GET;
	private String readCharset;

	public HttpMethodEnum getHttpMethodEnum() {
		return httpMethodEnum;
	}

	public void setHttpMethodEnum(HttpMethodEnum httpMethodEnum) {
		this.httpMethodEnum = httpMethodEnum;
	}

	public Map<String, Object> getParasMap() {
		return parasMap;
	}

	public void setParasMap(Map<String, Object> parasMap) {
		this.parasMap = parasMap;
	}

	public Url(String url) {
		this.url = url;
	}

	public Url(String url, Map<String, Object> parasMap) {
		this.url = url;
		this.parasMap = parasMap;
	}
	

	public String getReadCharset() {
		if(readCharset==null|| "".equals(readCharset)){
			readCharset = "UTF-8";
		}
		return readCharset;
	}

	public Url setReadCharset(String readCharset) {
		this.readCharset = readCharset;
		return this;
	}

	@Override
	public String toString() {
		return "UrlPojo [taskLevel=" + taskLevel + ", url=" + url + "]";
	}

	public Url(String url, TaskLevel taskLevel) {
		this.url = url;
		this.taskLevel = taskLevel;
	}

	private String url;
	private TaskLevel taskLevel = TaskLevel.MIDDLE;

	public String getUrl() {
		return StringUtils.trimAllWhitespace(url);
	}

	public Url setUrl(String url) {
		this.url = url;
		return this;
	}

	public TaskLevel getTaskLevel() {
		return taskLevel;
	}

	public void setTaskLevel(TaskLevel taskLevel) {
		this.taskLevel = taskLevel;
	}

	public HttpURLConnection getConnection() {
		try {
			URL url = new URL(this.url);
			URLConnection connection = url.openConnection();
			if (connection instanceof HttpURLConnection) {
				return (HttpURLConnection) connection;
			} else {
				throw new Exception("connection is errr!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getHost() {
		try {
			URL url = new URL(this.url);
			return url.getHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
