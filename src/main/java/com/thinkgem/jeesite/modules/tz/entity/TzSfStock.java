package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

public class TzSfStock {
    /**
     * This field corresponds to the database column tz_sf_stock.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 基金ID
     * This field corresponds to the database column tz_sf_stock.fundId
     *
     * @mbggenerated
     */
    private Long fundId;

    /**
     * 股票代码
     * This field corresponds to the database column tz_sf_stock.stockCode
     *
     * @mbggenerated
     */
    private String stockCode;

    /**
     * 股票简称
     * This field corresponds to the database column tz_sf_stock.stockName
     *
     * @mbggenerated
     */
    private String stockName;

    /**
     * 持股数(万股)
     * This field corresponds to the database column tz_sf_stock.stockNum
     *
     * @mbggenerated
     */
    private String stockNum;

    /**
     * 占流通股比例
     * This field corresponds to the database column tz_sf_stock.stockRate
     *
     * @mbggenerated
     */
    private String stockRate;

    /**
     * 持股变动
     * This field corresponds to the database column tz_sf_stock.stockChange
     *
     * @mbggenerated
     */
    private String stockChange;

    /**
     * 变动股数(万股)
     * This field corresponds to the database column tz_sf_stock.changeNum
     *
     * @mbggenerated
     */
    private String changeNum;

    /**
     * 变动比例
     * This field corresponds to the database column tz_sf_stock.changeRate
     *
     * @mbggenerated
     */
    private String changeRate;

    /**
     * 截止日期
     * This field corresponds to the database column tz_sf_stock.endDate
     *
     * @mbggenerated
     */
    private String endDate;

    /**
     * 备注
     * This field corresponds to the database column tz_sf_stock.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_stock.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_stock.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_stock.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_stock.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_stock.createUserId
     *
     * @mbggenerated
     */
    private Long createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_stock.updateUserId
     *
     * @mbggenerated
     */
    private Long updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_stock.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_stock.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * This method returns the value of the database column tz_sf_stock.id
     *
     * @return the value of tz_sf_stock.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tz_sf_stock.id
     *
     * @param id the value for tz_sf_stock.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 基金ID
     * This method returns the value of the database column tz_sf_stock.fundId
     *
     * @return the value of tz_sf_stock.fundId
     *
     * @mbggenerated
     */
    public Long getFundId() {
        return fundId;
    }

    /**
     * 基金ID
     * This method sets the value of the database column tz_sf_stock.fundId
     *
     * @param fundId the value for tz_sf_stock.fundId
     *
     * @mbggenerated
     */
    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    /**
     * 股票代码
     * This method returns the value of the database column tz_sf_stock.stockCode
     *
     * @return the value of tz_sf_stock.stockCode
     *
     * @mbggenerated
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * 股票代码
     * This method sets the value of the database column tz_sf_stock.stockCode
     *
     * @param stockCode the value for tz_sf_stock.stockCode
     *
     * @mbggenerated
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    /**
     * 股票简称
     * This method returns the value of the database column tz_sf_stock.stockName
     *
     * @return the value of tz_sf_stock.stockName
     *
     * @mbggenerated
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * 股票简称
     * This method sets the value of the database column tz_sf_stock.stockName
     *
     * @param stockName the value for tz_sf_stock.stockName
     *
     * @mbggenerated
     */
    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    /**
     * 持股数(万股)
     * This method returns the value of the database column tz_sf_stock.stockNum
     *
     * @return the value of tz_sf_stock.stockNum
     *
     * @mbggenerated
     */
    public String getStockNum() {
        return stockNum;
    }

    /**
     * 持股数(万股)
     * This method sets the value of the database column tz_sf_stock.stockNum
     *
     * @param stockNum the value for tz_sf_stock.stockNum
     *
     * @mbggenerated
     */
    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    /**
     * 占流通股比例
     * This method returns the value of the database column tz_sf_stock.stockRate
     *
     * @return the value of tz_sf_stock.stockRate
     *
     * @mbggenerated
     */
    public String getStockRate() {
        return stockRate;
    }

