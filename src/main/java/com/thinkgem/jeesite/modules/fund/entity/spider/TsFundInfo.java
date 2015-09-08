/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.entity.spider;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 基金信息Entity
 * @author giles
 * @version 2015-08-11
 */
public class TsFundInfo extends DataEntity<TsFundInfo> {
	
	private static final long serialVersionUID = 1L;
	private String fundId;		// 基金ID
	private String fundName;		// 基金简称
	private String fundFullName;		// 基金全称
	private String foundationDate;		// 成立日期
	private String endDate;		// 终止日期
	private String status;		// 状态
	private String statusCn;		// 状态中文
	private String issuingScale;		// 发行规模
	private String investmentIdea;		// 投资理念
	private String feature;		// 产品特色
	private String appraise;		// 产品点评
	private String isPrivate;		// 是否私有
	private String accountNumber;		// 开户账号
	private String accountName;		// 开户名
	private String investmentTarget;		// 投资目标
	private String investmentStrategy;		// 投资策略
	private String investmentRange;		// 投资范围
	private String orientation;		// 投资方向
	private String initNav;		// 初始单位净值
	private String financingScale;		// 预期募集规模
	private String realFinancingScale;		// 实际募集规模
	private String managerShareScale;		// 管理人参与规模
	private String validPurchaseNumber;		// 有效认购户数
	private String rgF;		// 认购费
	private String shF;		// 赎回费
	private String glF;		// 管理费
	private String fgdlF;		// 浮动管理费
	private String targetUrl;		// 请求地址
	private String targetCode;		// 代码
	private String targetOrgurl;		// 机构地址
	private String navDate;		// 净值日期
	private String nav;		// 单位净值
	private String addNav;		// 累计净值
	private String orgId;		// 基金机构id
	private String targetType;		// target_type
	private String targerRun="0";		// 目标站点是否在运行
	private Date tragetTime;		// 执行时间
	private String type;		// 基金类型
	private String mName;		// m_name
	private String mUrl;		// m_url
	private String orgName;		// org_name
	private String orgUrl;		// org_url
	private String navUrl;		// nav_url
	private String navLsUrl;		// nav_url
	
	public TsFundInfo() {
		super();
	}

	public TsFundInfo(String id){
		super(id);
	}

	@Length(min=1, max=11, message="基金ID长度必须介于 1 和 11 之间")
	public String getFundId() {
		return fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}
	
	@Length(min=0, max=255, message="基金简称长度必须介于 0 和 255 之间")
	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	
	@Length(min=0, max=255, message="基金全称长度必须介于 0 和 255 之间")
	public String getFundFullName() {
		return fundFullName;
	}

	public void setFundFullName(String fundFullName) {
		this.fundFullName = fundFullName;
	}
	
