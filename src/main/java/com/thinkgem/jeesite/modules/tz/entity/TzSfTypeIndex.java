package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

public class TzSfTypeIndex {
    /**
     * This field corresponds to the database column tz_sf_type_index.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 基金ID
     * This field corresponds to the database column tz_sf_type_index.fundId
     *
     * @mbggenerated
     */
    private Long fundId;

    /**
     * 产品类型id
     * This field corresponds to the database column tz_sf_type_index.typeCode
     *
     * @mbggenerated
     */
    private String typeCode;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_type_index.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_type_index.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_type_index.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_type_index.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_type_index.createUserId
     *
     * @mbggenerated
     */
    private Long createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_type_index.updateUserId
     *
     * @mbggenerated
     */
    private Long updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_type_index.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_type_index.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * This method returns the value of the database column tz_sf_type_index.id
     *
     * @return the value of tz_sf_type_index.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tz_sf_type_index.id
     *
     * @param id the value for tz_sf_type_index.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 基金ID
     * This method returns the value of the database column tz_sf_type_index.fundId
     *
     * @return the value of tz_sf_type_index.fundId
     *
     * @mbggenerated
     */
    public Long getFundId() {
        return fundId;
    }

    /**
     * 基金ID
     * This method sets the value of the database column tz_sf_type_index.fundId
     *
     * @param fundId the value for tz_sf_type_index.fundId
     *
     * @mbggenerated
     */
    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    /**
     * 产品类型id
     * This method returns the value of the database column tz_sf_type_index.typeCode
     *
     * @return the value of tz_sf_type_index.typeCode
     *
     * @mbggenerated
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 产品类型id
     * This method sets the value of the database column tz_sf_type_index.typeCode
     *
     * @param typeCode the value for tz_sf_type_index.typeCode
     *
     * @mbggenerated
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_type_index.disabled
     *
     * @return the value of tz_sf_type_index.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_type_index.disabled
     *
     * @param disabled the value for tz_sf_type_index.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_type_index.orderNo
     *
     * @return the value of tz_sf_type_index.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_type_index.orderNo
     *
     * @param orderNo the value for tz_sf_type_index.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_type_index.createTime
     *
     * @return the value of tz_sf_type_index.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_type_index.createTime
     *
     * @param createTime the value for tz_sf_type_index.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_type_index.updateTime
     *
     * @return the value of tz_sf_type_index.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_type_index.updateTime
     *
     * @param updateTime the value for tz_sf_type_index.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_type_index.createUserId
     *
     * @return the value of tz_sf_type_index.createUserId
     *
     * @mbggenerated
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_type_index.createUserId
     *
     * @param createUserId the value for tz_sf_type_index.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_type_index.updateUserId
     *
     * @return the value of tz_sf_type_index.updateUserId
     *
     * @mbggenerated
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_type_index.updateUserId
     *
     * @param updateUserId the value for tz_sf_type_index.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_type_index.createUserName
     *
     * @return the value of tz_sf_type_index.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_type_index.createUserName
     *
     * @param createUserName the value for tz_sf_type_index.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_type_index.updateUserName
     *
     * @return the value of tz_sf_type_index.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_type_index.updateUserName
     *
     * @param updateUserName the value for tz_sf_type_index.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }
}