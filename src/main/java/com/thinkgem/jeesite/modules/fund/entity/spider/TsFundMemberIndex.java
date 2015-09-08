/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.entity.spider;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 基金和基金经理Entity
 * @author giles
 * @version 2015-08-19
 */
public class TsFundMemberIndex extends DataEntity<TsFundMemberIndex> {
	
	private static final long serialVersionUID = 1L;
	private String fundId;		// 基金ID
	private String mId;		// 基金经理ID
	private String dispindex;		// 顺序
	
	public TsFundMemberIndex() {
		super();
	}

	public TsFundMemberIndex(String id){
		super(id);
	}

	@Length(min=0, max=11, message="基金ID长度必须介于 0 和 11 之间")
	public String getFundId() {
		return fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}
	
	@Length(min=0, max=11, message="基金经理ID长度必须介于 0 和 11 之间")
	public String getMId() {
		return mId;
	}

	public void setMId(String mId) {
		this.mId = mId;
	}
	
	@Length(min=0, max=11, message="顺序长度必须介于 0 和 11 之间")
	public String getDispindex() {
		return dispindex;
	}

	public void setDispindex(String dispindex) {
		this.dispindex = dispindex;
	}
	
}