	@Length(min=0, max=30, message="成立日期长度必须介于 0 和 30 之间")
	public String getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}
	
	@Length(min=0, max=30, message="终止日期长度必须介于 0 和 30 之间")
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@Length(min=0, max=2, message="状态长度必须介于 0 和 2 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Length(min=0, max=255, message="状态中文长度必须介于 0 和 255 之间")
	public String getStatusCn() {
		return statusCn;
	}

	public void setStatusCn(String statusCn) {
		this.statusCn = statusCn;
	}
	
	public String getIssuingScale() {
		return issuingScale;
	}

	public void setIssuingScale(String issuingScale) {
		this.issuingScale = issuingScale;
	}
	
	@Length(min=0, max=2000, message="投资理念长度必须介于 0 和 2000 之间")
	public String getInvestmentIdea() {
		return investmentIdea;
	}

	public void setInvestmentIdea(String investmentIdea) {
		this.investmentIdea = investmentIdea;
	}
	
	@Length(min=0, max=255, message="产品特色长度必须介于 0 和 255 之间")
	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	@Length(min=0, max=2000, message="产品点评长度必须介于 0 和 2000 之间")
	public String getAppraise() {
		return appraise;
	}

	public void setAppraise(String appraise) {
		this.appraise = appraise;
	}
	
	@Length(min=0, max=1, message="是否私有长度必须介于 0 和 1 之间")
	public String getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(String isPrivate) {
		this.isPrivate = isPrivate;
	}
	
	@Length(min=0, max=50, message="开户账号长度必须介于 0 和 50 之间")
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Length(min=0, max=50, message="开户名长度必须介于 0 和 50 之间")
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	@Length(min=0, max=500, message="投资目标长度必须介于 0 和 500 之间")
	public String getInvestmentTarget() {
		return investmentTarget;
	}

	public void setInvestmentTarget(String investmentTarget) {
		this.investmentTarget = investmentTarget;
	}
	
	@Length(min=0, max=500, message="投资策略长度必须介于 0 和 500 之间")
	public String getInvestmentStrategy() {
		return investmentStrategy;
	}

	public void setInvestmentStrategy(String investmentStrategy) {
		this.investmentStrategy = investmentStrategy;
	}
	
	@Length(min=0, max=500, message="投资范围长度必须介于 0 和 500 之间")
	public String getInvestmentRange() {
		return investmentRange;
	}

	public void setInvestmentRange(String investmentRange) {
		this.investmentRange = investmentRange;
	}
	
	@Length(min=0, max=500, message="投资方向长度必须介于 0 和 500 之间")
	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	public String getInitNav() {
		return initNav;
	}

	public void setInitNav(String initNav) {
		this.initNav = initNav;
	}
	
	@Length(min=0, max=255, message="预期募集规模长度必须介于 0 和 255 之间")
	public String getFinancingScale() {
		return financingScale;
	}

	public void setFinancingScale(String financingScale) {
		this.financingScale = financingScale;
	}
	
	@Length(min=0, max=255, message="实际募集规模长度必须介于 0 和 255 之间")
	public String getRealFinancingScale() {
		return realFinancingScale;
	}

	public void setRealFinancingScale(String realFinancingScale) {
		this.realFinancingScale = realFinancingScale;
	}
	
	@Length(min=0, max=255, message="管理人参与规模长度必须介于 0 和 255 之间")
	public String getManagerShareScale() {
		return managerShareScale;
	}

	public void setManagerShareScale(String managerShareScale) {
		this.managerShareScale = managerShareScale;
	}
	
	@Length(min=0, max=11, message="有效认购户数长度必须介于 0 和 11 之间")
	public String getValidPurchaseNumber() {
		return validPurchaseNumber;
	}

	public void setValidPurchaseNumber(String validPurchaseNumber) {
		this.validPurchaseNumber = validPurchaseNumber;
	}
	
	@Length(min=0, max=50, message="认购费长度必须介于 0 和 50 之间")
	public String getRgF() {
		return rgF;
	}

	public void setRgF(String rgF) {
		this.rgF = rgF;
	}
	
	@Length(min=0, max=50, message="赎回费长度必须介于 0 和 50 之间")
	public String getShF() {
		return shF;
	}

	public void setShF(String shF) {
		this.shF = shF;
	}
	
	@Length(min=0, max=50, message="管理费长度必须介于 0 和 50 之间")
	public String getGlF() {
		return glF;
	}

	public void setGlF(String glF) {
		this.glF = glF;
	}
	
	@Length(min=0, max=50, message="浮动管理费长度必须介于 0 和 50 之间")
	public String getFgdlF() {
		return fgdlF;
	}

	public void setFgdlF(String fgdlF) {
		this.fgdlF = fgdlF;
	}
	
	@Length(min=0, max=255, message="请求地址长度必须介于 0 和 255 之间")
	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	
	@Length(min=0, max=255, message="代码长度必须介于 0 和 255 之间")
	public String getTargetCode() {
		return targetCode;
	}

	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}
	
	@Length(min=0, max=255, message="机构地址长度必须介于 0 和 255 之间")
	public String getTargetOrgurl() {
		return targetOrgurl;
	}

	public void setTargetOrgurl(String targetOrgurl) {
		this.targetOrgurl = targetOrgurl;
	}
	
	@Length(min=0, max=255, message="净值日期长度必须介于 0 和 255 之间")
	public String getNavDate() {
		return navDate;
	}

	public void setNavDate(String navDate) {
		this.navDate = navDate;
	}
	
	@Length(min=0, max=255, message="单位净值长度必须介于 0 和 255 之间")
	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}
	
	@Length(min=0, max=255, message="累计净值长度必须介于 0 和 255 之间")
	public String getAddNav() {
		return addNav;
	}

	public void setAddNav(String addNav) {
		this.addNav = addNav;
	}
	
	@Length(min=0, max=11, message="基金机构id长度必须介于 0 和 11 之间")
	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	@Length(min=0, max=255, message="target_type长度必须介于 0 和 255 之间")
	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}
	
	@Length(min=0, max=1, message="目标站点是否在运行长度必须介于 0 和 1 之间")
	public String getTargerRun() {
		return targerRun;
	}

	public void setTargerRun(String targerRun) {
		this.targerRun = targerRun;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTragetTime() {
		return tragetTime;
	}

	public void setTragetTime(Date tragetTime) {
		this.tragetTime = tragetTime;
	}
	
	@Length(min=0, max=50, message="基金类型长度必须介于 0 和 50 之间")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Length(min=0, max=255, message="m_name长度必须介于 0 和 255 之间")
	public String getMName() {
		return mName;
	}

	public void setMName(String mName) {
		this.mName = mName;
	}
	
	@Length(min=0, max=255, message="m_url长度必须介于 0 和 255 之间")
	public String getMUrl() {
		return mUrl;
	}

	public void setMUrl(String mUrl) {
		this.mUrl = mUrl;
	}
	
	@Length(min=0, max=255, message="org_name长度必须介于 0 和 255 之间")
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	@Length(min=0, max=255, message="org_url长度必须介于 0 和 255 之间")
	public String getOrgUrl() {
		return orgUrl;
	}

	public void setOrgUrl(String orgUrl) {
		this.orgUrl = orgUrl;
	}

	public String getNavUrl() {
		return navUrl;
	}

	public void setNavUrl(String navUrl) {
		this.navUrl = navUrl;
	}

	public String getNavLsUrl() {
		return navLsUrl;
	}

	public void setNavLsUrl(String navLsUrl) {
		this.navLsUrl = navLsUrl;
	}
	
	
}