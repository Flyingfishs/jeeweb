package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

public class TzSfType {
    /**
     * This field corresponds to the database column tz_sf_type.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 类型code
     * This field corresponds to the database column tz_sf_type.typeCode
     *
     * @mbggenerated
     */
    private String typeCode;

    /**
     * 类型名称
     * This field corresponds to the database column tz_sf_type.typeName
     *
     * @mbggenerated
     */
    private String typeName;

    /**
     * 父级类型id
     * This field corresponds to the database column tz_sf_type.parentCode
     *
     * @mbggenerated
     */
    private String parentCode;

    /**
     * 类型层次
     * This field corresponds to the database column tz_sf_type.levels
     *
     * @mbggenerated
     */
    private Integer levels;

    /**
     * 备注
     * This field corresponds to the database column tz_sf_type.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_type.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_type.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_type.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_type.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_type.createUserId
     *
     * @mbggenerated
     */
    private Long createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_type.updateUserId
     *
     * @mbggenerated
     */
    private Long updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_type.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_type.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * This method returns the value of the database column tz_sf_type.id
     *
     * @return the value of tz_sf_type.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tz_sf_type.id
     *
     * @param id the value for tz_sf_type.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 类型code
     * This method returns the value of the database column tz_sf_type.typeCode
     *
     * @return the value of tz_sf_type.typeCode
     *
     * @mbggenerated
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 类型code
     * This method sets the value of the database column tz_sf_type.typeCode
     *
     * @param typeCode the value for tz_sf_type.typeCode
     *
     * @mbggenerated
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * 类型名称
     * This method returns the value of the database column tz_sf_type.typeName
     *
     * @return the value of tz_sf_type.typeName
     *
     * @mbggenerated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 类型名称
     * This method sets the value of the database column tz_sf_type.typeName
     *
     * @param typeName the value for tz_sf_type.typeName
     *
     * @mbggenerated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * 父级类型id
     * This method returns the value of the database column tz_sf_type.parentCode
     *
     * @return the value of tz_sf_type.parentCode
     *
     * @mbggenerated
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 父级类型id
     * This method sets the value of the database column tz_sf_type.parentCode
     *
     * @param parentCode the value for tz_sf_type.parentCode
     *
     * @mbggenerated
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * 类型层次
     * This method returns the value of the database column tz_sf_type.levels
     *
     * @return the value of tz_sf_type.levels
     *
     * @mbggenerated
     */
    public Integer getLevels() {
        return levels;
    }

    /**
     * 类型层次
     * This method sets the value of the database column tz_sf_type.levels
     *
     * @param levels the value for tz_sf_type.levels
     *
     * @mbggenerated
     */
    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    /**
     * 备注
     * This method returns the value of the database column tz_sf_type.remark
     *
     * @return the value of tz_sf_type.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * This method sets the value of the database column tz_sf_type.remark
     *
     * @param remark the value for tz_sf_type.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_type.disabled
     *
     * @return the value of tz_sf_type.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_type.disabled
     *
     * @param disabled the value for tz_sf_type.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_type.orderNo
     *
     * @return the value of tz_sf_type.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_type.orderNo
     *
     * @param orderNo the value for tz_sf_type.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_type.createTime
     *
     * @return the value of tz_sf_type.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_type.createTime
     *
     * @param createTime the value for tz_sf_type.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_type.updateTime
     *
     * @return the value of tz_sf_type.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_type.updateTime
     *
     * @param updateTime the value for tz_sf_type.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_type.createUserId
     *
     * @return the value of tz_sf_type.createUserId
     *
     * @mbggenerated
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_type.createUserId
     *
     * @param createUserId the value for tz_sf_type.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_type.updateUserId
     *
     * @return the value of tz_sf_type.updateUserId
     *
     * @mbggenerated
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_type.updateUserId
     *
     * @param updateUserId the value for tz_sf_type.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_type.createUserName
     *
     * @return the value of tz_sf_type.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_type.createUserName
     *
     * @param createUserName the value for tz_sf_type.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_type.updateUserName
     *
     * @return the value of tz_sf_type.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_type.updateUserName
     *
     * @param updateUserName the value for tz_sf_type.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }
}