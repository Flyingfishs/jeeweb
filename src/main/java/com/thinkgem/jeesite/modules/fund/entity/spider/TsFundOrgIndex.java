/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.entity.spider;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 产品和机构关联Entity
 * @author giles
 * @version 2015-08-19
 */
public class TsFundOrgIndex extends DataEntity<TsFundOrgIndex> {
	
	private static final long serialVersionUID = 1L;
	private String fundId;		// 基金ID
	private String orgId;		// 机构ID
	private String dispindex;		// 顺序
	
	public TsFundOrgIndex() {
		super();
	}

	public TsFundOrgIndex(String id){
		super(id);
	}

	@Length(min=0, max=11, message="基金ID长度必须介于 0 和 11 之间")
	public String getFundId() {
		return fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}
	
	@Length(min=0, max=11, message="机构ID长度必须介于 0 和 11 之间")
	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	@Length(min=0, max=11, message="顺序长度必须介于 0 和 11 之间")
	public String getDispindex() {
		return dispindex;
	}

	public void setDispindex(String dispindex) {
		this.dispindex = dispindex;
	}
	
}