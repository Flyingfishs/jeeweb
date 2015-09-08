package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

public class TzSfOrgIndex {
    /**
     * This field corresponds to the database column tz_sf_org_index.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 基金ID
     * This field corresponds to the database column tz_sf_org_index.fundId
     *
     * @mbggenerated
     */
    private Long fundId;

    /**
     * 机构号
     * This field corresponds to the database column tz_sf_org_index.orgId
     *
     * @mbggenerated
     */
    private Long orgId;

    /**
     * 机构类型号
     * This field corresponds to the database column tz_sf_org_index.orgType
     *
     * @mbggenerated
     */
    private String orgType;

    /**
     * 起始日期
     * This field corresponds to the database column tz_sf_org_index.startDate
     *
     * @mbggenerated
     */
    private String startDate;

    /**
     * 结束日期
     * This field corresponds to the database column tz_sf_org_index.endDate
     *
     * @mbggenerated
     */
    private String endDate;

    /**
     * 显示序号
     * This field corresponds to the database column tz_sf_org_index.dispIndex
     *
     * @mbggenerated
     */
    private Integer dispIndex;

    /**
     * 当前是否有效
     * This field corresponds to the database column tz_sf_org_index.isCurrent
     *
     * @mbggenerated
     */
    private Integer isCurrent;

    /**
     * 备注
     * This field corresponds to the database column tz_sf_org_index.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_org_index.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_org_index.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_org_index.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_org_index.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_org_index.createUserId
     *
     * @mbggenerated
     */
    private Long createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_org_index.updateUserId
     *
     * @mbggenerated
     */
    private Long updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_org_index.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_org_index.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * This method returns the value of the database column tz_sf_org_index.id
     *
     * @return the value of tz_sf_org_index.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tz_sf_org_index.id
     *
     * @param id the value for tz_sf_org_index.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 基金ID
     * This method returns the value of the database column tz_sf_org_index.fundId
     *
     * @return the value of tz_sf_org_index.fundId
     *
     * @mbggenerated
     */
    public Long getFundId() {
        return fundId;
    }

    /**
     * 基金ID
     * This method sets the value of the database column tz_sf_org_index.fundId
     *
     * @param fundId the value for tz_sf_org_index.fundId
     *
     * @mbggenerated
     */
    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    /**
     * 机构号
     * This method returns the value of the database column tz_sf_org_index.orgId
     *
     * @return the value of tz_sf_org_index.orgId
     *
     * @mbggenerated
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 机构号
     * This method sets the value of the database column tz_sf_org_index.orgId
     *
     * @param orgId the value for tz_sf_org_index.orgId
     *
     * @mbggenerated
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 机构类型号
     * This method returns the value of the database column tz_sf_org_index.orgType
     *
     * @return the value of tz_sf_org_index.orgType
     *
     * @mbggenerated
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 机构类型号
     * This method sets the value of the database column tz_sf_org_index.orgType
     *
     * @param orgType the value for tz_sf_org_index.orgType
     *
     * @mbggenerated
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /**
     * 起始日期
     * This method returns the value of the database column tz_sf_org_index.startDate
     *
     * @return the value of tz_sf_org_index.startDate
     *
     * @mbggenerated
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 起始日期
     * This method sets the value of the database column tz_sf_org_index.startDate
     *
     * @param startDate the value for tz_sf_org_index.startDate
     *
     * @mbggenerated
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    /**
     * 结束日期
     * This method returns the value of the database column tz_sf_org_index.endDate
     *
     * @return the value of tz_sf_org_index.endDate
     *
     * @mbggenerated
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 结束日期
     * This method sets the value of the database column tz_sf_org_index.endDate
     *
     * @param endDate the value for tz_sf_org_index.endDate
     *
     * @mbggenerated
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**
     * 显示序号
     * This method returns the value of the database column tz_sf_org_index.dispIndex
     *
     * @return the value of tz_sf_org_index.dispIndex
     *
     * @mbggenerated
     */
    public Integer getDispIndex() {
        return dispIndex;
    }

    /**
     * 显示序号
     * This method sets the value of the database column tz_sf_org_index.dispIndex
     *
     * @param dispIndex the value for tz_sf_org_index.dispIndex
     *
     * @mbggenerated
     */
    public void setDispIndex(Integer dispIndex) {
        this.dispIndex = dispIndex;
    }

    /**
     * 当前是否有效
     * This method returns the value of the database column tz_sf_org_index.isCurrent
     *
     * @return the value of tz_sf_org_index.isCurrent
     *
     * @mbggenerated
     */
    public Integer getIsCurrent() {
        return isCurrent;
    }

    /**
     * 当前是否有效
     * This method sets the value of the database column tz_sf_org_index.isCurrent
     *
     * @param isCurrent the value for tz_sf_org_index.isCurrent
     *
     * @mbggenerated
     */
    public void setIsCurrent(Integer isCurrent) {
        this.isCurrent = isCurrent;
    }

    /**
     * 备注
     * This method returns the value of the database column tz_sf_org_index.remark
     *
     * @return the value of tz_sf_org_index.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * This method sets the value of the database column tz_sf_org_index.remark
     *
     * @param remark the value for tz_sf_org_index.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_org_index.disabled
     *
     * @return the value of tz_sf_org_index.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_org_index.disabled
     *
     * @param disabled the value for tz_sf_org_index.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_org_index.orderNo
     *
     * @return the value of tz_sf_org_index.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_org_index.orderNo
     *
     * @param orderNo the value for tz_sf_org_index.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_org_index.createTime
     *
     * @return the value of tz_sf_org_index.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_org_index.createTime
     *
     * @param createTime the value for tz_sf_org_index.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_org_index.updateTime
     *
     * @return the value of tz_sf_org_index.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_org_index.updateTime
     *
     * @param updateTime the value for tz_sf_org_index.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_org_index.createUserId
     *
     * @return the value of tz_sf_org_index.createUserId
     *
     * @mbggenerated
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_org_index.createUserId
     *
     * @param createUserId the value for tz_sf_org_index.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_org_index.updateUserId
     *
     * @return the value of tz_sf_org_index.updateUserId
     *
     * @mbggenerated
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_org_index.updateUserId
     *
     * @param updateUserId the value for tz_sf_org_index.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_org_index.createUserName
     *
     * @return the value of tz_sf_org_index.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_org_index.createUserName
     *
     * @param createUserName the value for tz_sf_org_index.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_org_index.updateUserName
     *
     * @return the value of tz_sf_org_index.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_org_index.updateUserName
     *
     * @param updateUserName the value for tz_sf_org_index.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }
}