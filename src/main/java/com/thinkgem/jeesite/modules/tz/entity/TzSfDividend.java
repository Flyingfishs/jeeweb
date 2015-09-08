package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

import com.thinkgem.jeesite.common.persistence.Data2Entity;

public class TzSfDividend extends Data2Entity<TzSfDividend>{
    /**
     * This field corresponds to the database column tz_sf_dividend.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 基金ID
     * This field corresponds to the database column tz_sf_dividend.fundId
     *
     * @mbggenerated
     */
    private Long fundId;

    /**
     * 分红日期
     * This field corresponds to the database column tz_sf_dividend.dividendDate
     *
     * @mbggenerated
     */
    private String dividendDate;

    /**
     * 分红比率
     * This field corresponds to the database column tz_sf_dividend.dividendRatio
     *
     * @mbggenerated
     */
    private String dividendRatio;

    /**
     * 数据来源
     * This field corresponds to the database column tz_sf_dividend.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * 备注
     * This field corresponds to the database column tz_sf_dividend.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_dividend.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_dividend.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_dividend.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_dividend.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_dividend.createUserId
     *
     * @mbggenerated
     */
    private Long createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_dividend.updateUserId
     *
     * @mbggenerated
     */
    private Long updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_dividend.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_dividend.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * This method returns the value of the database column tz_sf_dividend.id
     *
     * @return the value of tz_sf_dividend.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tz_sf_dividend.id
     *
     * @param id the value for tz_sf_dividend.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 基金ID
     * This method returns the value of the database column tz_sf_dividend.fundId
     *
     * @return the value of tz_sf_dividend.fundId
     *
     * @mbggenerated
     */
    public Long getFundId() {
        return fundId;
    }

    /**
     * 基金ID
     * This method sets the value of the database column tz_sf_dividend.fundId
     *
     * @param fundId the value for tz_sf_dividend.fundId
     *
     * @mbggenerated
     */
    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    /**
     * 分红日期
     * This method returns the value of the database column tz_sf_dividend.dividendDate
     *
     * @return the value of tz_sf_dividend.dividendDate
     *
     * @mbggenerated
     */
    public String getDividendDate() {
        return dividendDate;
    }

    /**
     * 分红日期
     * This method sets the value of the database column tz_sf_dividend.dividendDate
     *
     * @param dividendDate the value for tz_sf_dividend.dividendDate
     *
     * @mbggenerated
     */
    public void setDividendDate(String dividendDate) {
        this.dividendDate = dividendDate == null ? null : dividendDate.trim();
    }

    /**
     * 分红比率
     * This method returns the value of the database column tz_sf_dividend.dividendRatio
     *
     * @return the value of tz_sf_dividend.dividendRatio
     *
     * @mbggenerated
     */
    public String getDividendRatio() {
        return dividendRatio;
    }

    /**
     * 分红比率
     * This method sets the value of the database column tz_sf_dividend.dividendRatio
     *
     * @param dividendRatio the value for tz_sf_dividend.dividendRatio
     *
     * @mbggenerated
     */
    public void setDividendRatio(String dividendRatio) {
        this.dividendRatio = dividendRatio == null ? null : dividendRatio.trim();
    }

    /**
     * 数据来源
     * This method returns the value of the database column tz_sf_dividend.source
     *
     * @return the value of tz_sf_dividend.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * 数据来源
     * This method sets the value of the database column tz_sf_dividend.source
     *
     * @param source the value for tz_sf_dividend.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 备注
     * This method returns the value of the database column tz_sf_dividend.remark
     *
     * @return the value of tz_sf_dividend.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * This method sets the value of the database column tz_sf_dividend.remark
     *
     * @param remark the value for tz_sf_dividend.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_dividend.disabled
     *
     * @return the value of tz_sf_dividend.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_dividend.disabled
     *
     * @param disabled the value for tz_sf_dividend.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_dividend.orderNo
     *
     * @return the value of tz_sf_dividend.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_dividend.orderNo
     *
     * @param orderNo the value for tz_sf_dividend.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_dividend.createTime
     *
     * @return the value of tz_sf_dividend.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_dividend.createTime
     *
     * @param createTime the value for tz_sf_dividend.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_dividend.updateTime
     *
     * @return the value of tz_sf_dividend.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_dividend.updateTime
     *
     * @param updateTime the value for tz_sf_dividend.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_dividend.createUserId
     *
     * @return the value of tz_sf_dividend.createUserId
     *
     * @mbggenerated
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_dividend.createUserId
     *
     * @param createUserId the value for tz_sf_dividend.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_dividend.updateUserId
     *
     * @return the value of tz_sf_dividend.updateUserId
     *
     * @mbggenerated
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_dividend.updateUserId
     *
     * @param updateUserId the value for tz_sf_dividend.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_dividend.createUserName
     *
     * @return the value of tz_sf_dividend.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_dividend.createUserName
     *
     * @param createUserName the value for tz_sf_dividend.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_dividend.updateUserName
     *
     * @return the value of tz_sf_dividend.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_dividend.updateUserName
     *
     * @param updateUserName the value for tz_sf_dividend.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

}