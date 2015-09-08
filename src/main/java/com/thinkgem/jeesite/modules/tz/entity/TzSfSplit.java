package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

public class TzSfSplit {
    /**
     * This field corresponds to the database column tz_sf_split.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 基金ID
     * This field corresponds to the database column tz_sf_split.fundId
     *
     * @mbggenerated
     */
    private Long fundId;

    /**
     * 分拆日期
     * This field corresponds to the database column tz_sf_split.splitDate
     *
     * @mbggenerated
     */
    private String splitDate;

    /**
     * 拆分比例(10:X)
     * This field corresponds to the database column tz_sf_split.splitRatio
     *
     * @mbggenerated
     */
    private String splitRatio;

    /**
     * 数据来源
     * This field corresponds to the database column tz_sf_split.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * 累积拆分系数
     * This field corresponds to the database column tz_sf_split.csr
     *
     * @mbggenerated
     */
    private String csr;

    /**
     * 备注
     * This field corresponds to the database column tz_sf_split.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_split.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_split.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_split.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_split.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_split.createUserId
     *
     * @mbggenerated
     */
    private Long createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_split.updateUserId
     *
     * @mbggenerated
     */
    private Long updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_split.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_split.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * This method returns the value of the database column tz_sf_split.id
     *
     * @return the value of tz_sf_split.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tz_sf_split.id
     *
     * @param id the value for tz_sf_split.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 基金ID
     * This method returns the value of the database column tz_sf_split.fundId
     *
     * @return the value of tz_sf_split.fundId
     *
     * @mbggenerated
     */
    public Long getFundId() {
        return fundId;
    }

    /**
     * 基金ID
     * This method sets the value of the database column tz_sf_split.fundId
     *
     * @param fundId the value for tz_sf_split.fundId
     *
     * @mbggenerated
     */
    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    /**
     * 分拆日期
     * This method returns the value of the database column tz_sf_split.splitDate
     *
     * @return the value of tz_sf_split.splitDate
     *
     * @mbggenerated
     */
    public String getSplitDate() {
        return splitDate;
    }

    /**
     * 分拆日期
     * This method sets the value of the database column tz_sf_split.splitDate
     *
     * @param splitDate the value for tz_sf_split.splitDate
     *
     * @mbggenerated
     */
    public void setSplitDate(String splitDate) {
        this.splitDate = splitDate == null ? null : splitDate.trim();
    }

    /**
     * 拆分比例(10:X)
     * This method returns the value of the database column tz_sf_split.splitRatio
     *
     * @return the value of tz_sf_split.splitRatio
     *
     * @mbggenerated
     */
    public String getSplitRatio() {
        return splitRatio;
    }

    /**
     * 拆分比例(10:X)
     * This method sets the value of the database column tz_sf_split.splitRatio
     *
     * @param splitRatio the value for tz_sf_split.splitRatio
     *
     * @mbggenerated
     */
    public void setSplitRatio(String splitRatio) {
        this.splitRatio = splitRatio == null ? null : splitRatio.trim();
    }

    /**
     * 数据来源
     * This method returns the value of the database column tz_sf_split.source
     *
     * @return the value of tz_sf_split.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * 数据来源
     * This method sets the value of the database column tz_sf_split.source
     *
     * @param source the value for tz_sf_split.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 累积拆分系数
     * This method returns the value of the database column tz_sf_split.csr
     *
     * @return the value of tz_sf_split.csr
     *
     * @mbggenerated
     */
    public String getCsr() {
        return csr;
    }

    /**
     * 累积拆分系数
     * This method sets the value of the database column tz_sf_split.csr
     *
     * @param csr the value for tz_sf_split.csr
     *
     * @mbggenerated
     */
    public void setCsr(String csr) {
        this.csr = csr == null ? null : csr.trim();
    }

    /**
     * 备注
     * This method returns the value of the database column tz_sf_split.remark
     *
     * @return the value of tz_sf_split.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * This method sets the value of the database column tz_sf_split.remark
     *
     * @param remark the value for tz_sf_split.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_split.disabled
     *
     * @return the value of tz_sf_split.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_split.disabled
     *
     * @param disabled the value for tz_sf_split.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_split.orderNo
     *
     * @return the value of tz_sf_split.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_split.orderNo
     *
     * @param orderNo the value for tz_sf_split.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_split.createTime
     *
     * @return the value of tz_sf_split.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_split.createTime
     *
     * @param createTime the value for tz_sf_split.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_split.updateTime
     *
     * @return the value of tz_sf_split.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_split.updateTime
     *
     * @param updateTime the value for tz_sf_split.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_split.createUserId
     *
     * @return the value of tz_sf_split.createUserId
     *
     * @mbggenerated
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_split.createUserId
     *
     * @param createUserId the value for tz_sf_split.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_split.updateUserId
     *
     * @return the value of tz_sf_split.updateUserId
     *
     * @mbggenerated
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_split.updateUserId
     *
     * @param updateUserId the value for tz_sf_split.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_split.createUserName
     *
     * @return the value of tz_sf_split.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_split.createUserName
     *
     * @param createUserName the value for tz_sf_split.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_split.updateUserName
     *
     * @return the value of tz_sf_split.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_split.updateUserName
     *
     * @param updateUserName the value for tz_sf_split.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }
}