    /**
     * 占流通股比例
     * This method sets the value of the database column tz_sf_stock.stockRate
     *
     * @param stockRate the value for tz_sf_stock.stockRate
     *
     * @mbggenerated
     */
    public void setStockRate(String stockRate) {
        this.stockRate = stockRate == null ? null : stockRate.trim();
    }

    /**
     * 持股变动
     * This method returns the value of the database column tz_sf_stock.stockChange
     *
     * @return the value of tz_sf_stock.stockChange
     *
     * @mbggenerated
     */
    public String getStockChange() {
        return stockChange;
    }

    /**
     * 持股变动
     * This method sets the value of the database column tz_sf_stock.stockChange
     *
     * @param stockChange the value for tz_sf_stock.stockChange
     *
     * @mbggenerated
     */
    public void setStockChange(String stockChange) {
        this.stockChange = stockChange == null ? null : stockChange.trim();
    }

    /**
     * 变动股数(万股)
     * This method returns the value of the database column tz_sf_stock.changeNum
     *
     * @return the value of tz_sf_stock.changeNum
     *
     * @mbggenerated
     */
    public String getChangeNum() {
        return changeNum;
    }

    /**
     * 变动股数(万股)
     * This method sets the value of the database column tz_sf_stock.changeNum
     *
     * @param changeNum the value for tz_sf_stock.changeNum
     *
     * @mbggenerated
     */
    public void setChangeNum(String changeNum) {
        this.changeNum = changeNum == null ? null : changeNum.trim();
    }

    /**
     * 变动比例
     * This method returns the value of the database column tz_sf_stock.changeRate
     *
     * @return the value of tz_sf_stock.changeRate
     *
     * @mbggenerated
     */
    public String getChangeRate() {
        return changeRate;
    }

    /**
     * 变动比例
     * This method sets the value of the database column tz_sf_stock.changeRate
     *
     * @param changeRate the value for tz_sf_stock.changeRate
     *
     * @mbggenerated
     */
    public void setChangeRate(String changeRate) {
        this.changeRate = changeRate == null ? null : changeRate.trim();
    }

    /**
     * 截止日期
     * This method returns the value of the database column tz_sf_stock.endDate
     *
     * @return the value of tz_sf_stock.endDate
     *
     * @mbggenerated
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 截止日期
     * This method sets the value of the database column tz_sf_stock.endDate
     *
     * @param endDate the value for tz_sf_stock.endDate
     *
     * @mbggenerated
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**
     * 备注
     * This method returns the value of the database column tz_sf_stock.remark
     *
     * @return the value of tz_sf_stock.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * This method sets the value of the database column tz_sf_stock.remark
     *
     * @param remark the value for tz_sf_stock.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_stock.disabled
     *
     * @return the value of tz_sf_stock.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_stock.disabled
     *
     * @param disabled the value for tz_sf_stock.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_stock.orderNo
     *
     * @return the value of tz_sf_stock.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_stock.orderNo
     *
     * @param orderNo the value for tz_sf_stock.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_stock.createTime
     *
     * @return the value of tz_sf_stock.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_stock.createTime
     *
     * @param createTime the value for tz_sf_stock.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_stock.updateTime
     *
     * @return the value of tz_sf_stock.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_stock.updateTime
     *
     * @param updateTime the value for tz_sf_stock.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_stock.createUserId
     *
     * @return the value of tz_sf_stock.createUserId
     *
     * @mbggenerated
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_stock.createUserId
     *
     * @param createUserId the value for tz_sf_stock.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_stock.updateUserId
     *
     * @return the value of tz_sf_stock.updateUserId
     *
     * @mbggenerated
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_stock.updateUserId
     *
     * @param updateUserId the value for tz_sf_stock.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_stock.createUserName
     *
     * @return the value of tz_sf_stock.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_stock.createUserName
     *
     * @param createUserName the value for tz_sf_stock.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_stock.updateUserName
     *
     * @return the value of tz_sf_stock.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_stock.updateUserName
     *
     * @param updateUserName the value for tz_sf_stock.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }
}