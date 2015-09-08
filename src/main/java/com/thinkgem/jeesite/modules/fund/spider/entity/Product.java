package com.thinkgem.jeesite.modules.fund.spider.entity;

public class Product extends Product1 {
	
	private String desc;
	private String bank;
	private String bankNo;
	private String openDate;
	
	private String rgRate;//认购费率
	private String glRate;//管理费
	private String shRate;//赎回费
	private String fdglRate;//浮动管理费率

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getRgRate() {
		return rgRate;
	}

	public void setRgRate(String rgRate) {
		this.rgRate = rgRate;
	}

	public String getGlRate() {
		return glRate;
	}

	public void setGlRate(String glRate) {
		this.glRate = glRate;
	}

	public String getShRate() {
		return shRate;
	}

	public void setShRate(String shRate) {
		this.shRate = shRate;
	}

	public String getFdglRate() {
		return fdglRate;
	}

	public void setFdglRate(String fdglRate) {
		this.fdglRate = fdglRate;
	}

}
