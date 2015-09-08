package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

import com.thinkgem.jeesite.common.persistence.Data2Entity;

public class TzSfMember extends Data2Entity<TzSfMember>{
    /**
     * 经理ID
     * This field corresponds to the database column tz_sf_member.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 用户名
     * This field corresponds to the database column tz_sf_member.userName
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 用户英文名
     * This field corresponds to the database column tz_sf_member.userNameEn
     *
     * @mbggenerated
     */
    private String userNameEn;

    /**
     * 昵称
     * This field corresponds to the database column tz_sf_member.nick
     *
     * @mbggenerated
     */
    private String nick;

    /**
     * 用户性别
     * This field corresponds to the database column tz_sf_member.usex
     *
     * @mbggenerated
     */
    private String usex;

    /**
     * 个人信息保密标识
     * This field corresponds to the database column tz_sf_member.secrecy
     *
     * @mbggenerated
     */
    private Short secrecy;

    /**
     * 用户邮件
     * This field corresponds to the database column tz_sf_member.uemail
     *
     * @mbggenerated
     */
    private String uemail;

    /**
     * 用户电话
     * This field corresponds to the database column tz_sf_member.uphone
     *
     * @mbggenerated
     */
    private String uphone;

    /**
     * 手机
     * This field corresponds to the database column tz_sf_member.umobile
     *
     * @mbggenerated
     */
    private String umobile;

    /**
     * 学历
     * This field corresponds to the database column tz_sf_member.ueducation
     *
     * @mbggenerated
     */
    private String ueducation;

    /**
     * 机构Id
     * This field corresponds to the database column tz_sf_member.orgId
     *
     * @mbggenerated
     */
    private Long orgId;

    /**
     * 机构全名
     * This field corresponds to the database column tz_sf_member.orgFullName
     *
     * @mbggenerated
     */
    private String orgFullName;

    /**
     * 用户状态
     * This field corresponds to the database column tz_sf_member.ustatus
     *
     * @mbggenerated
     */
    private String ustatus;

    /**
     * 公司地址
     * This field corresponds to the database column tz_sf_member.caddress
     *
     * @mbggenerated
     */
    private String caddress;

    /**
     * 所在部门
     * This field corresponds to the database column tz_sf_member.udepartment
     *
     * @mbggenerated
     */
    private String udepartment;

    /**
     * 职务
     * This field corresponds to the database column tz_sf_member.uduty
     *
     * @mbggenerated
     */
    private String uduty;

    /**
     * 是否为领队
     * This field corresponds to the database column tz_sf_member.isLeader
     *
     * @mbggenerated
     */
    private Integer isLeader;

    /**
     * 是否有公募背景
     * This field corresponds to the database column tz_sf_member.isPublicPlacement
     *
     * @mbggenerated
     */
    private Integer isPublicPlacement;

    /**
     * 投资年限
     * This field corresponds to the database column tz_sf_member.investmentYears
     *
     * @mbggenerated
     */
    private String investmentYears;

    /**
     * 头像路径
     * This field corresponds to the database column tz_sf_member.imageurl
     *
     * @mbggenerated
     */
    private String imageurl;

    /**
     * 专业素质诊断
     * This field corresponds to the database column tz_sf_member.professionAppraise
     *
     * @mbggenerated
     */
    private String professionAppraise;

    /**
     * 个人品质
     * This field corresponds to the database column tz_sf_member.charact
     *
     * @mbggenerated
     */
    private String charact;

    /**
     * 资产管理规模
     * This field corresponds to the database column tz_sf_member.assetMgtScale
     *
     * @mbggenerated
     */
    private String assetMgtScale;

    /**
     * 是否经历过市场充分竞争
     * This field corresponds to the database column tz_sf_member.isVeteran
     *
     * @mbggenerated
     */
    private Integer isVeteran;

    /**
     * 参与的市场
     * This field corresponds to the database column tz_sf_member.market
     *
     * @mbggenerated
     */
    private String market;

    /**
     * 知识结构
     * This field corresponds to the database column tz_sf_member.knowledgeStructure
     *
     * @mbggenerated
     */
    private String knowledgeStructure;

