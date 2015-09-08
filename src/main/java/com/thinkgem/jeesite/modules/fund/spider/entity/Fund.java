package com.thinkgem.jeesite.modules.fund.spider.entity;

/**
 * 净值数据
 * @author giles
 *
 */
public class Fund {
	/**日期*/
	private String date;
	/**单位净值*/
	private String dwjz;
	/**累计净值*/
	private String ljjz;
	
	private String zdRate;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDwjz() {
		return dwjz;
	}
	public void setDwjz(String dwjz) {
		this.dwjz = dwjz;
	}
	public String getLjjz() {
		return ljjz;
	}
	public void setLjjz(String ljjz) {
		this.ljjz = ljjz;
	}
	public String getZdRate() {
		return zdRate;
	}
	public void setZdRate(String zdRate) {
		this.zdRate = zdRate;
	}
	
	

}
