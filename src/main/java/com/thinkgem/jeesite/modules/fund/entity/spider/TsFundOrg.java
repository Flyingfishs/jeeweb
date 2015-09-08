/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.entity.spider;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 基金机构Entity
 * @author giles
 * @version 2015-08-11
 */
public class TsFundOrg extends DataEntity<TsFundOrg> {
	
	private static final long serialVersionUID = 1L;
	private String orgId;		// 机构号
	private String orgName;		// 机构简称
	private String orgFullName;		// 机构全名
	private String profile;		// 公司简介
	private String address;		// 联系地址
	private String researcherScale;		// 研究人员规模
	private String brokerScale;		// 投资实务人员规模
	private String investmentIdea;		// 投资理念
	private String assetMgtScale;		// 资产管理规模
	private String minAssetMgtScale;		// 最小资产管理规模
	private String tragetUrl;		// traget_url
	private String tragetCode;		// traget_code
	private String orgType;		// 公司类型
	
	public TsFundOrg() {
		super();
	}

	public TsFundOrg(String id){
		super(id);
	}

	@Length(min=1, max=11, message="机构号长度必须介于 1 和 11 之间")
	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	@Length(min=0, max=50, message="机构简称长度必须介于 0 和 50 之间")
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	@Length(min=0, max=255, message="机构全名长度必须介于 0 和 255 之间")
	public String getOrgFullName() {
		return orgFullName;
	}

	public void setOrgFullName(String orgFullName) {
		this.orgFullName = orgFullName;
	}
	
	@Length(min=0, max=255, message="公司简介长度必须介于 0 和 255 之间")
	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	@Length(min=0, max=255, message="联系地址长度必须介于 0 和 255 之间")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Length(min=0, max=255, message="研究人员规模长度必须介于 0 和 255 之间")
	public String getResearcherScale() {
		return researcherScale;
	}

	public void setResearcherScale(String researcherScale) {
		this.researcherScale = researcherScale;
	}
	
	@Length(min=0, max=255, message="投资实务人员规模长度必须介于 0 和 255 之间")
	public String getBrokerScale() {
		return brokerScale;
	}

	public void setBrokerScale(String brokerScale) {
		this.brokerScale = brokerScale;
	}
	
	@Length(min=0, max=255, message="投资理念长度必须介于 0 和 255 之间")
	public String getInvestmentIdea() {
		return investmentIdea;
	}

	public void setInvestmentIdea(String investmentIdea) {
		this.investmentIdea = investmentIdea;
	}
	
	@Length(min=0, max=255, message="资产管理规模长度必须介于 0 和 255 之间")
	public String getAssetMgtScale() {
		return assetMgtScale;
	}

	public void setAssetMgtScale(String assetMgtScale) {
		this.assetMgtScale = assetMgtScale;
	}
	
	@Length(min=0, max=255, message="最小资产管理规模长度必须介于 0 和 255 之间")
	public String getMinAssetMgtScale() {
		return minAssetMgtScale;
	}

	public void setMinAssetMgtScale(String minAssetMgtScale) {
		this.minAssetMgtScale = minAssetMgtScale;
	}
	
	@Length(min=0, max=255, message="traget_url长度必须介于 0 和 255 之间")
	public String getTragetUrl() {
		return tragetUrl;
	}

	public void setTragetUrl(String tragetUrl) {
		this.tragetUrl = tragetUrl;
	}
	
	@Length(min=0, max=255, message="traget_code长度必须介于 0 和 255 之间")
	public String getTragetCode() {
		return tragetCode;
	}

	public void setTragetCode(String tragetCode) {
		this.tragetCode = tragetCode;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	
}