    /**
     * 综合素质
     * This field corresponds to the database column tz_sf_member.comprehensiveQuality
     *
     * @mbggenerated
     */
    private String comprehensiveQuality;

    /**
     * 经典投资案例
     * This field corresponds to the database column tz_sf_member.cases
     *
     * @mbggenerated
     */
    private String cases;

    /**
     * 管理时间开始
     * This field corresponds to the database column tz_sf_member.mtimes
     *
     * @mbggenerated
     */
    private String mtimes;

    /**
     * 管理时间截止
     * This field corresponds to the database column tz_sf_member.mtimee
     *
     * @mbggenerated
     */
    private String mtimee;

    /**
     * 任职私募年限
     * This field corresponds to the database column tz_sf_member.FundTime
     *
     * @mbggenerated
     */
    private String fundTime;

    /**
     * 履历背景
     * This field corresponds to the database column tz_sf_member.placement
     *
     * @mbggenerated
     */
    private String placement;

    /**
     * 擅长策略
     * This field corresponds to the database column tz_sf_member.goodStrategy
     *
     * @mbggenerated
     */
    private String goodStrategy;

    /**
     * 介绍
     * This field corresponds to the database column tz_sf_member.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 目标url
     * This field corresponds to the database column tz_sf_member.targetUrl
     *
     * @mbggenerated
     */
    private String targetUrl;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_member.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_member.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_member.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_member.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_member.createUserId
     *
     * @mbggenerated
     */
    private Integer createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_member.updateUserId
     *
     * @mbggenerated
     */
    private Integer updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_member.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_member.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;
    
    private String orgDesc;

