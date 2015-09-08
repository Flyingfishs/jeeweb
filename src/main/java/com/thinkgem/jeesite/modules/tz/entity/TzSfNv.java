package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

import com.thinkgem.jeesite.common.persistence.Data2Entity;

public class TzSfNv {
    /**
     * This field corresponds to the database column tz_sf_nv.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 基金ID
     * This field corresponds to the database column tz_sf_nv.fundId
     *
     * @mbggenerated
     */
    private Long fundId;

    /**
     * 净值日期
     * This field corresponds to the database column tz_sf_nv.navDate
     *
     * @mbggenerated
     */
    private String navDate;

    /**
     * 单位净值
     * This field corresponds to the database column tz_sf_nv.nav
     *
     * @mbggenerated
     */
    private String nav;

    /**
     * 累计净值
     * This field corresponds to the database column tz_sf_nv.addedNav
     *
     * @mbggenerated
     */
    private String addedNav;

    /**
     * 增长率
     * This field corresponds to the database column tz_sf_nv.navRate
     *
     * @mbggenerated
     */
    private String navRate;

    /**
     * 是否真实值
     * This field corresponds to the database column tz_sf_nv.isReal
     *
     * @mbggenerated
     */
    private Integer isReal;

    /**
     * 备注
     * This field corresponds to the database column tz_sf_nv.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_nv.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_nv.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_nv.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_nv.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_nv.createUserId
     *
     * @mbggenerated
     */
    private Long createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_nv.updateUserId
     *
     * @mbggenerated
     */
    private Long updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_nv.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_nv.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * This method returns the value of the database column tz_sf_nv.id
     *
     * @return the value of tz_sf_nv.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tz_sf_nv.id
     *
     * @param id the value for tz_sf_nv.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 基金ID
     * This method returns the value of the database column tz_sf_nv.fundId
     *
     * @return the value of tz_sf_nv.fundId
     *
     * @mbggenerated
     */
    public Long getFundId() {
        return fundId;
    }

    /**
     * 基金ID
     * This method sets the value of the database column tz_sf_nv.fundId
     *
     * @param fundId the value for tz_sf_nv.fundId
     *
     * @mbggenerated
     */
    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    /**
     * 净值日期
     * This method returns the value of the database column tz_sf_nv.navDate
     *
     * @return the value of tz_sf_nv.navDate
     *
     * @mbggenerated
     */
    public String getNavDate() {
        return navDate;
    }

    /**
     * 净值日期
     * This method sets the value of the database column tz_sf_nv.navDate
     *
     * @param navDate the value for tz_sf_nv.navDate
     *
     * @mbggenerated
     */
    public void setNavDate(String navDate) {
        this.navDate = navDate == null ? null : navDate.trim();
    }

    /**
     * 单位净值
     * This method returns the value of the database column tz_sf_nv.nav
     *
     * @return the value of tz_sf_nv.nav
     *
     * @mbggenerated
     */
    public String getNav() {
        return nav;
    }

    /**
     * 单位净值
     * This method sets the value of the database column tz_sf_nv.nav
     *
     * @param nav the value for tz_sf_nv.nav
     *
     * @mbggenerated
     */
    public void setNav(String nav) {
        this.nav = nav == null ? null : nav.trim();
    }

    /**
     * 累计净值
     * This method returns the value of the database column tz_sf_nv.addedNav
     *
     * @return the value of tz_sf_nv.addedNav
     *
     * @mbggenerated
     */
    public String getAddedNav() {
        return addedNav;
    }

    /**
     * 累计净值
     * This method sets the value of the database column tz_sf_nv.addedNav
     *
     * @param addedNav the value for tz_sf_nv.addedNav
     *
     * @mbggenerated
     */
    public void setAddedNav(String addedNav) {
        this.addedNav = addedNav == null ? null : addedNav.trim();
    }

    /**
     * 增长率
     * This method returns the value of the database column tz_sf_nv.navRate
     *
     * @return the value of tz_sf_nv.navRate
     *
     * @mbggenerated
     */
    public String getNavRate() {
        return navRate;
    }

    /**
     * 增长率
     * This method sets the value of the database column tz_sf_nv.navRate
     *
     * @param navRate the value for tz_sf_nv.navRate
     *
     * @mbggenerated
     */
    public void setNavRate(String navRate) {
        this.navRate = navRate == null ? null : navRate.trim();
    }

    /**
     * 是否真实值
     * This method returns the value of the database column tz_sf_nv.isReal
     *
     * @return the value of tz_sf_nv.isReal
     *
     * @mbggenerated
     */
    public Integer getIsReal() {
        return isReal;
    }

    /**
     * 是否真实值
     * This method sets the value of the database column tz_sf_nv.isReal
     *
     * @param isReal the value for tz_sf_nv.isReal
     *
     * @mbggenerated
     */
    public void setIsReal(Integer isReal) {
        this.isReal = isReal;
    }

    /**
     * 备注
     * This method returns the value of the database column tz_sf_nv.remark
     *
     * @return the value of tz_sf_nv.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * This method sets the value of the database column tz_sf_nv.remark
     *
     * @param remark the value for tz_sf_nv.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_nv.disabled
     *
     * @return the value of tz_sf_nv.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_nv.disabled
     *
     * @param disabled the value for tz_sf_nv.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_nv.orderNo
     *
     * @return the value of tz_sf_nv.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_nv.orderNo
     *
     * @param orderNo the value for tz_sf_nv.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_nv.createTime
     *
     * @return the value of tz_sf_nv.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_nv.createTime
     *
     * @param createTime the value for tz_sf_nv.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_nv.updateTime
     *
     * @return the value of tz_sf_nv.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_nv.updateTime
     *
     * @param updateTime the value for tz_sf_nv.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_nv.createUserId
     *
     * @return the value of tz_sf_nv.createUserId
     *
     * @mbggenerated
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_nv.createUserId
     *
     * @param createUserId the value for tz_sf_nv.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_nv.updateUserId
     *
     * @return the value of tz_sf_nv.updateUserId
     *
     * @mbggenerated
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_nv.updateUserId
     *
     * @param updateUserId the value for tz_sf_nv.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_nv.createUserName
     *
     * @return the value of tz_sf_nv.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_nv.createUserName
     *
     * @param createUserName the value for tz_sf_nv.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_nv.updateUserName
     *
     * @return the value of tz_sf_nv.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_nv.updateUserName
     *
     * @param updateUserName the value for tz_sf_nv.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }
}