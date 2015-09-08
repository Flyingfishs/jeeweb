package com.thinkgem.jeesite.modules.tz.spider.http;

/**
 * ץȡ���ķ�װ
 * 
 * @author zel
 * 
 */
public class CrawlResult {
	@Override
	public String toString() {
		return "CrawlResult [httpStatuCode=" + httpStatuCode
				+ ", isSuccess=" + isSuccess + ", pageContent=" + pageContent
				+ "]";
	}

	private boolean isSuccess;
	private String pageContent;
	private int httpStatuCode;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getPageContent() {
		return pageContent;
	}

	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}

	public int getHttpStatuCode() {
		return httpStatuCode;
	}

	public void setHttpStatuCode(int httpStatuCode) {
		this.httpStatuCode = httpStatuCode;
	}

}