    public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}

	/**
     * 经理ID
     * This method returns the value of the database column tz_sf_member.id
     *
     * @return the value of tz_sf_member.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 经理ID
     * This method sets the value of the database column tz_sf_member.id
     *
     * @param id the value for tz_sf_member.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名
     * This method returns the value of the database column tz_sf_member.userName
     *
     * @return the value of tz_sf_member.userName
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * This method sets the value of the database column tz_sf_member.userName
     *
     * @param userName the value for tz_sf_member.userName
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 用户英文名
     * This method returns the value of the database column tz_sf_member.userNameEn
     *
     * @return the value of tz_sf_member.userNameEn
     *
     * @mbggenerated
     */
    public String getUserNameEn() {
        return userNameEn;
    }

    /**
     * 用户英文名
     * This method sets the value of the database column tz_sf_member.userNameEn
     *
     * @param userNameEn the value for tz_sf_member.userNameEn
     *
     * @mbggenerated
     */
    public void setUserNameEn(String userNameEn) {
        this.userNameEn = userNameEn == null ? null : userNameEn.trim();
    }

    /**
     * 昵称
     * This method returns the value of the database column tz_sf_member.nick
     *
     * @return the value of tz_sf_member.nick
     *
     * @mbggenerated
     */
    public String getNick() {
        return nick;
    }

    /**
     * 昵称
     * This method sets the value of the database column tz_sf_member.nick
     *
     * @param nick the value for tz_sf_member.nick
     *
     * @mbggenerated
     */
    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    /**
     * 用户性别
     * This method returns the value of the database column tz_sf_member.usex
     *
     * @return the value of tz_sf_member.usex
     *
     * @mbggenerated
     */
    public String getUsex() {
        return usex;
    }

    /**
     * 用户性别
     * This method sets the value of the database column tz_sf_member.usex
     *
     * @param usex the value for tz_sf_member.usex
     *
     * @mbggenerated
     */
    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    /**
     * 个人信息保密标识
     * This method returns the value of the database column tz_sf_member.secrecy
     *
     * @return the value of tz_sf_member.secrecy
     *
     * @mbggenerated
     */
    public Short getSecrecy() {
        return secrecy;
    }

    /**
     * 个人信息保密标识
     * This method sets the value of the database column tz_sf_member.secrecy
     *
     * @param secrecy the value for tz_sf_member.secrecy
     *
     * @mbggenerated
     */
    public void setSecrecy(Short secrecy) {
        this.secrecy = secrecy;
    }

    /**
     * 用户邮件
     * This method returns the value of the database column tz_sf_member.uemail
     *
     * @return the value of tz_sf_member.uemail
     *
     * @mbggenerated
     */
    public String getUemail() {
        return uemail;
    }

    /**
     * 用户邮件
     * This method sets the value of the database column tz_sf_member.uemail
     *
     * @param uemail the value for tz_sf_member.uemail
     *
     * @mbggenerated
     */
    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    /**
     * 用户电话
     * This method returns the value of the database column tz_sf_member.uphone
     *
     * @return the value of tz_sf_member.uphone
     *
     * @mbggenerated
     */
    public String getUphone() {
        return uphone;
    }

    /**
     * 用户电话
     * This method sets the value of the database column tz_sf_member.uphone
     *
     * @param uphone the value for tz_sf_member.uphone
     *
     * @mbggenerated
     */
    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    /**
     * 手机
     * This method returns the value of the database column tz_sf_member.umobile
     *
     * @return the value of tz_sf_member.umobile
     *
     * @mbggenerated
     */
    public String getUmobile() {
        return umobile;
    }

    /**
     * 手机
     * This method sets the value of the database column tz_sf_member.umobile
     *
     * @param umobile the value for tz_sf_member.umobile
     *
     * @mbggenerated
     */
    public void setUmobile(String umobile) {
        this.umobile = umobile == null ? null : umobile.trim();
    }

    /**
     * 学历
     * This method returns the value of the database column tz_sf_member.ueducation
     *
     * @return the value of tz_sf_member.ueducation
     *
     * @mbggenerated
     */
    public String getUeducation() {
        return ueducation;
    }

    /**
     * 学历
     * This method sets the value of the database column tz_sf_member.ueducation
     *
     * @param ueducation the value for tz_sf_member.ueducation
     *
     * @mbggenerated
     */
    public void setUeducation(String ueducation) {
        this.ueducation = ueducation == null ? null : ueducation.trim();
    }

    /**
     * 机构Id
     * This method returns the value of the database column tz_sf_member.orgId
     *
     * @return the value of tz_sf_member.orgId
     *
     * @mbggenerated
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 机构Id
     * This method sets the value of the database column tz_sf_member.orgId
     *
     * @param orgId the value for tz_sf_member.orgId
     *
     * @mbggenerated
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 机构全名
     * This method returns the value of the database column tz_sf_member.orgFullName
     *
     * @return the value of tz_sf_member.orgFullName
     *
     * @mbggenerated
     */
    public String getOrgFullName() {
        return orgFullName;
    }

    /**
     * 机构全名
     * This method sets the value of the database column tz_sf_member.orgFullName
     *
     * @param orgFullName the value for tz_sf_member.orgFullName
     *
     * @mbggenerated
     */
    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName == null ? null : orgFullName.trim();
    }

    /**
     * 用户状态
     * This method returns the value of the database column tz_sf_member.ustatus
     *
     * @return the value of tz_sf_member.ustatus
     *
     * @mbggenerated
     */
    public String getUstatus() {
        return ustatus;
    }

    /**
     * 用户状态
     * This method sets the value of the database column tz_sf_member.ustatus
     *
     * @param ustatus the value for tz_sf_member.ustatus
     *
     * @mbggenerated
     */
    public void setUstatus(String ustatus) {
        this.ustatus = ustatus == null ? null : ustatus.trim();
    }

    /**
     * 公司地址
     * This method returns the value of the database column tz_sf_member.caddress
     *
     * @return the value of tz_sf_member.caddress
     *
     * @mbggenerated
     */
    public String getCaddress() {
        return caddress;
    }

    /**
     * 公司地址
     * This method sets the value of the database column tz_sf_member.caddress
     *
     * @param caddress the value for tz_sf_member.caddress
     *
     * @mbggenerated
     */
    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    /**
     * 所在部门
     * This method returns the value of the database column tz_sf_member.udepartment
     *
     * @return the value of tz_sf_member.udepartment
     *
     * @mbggenerated
     */
    public String getUdepartment() {
        return udepartment;
    }

    /**
     * 所在部门
     * This method sets the value of the database column tz_sf_member.udepartment
     *
     * @param udepartment the value for tz_sf_member.udepartment
     *
     * @mbggenerated
     */
    public void setUdepartment(String udepartment) {
        this.udepartment = udepartment == null ? null : udepartment.trim();
    }

    /**
     * 职务
     * This method returns the value of the database column tz_sf_member.uduty
     *
     * @return the value of tz_sf_member.uduty
     *
     * @mbggenerated
     */
    public String getUduty() {
        return uduty;
    }

    /**
     * 职务
     * This method sets the value of the database column tz_sf_member.uduty
     *
     * @param uduty the value for tz_sf_member.uduty
     *
     * @mbggenerated
     */
    public void setUduty(String uduty) {
        this.uduty = uduty == null ? null : uduty.trim();
    }

    /**
     * 是否为领队
     * This method returns the value of the database column tz_sf_member.isLeader
     *
     * @return the value of tz_sf_member.isLeader
     *
     * @mbggenerated
     */
    public Integer getIsLeader() {
        return isLeader;
    }

    /**
     * 是否为领队
     * This method sets the value of the database column tz_sf_member.isLeader
     *
     * @param isLeader the value for tz_sf_member.isLeader
     *
     * @mbggenerated
     */
    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    /**
     * 是否有公募背景
     * This method returns the value of the database column tz_sf_member.isPublicPlacement
     *
     * @return the value of tz_sf_member.isPublicPlacement
     *
     * @mbggenerated
     */
    public Integer getIsPublicPlacement() {
        return isPublicPlacement;
    }

    /**
     * 是否有公募背景
     * This method sets the value of the database column tz_sf_member.isPublicPlacement
     *
     * @param isPublicPlacement the value for tz_sf_member.isPublicPlacement
     *
     * @mbggenerated
     */
    public void setIsPublicPlacement(Integer isPublicPlacement) {
        this.isPublicPlacement = isPublicPlacement;
    }

    /**
     * 投资年限
     * This method returns the value of the database column tz_sf_member.investmentYears
     *
     * @return the value of tz_sf_member.investmentYears
     *
     * @mbggenerated
     */
    public String getInvestmentYears() {
        return investmentYears;
    }

    /**
     * 投资年限
     * This method sets the value of the database column tz_sf_member.investmentYears
     *
     * @param investmentYears the value for tz_sf_member.investmentYears
     *
     * @mbggenerated
     */
    public void setInvestmentYears(String investmentYears) {
        this.investmentYears = investmentYears == null ? null : investmentYears.trim();
    }

    /**
     * 头像路径
     * This method returns the value of the database column tz_sf_member.imageurl
     *
     * @return the value of tz_sf_member.imageurl
     *
     * @mbggenerated
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * 头像路径
     * This method sets the value of the database column tz_sf_member.imageurl
     *
     * @param imageurl the value for tz_sf_member.imageurl
     *
     * @mbggenerated
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    /**
     * 专业素质诊断
     * This method returns the value of the database column tz_sf_member.professionAppraise
     *
     * @return the value of tz_sf_member.professionAppraise
     *
     * @mbggenerated
     */
    public String getProfessionAppraise() {
        return professionAppraise;
    }

    /**
     * 专业素质诊断
     * This method sets the value of the database column tz_sf_member.professionAppraise
     *
     * @param professionAppraise the value for tz_sf_member.professionAppraise
     *
     * @mbggenerated
     */
    public void setProfessionAppraise(String professionAppraise) {
        this.professionAppraise = professionAppraise == null ? null : professionAppraise.trim();
    }

    /**
     * 个人品质
     * This method returns the value of the database column tz_sf_member.charact
     *
     * @return the value of tz_sf_member.charact
     *
     * @mbggenerated
     */
    public String getCharact() {
        return charact;
    }

    /**
     * 个人品质
     * This method sets the value of the database column tz_sf_member.charact
     *
     * @param charact the value for tz_sf_member.charact
     *
     * @mbggenerated
     */
    public void setCharact(String charact) {
        this.charact = charact == null ? null : charact.trim();
    }

    /**
     * 资产管理规模
     * This method returns the value of the database column tz_sf_member.assetMgtScale
     *
     * @return the value of tz_sf_member.assetMgtScale
     *
     * @mbggenerated
     */
    public String getAssetMgtScale() {
        return assetMgtScale;
    }

    /**
     * 资产管理规模
     * This method sets the value of the database column tz_sf_member.assetMgtScale
     *
     * @param assetMgtScale the value for tz_sf_member.assetMgtScale
     *
     * @mbggenerated
     */
    public void setAssetMgtScale(String assetMgtScale) {
        this.assetMgtScale = assetMgtScale == null ? null : assetMgtScale.trim();
    }

    /**
     * 是否经历过市场充分竞争
     * This method returns the value of the database column tz_sf_member.isVeteran
     *
     * @return the value of tz_sf_member.isVeteran
     *
     * @mbggenerated
     */
    public Integer getIsVeteran() {
        return isVeteran;
    }

    /**
     * 是否经历过市场充分竞争
     * This method sets the value of the database column tz_sf_member.isVeteran
     *
     * @param isVeteran the value for tz_sf_member.isVeteran
     *
     * @mbggenerated
     */
    public void setIsVeteran(Integer isVeteran) {
        this.isVeteran = isVeteran;
    }

    /**
     * 参与的市场
     * This method returns the value of the database column tz_sf_member.market
     *
     * @return the value of tz_sf_member.market
     *
     * @mbggenerated
     */
    public String getMarket() {
        return market;
    }

    /**
     * 参与的市场
     * This method sets the value of the database column tz_sf_member.market
     *
     * @param market the value for tz_sf_member.market
     *
     * @mbggenerated
     */
    public void setMarket(String market) {
        this.market = market == null ? null : market.trim();
    }

    /**
     * 知识结构
     * This method returns the value of the database column tz_sf_member.knowledgeStructure
     *
     * @return the value of tz_sf_member.knowledgeStructure
     *
     * @mbggenerated
     */
    public String getKnowledgeStructure() {
        return knowledgeStructure;
    }

    /**
     * 知识结构
     * This method sets the value of the database column tz_sf_member.knowledgeStructure
     *
     * @param knowledgeStructure the value for tz_sf_member.knowledgeStructure
     *
     * @mbggenerated
     */
    public void setKnowledgeStructure(String knowledgeStructure) {
        this.knowledgeStructure = knowledgeStructure == null ? null : knowledgeStructure.trim();
    }

    /**
     * 综合素质
     * This method returns the value of the database column tz_sf_member.comprehensiveQuality
     *
     * @return the value of tz_sf_member.comprehensiveQuality
     *
     * @mbggenerated
     */
    public String getComprehensiveQuality() {
        return comprehensiveQuality;
    }

    /**
     * 综合素质
     * This method sets the value of the database column tz_sf_member.comprehensiveQuality
     *
     * @param comprehensiveQuality the value for tz_sf_member.comprehensiveQuality
     *
     * @mbggenerated
     */
    public void setComprehensiveQuality(String comprehensiveQuality) {
        this.comprehensiveQuality = comprehensiveQuality == null ? null : comprehensiveQuality.trim();
    }

    /**
     * 经典投资案例
     * This method returns the value of the database column tz_sf_member.cases
     *
     * @return the value of tz_sf_member.cases
     *
     * @mbggenerated
     */
    public String getCases() {
        return cases;
    }

    /**
     * 经典投资案例
     * This method sets the value of the database column tz_sf_member.cases
     *
     * @param cases the value for tz_sf_member.cases
     *
     * @mbggenerated
     */
    public void setCases(String cases) {
        this.cases = cases == null ? null : cases.trim();
    }

    /**
     * 管理时间开始
     * This method returns the value of the database column tz_sf_member.mtimes
     *
     * @return the value of tz_sf_member.mtimes
     *
     * @mbggenerated
     */
    public String getMtimes() {
        return mtimes;
    }

    /**
     * 管理时间开始
     * This method sets the value of the database column tz_sf_member.mtimes
     *
     * @param mtimes the value for tz_sf_member.mtimes
     *
     * @mbggenerated
     */
    public void setMtimes(String mtimes) {
        this.mtimes = mtimes == null ? null : mtimes.trim();
    }

    /**
     * 管理时间截止
     * This method returns the value of the database column tz_sf_member.mtimee
     *
     * @return the value of tz_sf_member.mtimee
     *
     * @mbggenerated
     */
    public String getMtimee() {
        return mtimee;
    }

    /**
     * 管理时间截止
     * This method sets the value of the database column tz_sf_member.mtimee
     *
     * @param mtimee the value for tz_sf_member.mtimee
     *
     * @mbggenerated
     */
    public void setMtimee(String mtimee) {
        this.mtimee = mtimee == null ? null : mtimee.trim();
    }

    /**
     * 任职私募年限
     * This method returns the value of the database column tz_sf_member.FundTime
     *
     * @return the value of tz_sf_member.FundTime
     *
     * @mbggenerated
     */
    public String getFundTime() {
        return fundTime;
    }

    /**
     * 任职私募年限
     * This method sets the value of the database column tz_sf_member.FundTime
     *
     * @param fundTime the value for tz_sf_member.FundTime
     *
     * @mbggenerated
     */
    public void setFundTime(String fundTime) {
        this.fundTime = fundTime == null ? null : fundTime.trim();
    }

    /**
     * 履历背景
     * This method returns the value of the database column tz_sf_member.placement
     *
     * @return the value of tz_sf_member.placement
     *
     * @mbggenerated
     */
    public String getPlacement() {
        return placement;
    }

    /**
     * 履历背景
     * This method sets the value of the database column tz_sf_member.placement
     *
     * @param placement the value for tz_sf_member.placement
     *
     * @mbggenerated
     */
    public void setPlacement(String placement) {
        this.placement = placement == null ? null : placement.trim();
    }

    /**
     * 擅长策略
     * This method returns the value of the database column tz_sf_member.goodStrategy
     *
     * @return the value of tz_sf_member.goodStrategy
     *
     * @mbggenerated
     */
    public String getGoodStrategy() {
        return goodStrategy;
    }

    /**
     * 擅长策略
     * This method sets the value of the database column tz_sf_member.goodStrategy
     *
     * @param goodStrategy the value for tz_sf_member.goodStrategy
     *
     * @mbggenerated
     */
    public void setGoodStrategy(String goodStrategy) {
        this.goodStrategy = goodStrategy == null ? null : goodStrategy.trim();
    }

    /**
     * 介绍
     * This method returns the value of the database column tz_sf_member.description
     *
     * @return the value of tz_sf_member.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * 介绍
     * This method sets the value of the database column tz_sf_member.description
     *
     * @param description the value for tz_sf_member.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 目标url
     * This method returns the value of the database column tz_sf_member.targetUrl
     *
     * @return the value of tz_sf_member.targetUrl
     *
     * @mbggenerated
     */
    public String getTargetUrl() {
        return targetUrl;
    }

    /**
     * 目标url
     * This method sets the value of the database column tz_sf_member.targetUrl
     *
     * @param targetUrl the value for tz_sf_member.targetUrl
     *
     * @mbggenerated
     */
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl == null ? null : targetUrl.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_member.disabled
     *
     * @return the value of tz_sf_member.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_member.disabled
     *
     * @param disabled the value for tz_sf_member.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_member.orderNo
     *
     * @return the value of tz_sf_member.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_member.orderNo
     *
     * @param orderNo the value for tz_sf_member.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_member.createTime
     *
     * @return the value of tz_sf_member.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_member.createTime
     *
     * @param createTime the value for tz_sf_member.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_member.updateTime
     *
     * @return the value of tz_sf_member.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_member.updateTime
     *
     * @param updateTime the value for tz_sf_member.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_member.createUserId
     *
     * @return the value of tz_sf_member.createUserId
     *
     * @mbggenerated
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_member.createUserId
     *
     * @param createUserId the value for tz_sf_member.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_member.updateUserId
     *
     * @return the value of tz_sf_member.updateUserId
     *
     * @mbggenerated
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_member.updateUserId
     *
     * @param updateUserId the value for tz_sf_member.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_member.createUserName
     *
     * @return the value of tz_sf_member.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_member.createUserName
     *
     * @param createUserName the value for tz_sf_member.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_member.updateUserName
     *
     * @return the value of tz_sf_member.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_member.updateUserName
     *
     * @param updateUserName the value for tz_sf_member.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }
}