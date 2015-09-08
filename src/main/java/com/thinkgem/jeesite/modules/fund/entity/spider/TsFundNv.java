/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.entity.spider;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 基金净值Entity
 * @author giles
 * @version 2015-08-11
 */
public class TsFundNv extends DataEntity<TsFundNv> {
	
	private static final long serialVersionUID = 1L;
	private String fundId;		// 基金ID
	private String nvDate;		// 基金日期
	private String nav;		// 单位净值
	private String addNav;		// 累计净值
	private String nvRate;		// 涨幅
	
	public TsFundNv() {
		super();
	}

	public TsFundNv(String id){
		super(id);
	}

	@Length(min=0, max=11, message="基金ID长度必须介于 0 和 11 之间")
	public String getFundId() {
		return fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}
	
	@Length(min=0, max=30, message="基金日期长度必须介于 0 和 30 之间")
	public String getNvDate() {
		return nvDate;
	}

	public void setNvDate(String nvDate) {
		this.nvDate = nvDate;
	}
	
	@Length(min=0, max=20, message="单位净值长度必须介于 0 和 20 之间")
	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}
	
	@Length(min=0, max=20, message="累计净值长度必须介于 0 和 20 之间")
	public String getAddNav() {
		return addNav;
	}

	public void setAddNav(String addNav) {
		this.addNav = addNav;
	}
	
	@Length(min=0, max=20, message="涨幅长度必须介于 0 和 20 之间")
	public String getNvRate() {
		return nvRate;
	}

	public void setNvRate(String nvRate) {
		this.nvRate = nvRate;
	}
	
}