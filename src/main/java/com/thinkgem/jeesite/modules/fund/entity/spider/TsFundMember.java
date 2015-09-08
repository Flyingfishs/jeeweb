/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.entity.spider;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 基金经理Entity
 * @author giles
 * @version 2015-08-11
 */
public class TsFundMember extends DataEntity<TsFundMember> {
	
	private static final long serialVersionUID = 1L;
	private String mId;		// m_id
	private String mname;		// 用户名
	private String meducation;		// 学历
	private String orgId;		// 机构id
	private String mduty;		// 职务
	private String assetMgtScale;		// 资产管理规模
	private String isPublicPlacement;		// 是否有公募背景
	private String investmentYears;		// 投资年限
	private String mimage;		// 用户图像
	private String targetUrl;		// target_url
	private String targetCode;		// target_code
	private String fundId;		// 基金id
	private String desc;		//简介
	private String orgDesc;;//
	
	public TsFundMember() {
		super();
	}

	public TsFundMember(String id){
		super(id);
	}

	@Length(min=1, max=11, message="m_id长度必须介于 1 和 11 之间")
	public String getMId() {
		return mId;
	}

	public void setMId(String mId) {
		this.mId = mId;
	}
	
	@Length(min=0, max=255, message="用户名长度必须介于 0 和 255 之间")
	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
	
	@Length(min=0, max=255, message="学历长度必须介于 0 和 255 之间")
	public String getMeducation() {
		return meducation;
	}

	public void setMeducation(String meducation) {
		this.meducation = meducation;
	}
	
	@Length(min=0, max=11, message="机构id长度必须介于 0 和 11 之间")
	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	@Length(min=0, max=255, message="职务长度必须介于 0 和 255 之间")
	public String getMduty() {
		return mduty;
	}

	public void setMduty(String mduty) {
		this.mduty = mduty;
	}
	
	@Length(min=0, max=255, message="资产管理规模长度必须介于 0 和 255 之间")
	public String getAssetMgtScale() {
		return assetMgtScale;
	}

	public void setAssetMgtScale(String assetMgtScale) {
		this.assetMgtScale = assetMgtScale;
	}
	
	@Length(min=0, max=1, message="是否有公募背景长度必须介于 0 和 1 之间")
	public String getIsPublicPlacement() {
		return isPublicPlacement;
	}

	public void setIsPublicPlacement(String isPublicPlacement) {
		this.isPublicPlacement = isPublicPlacement;
	}
	
	@Length(min=0, max=255, message="投资年限长度必须介于 0 和 255 之间")
	public String getInvestmentYears() {
		return investmentYears;
	}

	public void setInvestmentYears(String investmentYears) {
		this.investmentYears = investmentYears;
	}
	
	@Length(min=0, max=500, message="用户图像长度必须介于 0 和 500 之间")
	public String getMimage() {
		return mimage;
	}

	public void setMimage(String mimage) {
		this.mimage = mimage;
	}
	
	@Length(min=0, max=255, message="target_url长度必须介于 0 和 255 之间")
	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	
	@Length(min=0, max=255, message="target_code长度必须介于 0 和 255 之间")
	public String getTargetCode() {
		return targetCode;
	}

	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}
	
	@Length(min=0, max=11, message="基金id长度必须介于 0 和 11 之间")
	public String getFundId() {
		return fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}
	
}