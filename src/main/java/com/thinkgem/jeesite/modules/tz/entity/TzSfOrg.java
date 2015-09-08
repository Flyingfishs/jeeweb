package com.thinkgem.jeesite.modules.tz.entity;

import java.util.Date;

import com.thinkgem.jeesite.common.persistence.Data2Entity;

public class TzSfOrg extends Data2Entity<TzSfOrg>{
    /**
     * 机构ID
     * This field corresponds to the database column tz_sf_org.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 机构Code
     * This field corresponds to the database column tz_sf_org.orgCode
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * 机构简称
     * This field corresponds to the database column tz_sf_org.orgName
     *
     * @mbggenerated
     */
    private String orgName;

    /**
     * 机构英文简称
     * This field corresponds to the database column tz_sf_org.orgNameEn
     *
     * @mbggenerated
     */
    private String orgNameEn;

    /**
     * 机构全名
     * This field corresponds to the database column tz_sf_org.orgFullName
     *
     * @mbggenerated
     */
    private String orgFullName;

    /**
     * 公司英文名
     * This field corresponds to the database column tz_sf_org.orgFullNameEn
     *
     * @mbggenerated
     */
    private String orgFullNameEn;

    /**
     * 拼音索引
     * This field corresponds to the database column tz_sf_org.namePY
     *
     * @mbggenerated
     */
    private String namePY;

    /**
     * 公司网站
     * This field corresponds to the database column tz_sf_org.orgWeb
     *
     * @mbggenerated
     */
    private String orgWeb;

    /**
     * 用户手机
     * This field corresponds to the database column tz_sf_org.userPhone
     *
     * @mbggenerated
     */
    private String userPhone;

    /**
     * 用户邮箱
     * This field corresponds to the database column tz_sf_org.userEmail
     *
     * @mbggenerated
     */
    private String userEmail;

    /**
     * 联系人联系方式
     * This field corresponds to the database column tz_sf_org.linkmanContact
     *
     * @mbggenerated
     */
    private String linkmanContact;

    /**
     * ogo路径
     * This field corresponds to the database column tz_sf_org.imageurl
     *
     * @mbggenerated
     */
    private String imageurl;

    /**
     * 注册地的国家
     * This field corresponds to the database column tz_sf_org.regCountry
     *
     * @mbggenerated
     */
    private String regCountry;

    /**
     * 注册地的省/直辖市
     * This field corresponds to the database column tz_sf_org.regProv
     *
     * @mbggenerated
     */
    private String regProv;

    /**
     * 注册地的市
     * This field corresponds to the database column tz_sf_org.regCity
     *
     * @mbggenerated
     */
    private String regCity;

    /**
     * 注册地的区
     * This field corresponds to the database column tz_sf_org.regArea
     *
     * @mbggenerated
     */
    private String regArea;

    /**
     * 注册地址
     * This field corresponds to the database column tz_sf_org.regAddress
     *
     * @mbggenerated
     */
    private String regAddress;

    /**
     * 办公地址的国家
     * This field corresponds to the database column tz_sf_org.officeCountry
     *
     * @mbggenerated
     */
    private String officeCountry;

    /**
     * 办公地址的省/直辖市
     * This field corresponds to the database column tz_sf_org.officeProv
     *
     * @mbggenerated
     */
    private String officeProv;

    /**
     * 办公地址的市
     * This field corresponds to the database column tz_sf_org.officeCity
     *
     * @mbggenerated
     */
    private String officeCity;

    /**
     * 办公地址的区
     * This field corresponds to the database column tz_sf_org.officeArea
     *
     * @mbggenerated
     */
    private String officeArea;

    /**
     * 办公地址
     * This field corresponds to the database column tz_sf_org.officeAddress
     *
     * @mbggenerated
     */
    private String officeAddress;

    /**
     * 联系地址1的国家
     * This field corresponds to the database column tz_sf_org.country
     *
     * @mbggenerated
     */
    private String country;

    /**
     * 联系地址1的省/直辖市
     * This field corresponds to the database column tz_sf_org.prov
     *
     * @mbggenerated
     */
    private String prov;

    /**
     * 联系地址1的市
     * This field corresponds to the database column tz_sf_org.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * 联系地址１的区
     * This field corresponds to the database column tz_sf_org.area
     *
     * @mbggenerated
     */
    private String area;

    /**
     * 联系地址1
     * This field corresponds to the database column tz_sf_org.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * 联系电话1
     * This field corresponds to the database column tz_sf_org.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * 联系地址2的国家
     * This field corresponds to the database column tz_sf_org.country2
     *
     * @mbggenerated
     */
    private String country2;

    /**
     * 联系地址2的省/直辖市
     * This field corresponds to the database column tz_sf_org.prov2
     *
     * @mbggenerated
     */
    private String prov2;

    /**
     * 联系地址2的市
     * This field corresponds to the database column tz_sf_org.city2
     *
     * @mbggenerated
     */
    private String city2;

    /**
     * 联系地址2的区
     * This field corresponds to the database column tz_sf_org.area2
     *
     * @mbggenerated
     */
    private String area2;

    /**
     * 联系地址2
     * This field corresponds to the database column tz_sf_org.address2
     *
     * @mbggenerated
     */
    private String address2;

    /**
     * 联系电话2
     * This field corresponds to the database column tz_sf_org.phone2
     *
     * @mbggenerated
     */
    private String phone2;

    /**
     * 联系地址3的国家
     * This field corresponds to the database column tz_sf_org.country3
     *
     * @mbggenerated
     */
    private String country3;

    /**
     * 联系地址3的省/直辖市
     * This field corresponds to the database column tz_sf_org.prov3
     *
     * @mbggenerated
     */
    private String prov3;

    /**
     * 联系地址3的市
     * This field corresponds to the database column tz_sf_org.city3
     *
     * @mbggenerated
     */
    private String city3;

    /**
     * 联系地址3的区
     * This field corresponds to the database column tz_sf_org.area3
     *
     * @mbggenerated
     */
    private String area3;

    /**
     * 联系地址3
     * This field corresponds to the database column tz_sf_org.address3
     *
     * @mbggenerated
     */
    private String address3;

    /**
     * 联系电话3
     * This field corresponds to the database column tz_sf_org.phone3
     *
     * @mbggenerated
     */
    private String phone3;

    /**
     * 公司简介
     * This field corresponds to the database column tz_sf_org.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 公司简介缩略版
     * This field corresponds to the database column tz_sf_org.shortProfile
     *
     * @mbggenerated
     */
    private String shortProfile;

    /**
     * 投研团队
     * This field corresponds to the database column tz_sf_org.team
     *
     * @mbggenerated
     */
    private String team;

    /**
     * 股东结构
     * This field corresponds to the database column tz_sf_org.shareholderStructure
     *
     * @mbggenerated
     */
    private String shareholderStructure;

    /**
     * 研究人员规模
     * This field corresponds to the database column tz_sf_org.researcherScale
     *
     * @mbggenerated
     */
    private String researcherScale;

    /**
     * 投资实务人员规模
     * This field corresponds to the database column tz_sf_org.brokerScale
     *
     * @mbggenerated
     */
    private String brokerScale;

    /**
     * 销售人员规模
     * This field corresponds to the database column tz_sf_org.salesmanScale
     *
     * @mbggenerated
     */
    private String salesmanScale;

    /**
     * 参与的市场
     * This field corresponds to the database column tz_sf_org.market
     *
     * @mbggenerated
     */
    private String market;

    /**
     * 投资理念
     * This field corresponds to the database column tz_sf_org.investmentIdea
     *
     * @mbggenerated
     */
    private String investmentIdea;

    /**
     * 是否接收资产管理(1:是，0否)
     * This field corresponds to the database column tz_sf_org.isAssetMgt
     *
     * @mbggenerated
     */
    private Boolean isAssetMgt;

    /**
     * 资产管理规模
     * This field corresponds to the database column tz_sf_org.assetMgtScale
     *
     * @mbggenerated
     */
    private String assetMgtScale;

    /**
     * 最小资产管理规模
     * This field corresponds to the database column tz_sf_org.minAssetMgtScale
     *
     * @mbggenerated
     */
    private String minAssetMgtScale;

    /**
     * 分成方式
     * This field corresponds to the database column tz_sf_org.sharingMode
     *
     * @mbggenerated
     */
    private String sharingMode;

    /**
     * 资产管理的经纪人分成方式
     * This field corresponds to the database column tz_sf_org.assetBrokerSharingMode
     *
     * @mbggenerated
     */
    private String assetBrokerSharingMode;

    /**
     * 信托的经纪人分成方式
     * This field corresponds to the database column tz_sf_org.trustBrokerSharingMode
     *
     * @mbggenerated
     */
    private String trustBrokerSharingMode;

    /**
     * 经典投资案例
     * This field corresponds to the database column tz_sf_org.cases
     *
     * @mbggenerated
     */
    private String cases;

    /**
     * 注册资本
     * This field corresponds to the database column tz_sf_org.refMoney
     *
     * @mbggenerated
     */
    private String refMoney;

    /**
     * 成立时间
     * This field corresponds to the database column tz_sf_org.buildTime
     *
     * @mbggenerated
     */
    private String buildTime;

    /**
     * 备案证号
     * This field corresponds to the database column tz_sf_org.putNo
     *
     * @mbggenerated
     */
    private String putNo;

    /**
     * 机构类型[]
     * This field corresponds to the database column tz_sf_org.orgType
     *
     * @mbggenerated
     */
    private String orgType;

    /**
     * 目标url
     * This field corresponds to the database column tz_sf_org.targetUrl
     *
     * @mbggenerated
     */
    private String targetUrl;

    /**
     * 备注
     * This field corresponds to the database column tz_sf_org.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 是否删除
     * This field corresponds to the database column tz_sf_org.disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    /**
     * 排序
     * This field corresponds to the database column tz_sf_org.orderNo
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * 创建时间
     * This field corresponds to the database column tz_sf_org.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     * This field corresponds to the database column tz_sf_org.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建用户
     * This field corresponds to the database column tz_sf_org.createUserId
     *
     * @mbggenerated
     */
    private Integer createUserId;

    /**
     * 更新用户
     * This field corresponds to the database column tz_sf_org.updateUserId
     *
     * @mbggenerated
     */
    private Integer updateUserId;

    /**
     * 创建用户名
     * This field corresponds to the database column tz_sf_org.createUserName
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * 更新用户名
     * This field corresponds to the database column tz_sf_org.updateUserName
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * 机构ID
     * This method returns the value of the database column tz_sf_org.id
     *
     * @return the value of tz_sf_org.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 机构ID
     * This method sets the value of the database column tz_sf_org.id
     *
     * @param id the value for tz_sf_org.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 机构Code
     * This method returns the value of the database column tz_sf_org.orgCode
     *
     * @return the value of tz_sf_org.orgCode
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 机构Code
     * This method sets the value of the database column tz_sf_org.orgCode
     *
     * @param orgCode the value for tz_sf_org.orgCode
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 机构简称
     * This method returns the value of the database column tz_sf_org.orgName
     *
     * @return the value of tz_sf_org.orgName
     *
     * @mbggenerated
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 机构简称
     * This method sets the value of the database column tz_sf_org.orgName
     *
     * @param orgName the value for tz_sf_org.orgName
     *
     * @mbggenerated
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 机构英文简称
     * This method returns the value of the database column tz_sf_org.orgNameEn
     *
     * @return the value of tz_sf_org.orgNameEn
     *
     * @mbggenerated
     */
    public String getOrgNameEn() {
        return orgNameEn;
    }

    /**
     * 机构英文简称
     * This method sets the value of the database column tz_sf_org.orgNameEn
     *
     * @param orgNameEn the value for tz_sf_org.orgNameEn
     *
     * @mbggenerated
     */
    public void setOrgNameEn(String orgNameEn) {
        this.orgNameEn = orgNameEn == null ? null : orgNameEn.trim();
    }

    /**
     * 机构全名
     * This method returns the value of the database column tz_sf_org.orgFullName
     *
     * @return the value of tz_sf_org.orgFullName
     *
     * @mbggenerated
     */
    public String getOrgFullName() {
        return orgFullName;
    }

    /**
     * 机构全名
     * This method sets the value of the database column tz_sf_org.orgFullName
     *
     * @param orgFullName the value for tz_sf_org.orgFullName
     *
     * @mbggenerated
     */
    public void setOrgFullName(String orgFullName) {
        this.orgFullName = orgFullName == null ? null : orgFullName.trim();
    }

    /**
     * 公司英文名
     * This method returns the value of the database column tz_sf_org.orgFullNameEn
     *
     * @return the value of tz_sf_org.orgFullNameEn
     *
     * @mbggenerated
     */
    public String getOrgFullNameEn() {
        return orgFullNameEn;
    }

    /**
     * 公司英文名
     * This method sets the value of the database column tz_sf_org.orgFullNameEn
     *
     * @param orgFullNameEn the value for tz_sf_org.orgFullNameEn
     *
     * @mbggenerated
     */
    public void setOrgFullNameEn(String orgFullNameEn) {
        this.orgFullNameEn = orgFullNameEn == null ? null : orgFullNameEn.trim();
    }

    /**
     * 拼音索引
     * This method returns the value of the database column tz_sf_org.namePY
     *
     * @return the value of tz_sf_org.namePY
     *
     * @mbggenerated
     */
    public String getNamePY() {
        return namePY;
    }

    /**
     * 拼音索引
     * This method sets the value of the database column tz_sf_org.namePY
     *
     * @param namePY the value for tz_sf_org.namePY
     *
     * @mbggenerated
     */
    public void setNamePY(String namePY) {
        this.namePY = namePY == null ? null : namePY.trim();
    }

    /**
     * 公司网站
     * This method returns the value of the database column tz_sf_org.orgWeb
     *
     * @return the value of tz_sf_org.orgWeb
     *
     * @mbggenerated
     */
    public String getOrgWeb() {
        return orgWeb;
    }

    /**
     * 公司网站
     * This method sets the value of the database column tz_sf_org.orgWeb
     *
     * @param orgWeb the value for tz_sf_org.orgWeb
     *
     * @mbggenerated
     */
    public void setOrgWeb(String orgWeb) {
        this.orgWeb = orgWeb == null ? null : orgWeb.trim();
    }

    /**
     * 用户手机
     * This method returns the value of the database column tz_sf_org.userPhone
     *
     * @return the value of tz_sf_org.userPhone
     *
     * @mbggenerated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 用户手机
     * This method sets the value of the database column tz_sf_org.userPhone
     *
     * @param userPhone the value for tz_sf_org.userPhone
     *
     * @mbggenerated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 用户邮箱
     * This method returns the value of the database column tz_sf_org.userEmail
     *
     * @return the value of tz_sf_org.userEmail
     *
     * @mbggenerated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 用户邮箱
     * This method sets the value of the database column tz_sf_org.userEmail
     *
     * @param userEmail the value for tz_sf_org.userEmail
     *
     * @mbggenerated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 联系人联系方式
     * This method returns the value of the database column tz_sf_org.linkmanContact
     *
     * @return the value of tz_sf_org.linkmanContact
     *
     * @mbggenerated
     */
    public String getLinkmanContact() {
        return linkmanContact;
    }

    /**
     * 联系人联系方式
     * This method sets the value of the database column tz_sf_org.linkmanContact
     *
     * @param linkmanContact the value for tz_sf_org.linkmanContact
     *
     * @mbggenerated
     */
    public void setLinkmanContact(String linkmanContact) {
        this.linkmanContact = linkmanContact == null ? null : linkmanContact.trim();
    }

    /**
     * ogo路径
     * This method returns the value of the database column tz_sf_org.imageurl
     *
     * @return the value of tz_sf_org.imageurl
     *
     * @mbggenerated
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * ogo路径
     * This method sets the value of the database column tz_sf_org.imageurl
     *
     * @param imageurl the value for tz_sf_org.imageurl
     *
     * @mbggenerated
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    /**
     * 注册地的国家
     * This method returns the value of the database column tz_sf_org.regCountry
     *
     * @return the value of tz_sf_org.regCountry
     *
     * @mbggenerated
     */
    public String getRegCountry() {
        return regCountry;
    }

    /**
     * 注册地的国家
     * This method sets the value of the database column tz_sf_org.regCountry
     *
     * @param regCountry the value for tz_sf_org.regCountry
     *
     * @mbggenerated
     */
    public void setRegCountry(String regCountry) {
        this.regCountry = regCountry == null ? null : regCountry.trim();
    }

    /**
     * 注册地的省/直辖市
     * This method returns the value of the database column tz_sf_org.regProv
     *
     * @return the value of tz_sf_org.regProv
     *
     * @mbggenerated
     */
    public String getRegProv() {
        return regProv;
    }

    /**
     * 注册地的省/直辖市
     * This method sets the value of the database column tz_sf_org.regProv
     *
     * @param regProv the value for tz_sf_org.regProv
     *
     * @mbggenerated
     */
    public void setRegProv(String regProv) {
        this.regProv = regProv == null ? null : regProv.trim();
    }

    /**
     * 注册地的市
     * This method returns the value of the database column tz_sf_org.regCity
     *
     * @return the value of tz_sf_org.regCity
     *
     * @mbggenerated
     */
    public String getRegCity() {
        return regCity;
    }

    /**
     * 注册地的市
     * This method sets the value of the database column tz_sf_org.regCity
     *
     * @param regCity the value for tz_sf_org.regCity
     *
     * @mbggenerated
     */
    public void setRegCity(String regCity) {
        this.regCity = regCity == null ? null : regCity.trim();
    }

    /**
     * 注册地的区
     * This method returns the value of the database column tz_sf_org.regArea
     *
     * @return the value of tz_sf_org.regArea
     *
     * @mbggenerated
     */
    public String getRegArea() {
        return regArea;
    }

    /**
     * 注册地的区
     * This method sets the value of the database column tz_sf_org.regArea
     *
     * @param regArea the value for tz_sf_org.regArea
     *
     * @mbggenerated
     */
    public void setRegArea(String regArea) {
        this.regArea = regArea == null ? null : regArea.trim();
    }

    /**
     * 注册地址
     * This method returns the value of the database column tz_sf_org.regAddress
     *
     * @return the value of tz_sf_org.regAddress
     *
     * @mbggenerated
     */
    public String getRegAddress() {
        return regAddress;
    }

    /**
     * 注册地址
     * This method sets the value of the database column tz_sf_org.regAddress
     *
     * @param regAddress the value for tz_sf_org.regAddress
     *
     * @mbggenerated
     */
    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress == null ? null : regAddress.trim();
    }

    /**
     * 办公地址的国家
     * This method returns the value of the database column tz_sf_org.officeCountry
     *
     * @return the value of tz_sf_org.officeCountry
     *
     * @mbggenerated
     */
    public String getOfficeCountry() {
        return officeCountry;
    }

    /**
     * 办公地址的国家
     * This method sets the value of the database column tz_sf_org.officeCountry
     *
     * @param officeCountry the value for tz_sf_org.officeCountry
     *
     * @mbggenerated
     */
    public void setOfficeCountry(String officeCountry) {
        this.officeCountry = officeCountry == null ? null : officeCountry.trim();
    }

    /**
     * 办公地址的省/直辖市
     * This method returns the value of the database column tz_sf_org.officeProv
     *
     * @return the value of tz_sf_org.officeProv
     *
     * @mbggenerated
     */
    public String getOfficeProv() {
        return officeProv;
    }

    /**
     * 办公地址的省/直辖市
     * This method sets the value of the database column tz_sf_org.officeProv
     *
     * @param officeProv the value for tz_sf_org.officeProv
     *
     * @mbggenerated
     */
    public void setOfficeProv(String officeProv) {
        this.officeProv = officeProv == null ? null : officeProv.trim();
    }

    /**
     * 办公地址的市
     * This method returns the value of the database column tz_sf_org.officeCity
     *
     * @return the value of tz_sf_org.officeCity
     *
     * @mbggenerated
     */
    public String getOfficeCity() {
        return officeCity;
    }

    /**
     * 办公地址的市
     * This method sets the value of the database column tz_sf_org.officeCity
     *
     * @param officeCity the value for tz_sf_org.officeCity
     *
     * @mbggenerated
     */
    public void setOfficeCity(String officeCity) {
        this.officeCity = officeCity == null ? null : officeCity.trim();
    }

    /**
     * 办公地址的区
     * This method returns the value of the database column tz_sf_org.officeArea
     *
     * @return the value of tz_sf_org.officeArea
     *
     * @mbggenerated
     */
    public String getOfficeArea() {
        return officeArea;
    }

    /**
     * 办公地址的区
     * This method sets the value of the database column tz_sf_org.officeArea
     *
     * @param officeArea the value for tz_sf_org.officeArea
     *
     * @mbggenerated
     */
    public void setOfficeArea(String officeArea) {
        this.officeArea = officeArea == null ? null : officeArea.trim();
    }

    /**
     * 办公地址
     * This method returns the value of the database column tz_sf_org.officeAddress
     *
     * @return the value of tz_sf_org.officeAddress
     *
     * @mbggenerated
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * 办公地址
     * This method sets the value of the database column tz_sf_org.officeAddress
     *
     * @param officeAddress the value for tz_sf_org.officeAddress
     *
     * @mbggenerated
     */
    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress == null ? null : officeAddress.trim();
    }

    /**
     * 联系地址1的国家
     * This method returns the value of the database column tz_sf_org.country
     *
     * @return the value of tz_sf_org.country
     *
     * @mbggenerated
     */
    public String getCountry() {
        return country;
    }

    /**
     * 联系地址1的国家
     * This method sets the value of the database column tz_sf_org.country
     *
     * @param country the value for tz_sf_org.country
     *
     * @mbggenerated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 联系地址1的省/直辖市
     * This method returns the value of the database column tz_sf_org.prov
     *
     * @return the value of tz_sf_org.prov
     *
     * @mbggenerated
     */
    public String getProv() {
        return prov;
    }

    /**
     * 联系地址1的省/直辖市
     * This method sets the value of the database column tz_sf_org.prov
     *
     * @param prov the value for tz_sf_org.prov
     *
     * @mbggenerated
     */
    public void setProv(String prov) {
        this.prov = prov == null ? null : prov.trim();
    }

    /**
     * 联系地址1的市
     * This method returns the value of the database column tz_sf_org.city
     *
     * @return the value of tz_sf_org.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * 联系地址1的市
     * This method sets the value of the database column tz_sf_org.city
     *
     * @param city the value for tz_sf_org.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 联系地址１的区
     * This method returns the value of the database column tz_sf_org.area
     *
     * @return the value of tz_sf_org.area
     *
     * @mbggenerated
     */
    public String getArea() {
        return area;
    }

    /**
     * 联系地址１的区
     * This method sets the value of the database column tz_sf_org.area
     *
     * @param area the value for tz_sf_org.area
     *
     * @mbggenerated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 联系地址1
     * This method returns the value of the database column tz_sf_org.address
     *
     * @return the value of tz_sf_org.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * 联系地址1
     * This method sets the value of the database column tz_sf_org.address
     *
     * @param address the value for tz_sf_org.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 联系电话1
     * This method returns the value of the database column tz_sf_org.phone
     *
     * @return the value of tz_sf_org.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系电话1
     * This method sets the value of the database column tz_sf_org.phone
     *
     * @param phone the value for tz_sf_org.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 联系地址2的国家
     * This method returns the value of the database column tz_sf_org.country2
     *
     * @return the value of tz_sf_org.country2
     *
     * @mbggenerated
     */
    public String getCountry2() {
        return country2;
    }

    /**
     * 联系地址2的国家
     * This method sets the value of the database column tz_sf_org.country2
     *
     * @param country2 the value for tz_sf_org.country2
     *
     * @mbggenerated
     */
    public void setCountry2(String country2) {
        this.country2 = country2 == null ? null : country2.trim();
    }

    /**
     * 联系地址2的省/直辖市
     * This method returns the value of the database column tz_sf_org.prov2
     *
     * @return the value of tz_sf_org.prov2
     *
     * @mbggenerated
     */
    public String getProv2() {
        return prov2;
    }

    /**
     * 联系地址2的省/直辖市
     * This method sets the value of the database column tz_sf_org.prov2
     *
     * @param prov2 the value for tz_sf_org.prov2
     *
     * @mbggenerated
     */
    public void setProv2(String prov2) {
        this.prov2 = prov2 == null ? null : prov2.trim();
    }

    /**
     * 联系地址2的市
     * This method returns the value of the database column tz_sf_org.city2
     *
     * @return the value of tz_sf_org.city2
     *
     * @mbggenerated
     */
    public String getCity2() {
        return city2;
    }

    /**
     * 联系地址2的市
     * This method sets the value of the database column tz_sf_org.city2
     *
     * @param city2 the value for tz_sf_org.city2
     *
     * @mbggenerated
     */
    public void setCity2(String city2) {
        this.city2 = city2 == null ? null : city2.trim();
    }

    /**
     * 联系地址2的区
     * This method returns the value of the database column tz_sf_org.area2
     *
     * @return the value of tz_sf_org.area2
     *
     * @mbggenerated
     */
    public String getArea2() {
        return area2;
    }

    /**
     * 联系地址2的区
     * This method sets the value of the database column tz_sf_org.area2
     *
     * @param area2 the value for tz_sf_org.area2
     *
     * @mbggenerated
     */
    public void setArea2(String area2) {
        this.area2 = area2 == null ? null : area2.trim();
    }

    /**
     * 联系地址2
     * This method returns the value of the database column tz_sf_org.address2
     *
     * @return the value of tz_sf_org.address2
     *
     * @mbggenerated
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * 联系地址2
     * This method sets the value of the database column tz_sf_org.address2
     *
     * @param address2 the value for tz_sf_org.address2
     *
     * @mbggenerated
     */
    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    /**
     * 联系电话2
     * This method returns the value of the database column tz_sf_org.phone2
     *
     * @return the value of tz_sf_org.phone2
     *
     * @mbggenerated
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * 联系电话2
     * This method sets the value of the database column tz_sf_org.phone2
     *
     * @param phone2 the value for tz_sf_org.phone2
     *
     * @mbggenerated
     */
    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    /**
     * 联系地址3的国家
     * This method returns the value of the database column tz_sf_org.country3
     *
     * @return the value of tz_sf_org.country3
     *
     * @mbggenerated
     */
    public String getCountry3() {
        return country3;
    }

    /**
     * 联系地址3的国家
     * This method sets the value of the database column tz_sf_org.country3
     *
     * @param country3 the value for tz_sf_org.country3
     *
     * @mbggenerated
     */
    public void setCountry3(String country3) {
        this.country3 = country3 == null ? null : country3.trim();
    }

    /**
     * 联系地址3的省/直辖市
     * This method returns the value of the database column tz_sf_org.prov3
     *
     * @return the value of tz_sf_org.prov3
     *
     * @mbggenerated
     */
    public String getProv3() {
        return prov3;
    }

    /**
     * 联系地址3的省/直辖市
     * This method sets the value of the database column tz_sf_org.prov3
     *
     * @param prov3 the value for tz_sf_org.prov3
     *
     * @mbggenerated
     */
    public void setProv3(String prov3) {
        this.prov3 = prov3 == null ? null : prov3.trim();
    }

    /**
     * 联系地址3的市
     * This method returns the value of the database column tz_sf_org.city3
     *
     * @return the value of tz_sf_org.city3
     *
     * @mbggenerated
     */
    public String getCity3() {
        return city3;
    }

    /**
     * 联系地址3的市
     * This method sets the value of the database column tz_sf_org.city3
     *
     * @param city3 the value for tz_sf_org.city3
     *
     * @mbggenerated
     */
    public void setCity3(String city3) {
        this.city3 = city3 == null ? null : city3.trim();
    }

    /**
     * 联系地址3的区
     * This method returns the value of the database column tz_sf_org.area3
     *
     * @return the value of tz_sf_org.area3
     *
     * @mbggenerated
     */
    public String getArea3() {
        return area3;
    }

    /**
     * 联系地址3的区
     * This method sets the value of the database column tz_sf_org.area3
     *
     * @param area3 the value for tz_sf_org.area3
     *
     * @mbggenerated
     */
    public void setArea3(String area3) {
        this.area3 = area3 == null ? null : area3.trim();
    }

    /**
     * 联系地址3
     * This method returns the value of the database column tz_sf_org.address3
     *
     * @return the value of tz_sf_org.address3
     *
     * @mbggenerated
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * 联系地址3
     * This method sets the value of the database column tz_sf_org.address3
     *
     * @param address3 the value for tz_sf_org.address3
     *
     * @mbggenerated
     */
    public void setAddress3(String address3) {
        this.address3 = address3 == null ? null : address3.trim();
    }

    /**
     * 联系电话3
     * This method returns the value of the database column tz_sf_org.phone3
     *
     * @return the value of tz_sf_org.phone3
     *
     * @mbggenerated
     */
    public String getPhone3() {
        return phone3;
    }

    /**
     * 联系电话3
     * This method sets the value of the database column tz_sf_org.phone3
     *
     * @param phone3 the value for tz_sf_org.phone3
     *
     * @mbggenerated
     */
    public void setPhone3(String phone3) {
        this.phone3 = phone3 == null ? null : phone3.trim();
    }

    /**
     * 公司简介
     * This method returns the value of the database column tz_sf_org.description
     *
     * @return the value of tz_sf_org.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * 公司简介
     * This method sets the value of the database column tz_sf_org.description
     *
     * @param description the value for tz_sf_org.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 公司简介缩略版
     * This method returns the value of the database column tz_sf_org.shortProfile
     *
     * @return the value of tz_sf_org.shortProfile
     *
     * @mbggenerated
     */
    public String getShortProfile() {
        return shortProfile;
    }

    /**
     * 公司简介缩略版
     * This method sets the value of the database column tz_sf_org.shortProfile
     *
     * @param shortProfile the value for tz_sf_org.shortProfile
     *
     * @mbggenerated
     */
    public void setShortProfile(String shortProfile) {
        this.shortProfile = shortProfile == null ? null : shortProfile.trim();
    }

    /**
     * 投研团队
     * This method returns the value of the database column tz_sf_org.team
     *
     * @return the value of tz_sf_org.team
     *
     * @mbggenerated
     */
    public String getTeam() {
        return team;
    }

    /**
     * 投研团队
     * This method sets the value of the database column tz_sf_org.team
     *
     * @param team the value for tz_sf_org.team
     *
     * @mbggenerated
     */
    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    /**
     * 股东结构
     * This method returns the value of the database column tz_sf_org.shareholderStructure
     *
     * @return the value of tz_sf_org.shareholderStructure
     *
     * @mbggenerated
     */
    public String getShareholderStructure() {
        return shareholderStructure;
    }

    /**
     * 股东结构
     * This method sets the value of the database column tz_sf_org.shareholderStructure
     *
     * @param shareholderStructure the value for tz_sf_org.shareholderStructure
     *
     * @mbggenerated
     */
    public void setShareholderStructure(String shareholderStructure) {
        this.shareholderStructure = shareholderStructure == null ? null : shareholderStructure.trim();
    }

    /**
     * 研究人员规模
     * This method returns the value of the database column tz_sf_org.researcherScale
     *
     * @return the value of tz_sf_org.researcherScale
     *
     * @mbggenerated
     */
    public String getResearcherScale() {
        return researcherScale;
    }

    /**
     * 研究人员规模
     * This method sets the value of the database column tz_sf_org.researcherScale
     *
     * @param researcherScale the value for tz_sf_org.researcherScale
     *
     * @mbggenerated
     */
    public void setResearcherScale(String researcherScale) {
        this.researcherScale = researcherScale == null ? null : researcherScale.trim();
    }

    /**
     * 投资实务人员规模
     * This method returns the value of the database column tz_sf_org.brokerScale
     *
     * @return the value of tz_sf_org.brokerScale
     *
     * @mbggenerated
     */
    public String getBrokerScale() {
        return brokerScale;
    }

    /**
     * 投资实务人员规模
     * This method sets the value of the database column tz_sf_org.brokerScale
     *
     * @param brokerScale the value for tz_sf_org.brokerScale
     *
     * @mbggenerated
     */
    public void setBrokerScale(String brokerScale) {
        this.brokerScale = brokerScale == null ? null : brokerScale.trim();
    }

    /**
     * 销售人员规模
     * This method returns the value of the database column tz_sf_org.salesmanScale
     *
     * @return the value of tz_sf_org.salesmanScale
     *
     * @mbggenerated
     */
    public String getSalesmanScale() {
        return salesmanScale;
    }

    /**
     * 销售人员规模
     * This method sets the value of the database column tz_sf_org.salesmanScale
     *
     * @param salesmanScale the value for tz_sf_org.salesmanScale
     *
     * @mbggenerated
     */
    public void setSalesmanScale(String salesmanScale) {
        this.salesmanScale = salesmanScale == null ? null : salesmanScale.trim();
    }

    /**
     * 参与的市场
     * This method returns the value of the database column tz_sf_org.market
     *
     * @return the value of tz_sf_org.market
     *
     * @mbggenerated
     */
    public String getMarket() {
        return market;
    }

    /**
     * 参与的市场
     * This method sets the value of the database column tz_sf_org.market
     *
     * @param market the value for tz_sf_org.market
     *
     * @mbggenerated
     */
    public void setMarket(String market) {
        this.market = market == null ? null : market.trim();
    }

    /**
     * 投资理念
     * This method returns the value of the database column tz_sf_org.investmentIdea
     *
     * @return the value of tz_sf_org.investmentIdea
     *
     * @mbggenerated
     */
    public String getInvestmentIdea() {
        return investmentIdea;
    }

    /**
     * 投资理念
     * This method sets the value of the database column tz_sf_org.investmentIdea
     *
     * @param investmentIdea the value for tz_sf_org.investmentIdea
     *
     * @mbggenerated
     */
    public void setInvestmentIdea(String investmentIdea) {
        this.investmentIdea = investmentIdea == null ? null : investmentIdea.trim();
    }

    /**
     * 是否接收资产管理(1:是，0否)
     * This method returns the value of the database column tz_sf_org.isAssetMgt
     *
     * @return the value of tz_sf_org.isAssetMgt
     *
     * @mbggenerated
     */
    public Boolean getIsAssetMgt() {
        return isAssetMgt;
    }

    /**
     * 是否接收资产管理(1:是，0否)
     * This method sets the value of the database column tz_sf_org.isAssetMgt
     *
     * @param isAssetMgt the value for tz_sf_org.isAssetMgt
     *
     * @mbggenerated
     */
    public void setIsAssetMgt(Boolean isAssetMgt) {
        this.isAssetMgt = isAssetMgt;
    }

    /**
     * 资产管理规模
     * This method returns the value of the database column tz_sf_org.assetMgtScale
     *
     * @return the value of tz_sf_org.assetMgtScale
     *
     * @mbggenerated
     */
    public String getAssetMgtScale() {
        return assetMgtScale;
    }

    /**
     * 资产管理规模
     * This method sets the value of the database column tz_sf_org.assetMgtScale
     *
     * @param assetMgtScale the value for tz_sf_org.assetMgtScale
     *
     * @mbggenerated
     */
    public void setAssetMgtScale(String assetMgtScale) {
        this.assetMgtScale = assetMgtScale == null ? null : assetMgtScale.trim();
    }

    /**
     * 最小资产管理规模
     * This method returns the value of the database column tz_sf_org.minAssetMgtScale
     *
     * @return the value of tz_sf_org.minAssetMgtScale
     *
     * @mbggenerated
     */
    public String getMinAssetMgtScale() {
        return minAssetMgtScale;
    }

    /**
     * 最小资产管理规模
     * This method sets the value of the database column tz_sf_org.minAssetMgtScale
     *
     * @param minAssetMgtScale the value for tz_sf_org.minAssetMgtScale
     *
     * @mbggenerated
     */
    public void setMinAssetMgtScale(String minAssetMgtScale) {
        this.minAssetMgtScale = minAssetMgtScale == null ? null : minAssetMgtScale.trim();
    }

    /**
     * 分成方式
     * This method returns the value of the database column tz_sf_org.sharingMode
     *
     * @return the value of tz_sf_org.sharingMode
     *
     * @mbggenerated
     */
    public String getSharingMode() {
        return sharingMode;
    }

    /**
     * 分成方式
     * This method sets the value of the database column tz_sf_org.sharingMode
     *
     * @param sharingMode the value for tz_sf_org.sharingMode
     *
     * @mbggenerated
     */
    public void setSharingMode(String sharingMode) {
        this.sharingMode = sharingMode == null ? null : sharingMode.trim();
    }

    /**
     * 资产管理的经纪人分成方式
     * This method returns the value of the database column tz_sf_org.assetBrokerSharingMode
     *
     * @return the value of tz_sf_org.assetBrokerSharingMode
     *
     * @mbggenerated
     */
    public String getAssetBrokerSharingMode() {
        return assetBrokerSharingMode;
    }

    /**
     * 资产管理的经纪人分成方式
     * This method sets the value of the database column tz_sf_org.assetBrokerSharingMode
     *
     * @param assetBrokerSharingMode the value for tz_sf_org.assetBrokerSharingMode
     *
     * @mbggenerated
     */
    public void setAssetBrokerSharingMode(String assetBrokerSharingMode) {
        this.assetBrokerSharingMode = assetBrokerSharingMode == null ? null : assetBrokerSharingMode.trim();
    }

    /**
     * 信托的经纪人分成方式
     * This method returns the value of the database column tz_sf_org.trustBrokerSharingMode
     *
     * @return the value of tz_sf_org.trustBrokerSharingMode
     *
     * @mbggenerated
     */
    public String getTrustBrokerSharingMode() {
        return trustBrokerSharingMode;
    }

    /**
     * 信托的经纪人分成方式
     * This method sets the value of the database column tz_sf_org.trustBrokerSharingMode
     *
     * @param trustBrokerSharingMode the value for tz_sf_org.trustBrokerSharingMode
     *
     * @mbggenerated
     */
    public void setTrustBrokerSharingMode(String trustBrokerSharingMode) {
        this.trustBrokerSharingMode = trustBrokerSharingMode == null ? null : trustBrokerSharingMode.trim();
    }

    /**
     * 经典投资案例
     * This method returns the value of the database column tz_sf_org.cases
     *
     * @return the value of tz_sf_org.cases
     *
     * @mbggenerated
     */
    public String getCases() {
        return cases;
    }

    /**
     * 经典投资案例
     * This method sets the value of the database column tz_sf_org.cases
     *
     * @param cases the value for tz_sf_org.cases
     *
     * @mbggenerated
     */
    public void setCases(String cases) {
        this.cases = cases == null ? null : cases.trim();
    }

    /**
     * 注册资本
     * This method returns the value of the database column tz_sf_org.refMoney
     *
     * @return the value of tz_sf_org.refMoney
     *
     * @mbggenerated
     */
    public String getRefMoney() {
        return refMoney;
    }

    /**
     * 注册资本
     * This method sets the value of the database column tz_sf_org.refMoney
     *
     * @param refMoney the value for tz_sf_org.refMoney
     *
     * @mbggenerated
     */
    public void setRefMoney(String refMoney) {
        this.refMoney = refMoney == null ? null : refMoney.trim();
    }

    /**
     * 成立时间
     * This method returns the value of the database column tz_sf_org.buildTime
     *
     * @return the value of tz_sf_org.buildTime
     *
     * @mbggenerated
     */
    public String getBuildTime() {
        return buildTime;
    }

    /**
     * 成立时间
     * This method sets the value of the database column tz_sf_org.buildTime
     *
     * @param buildTime the value for tz_sf_org.buildTime
     *
     * @mbggenerated
     */
    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime == null ? null : buildTime.trim();
    }

    /**
     * 备案证号
     * This method returns the value of the database column tz_sf_org.putNo
     *
     * @return the value of tz_sf_org.putNo
     *
     * @mbggenerated
     */
    public String getPutNo() {
        return putNo;
    }

    /**
     * 备案证号
     * This method sets the value of the database column tz_sf_org.putNo
     *
     * @param putNo the value for tz_sf_org.putNo
     *
     * @mbggenerated
     */
    public void setPutNo(String putNo) {
        this.putNo = putNo == null ? null : putNo.trim();
    }

    /**
     * 机构类型[]
     * This method returns the value of the database column tz_sf_org.orgType
     *
     * @return the value of tz_sf_org.orgType
     *
     * @mbggenerated
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 机构类型[]
     * This method sets the value of the database column tz_sf_org.orgType
     *
     * @param orgType the value for tz_sf_org.orgType
     *
     * @mbggenerated
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /**
     * 目标url
     * This method returns the value of the database column tz_sf_org.targetUrl
     *
     * @return the value of tz_sf_org.targetUrl
     *
     * @mbggenerated
     */
    public String getTargetUrl() {
        return targetUrl;
    }

    /**
     * 目标url
     * This method sets the value of the database column tz_sf_org.targetUrl
     *
     * @param targetUrl the value for tz_sf_org.targetUrl
     *
     * @mbggenerated
     */
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl == null ? null : targetUrl.trim();
    }

    /**
     * 备注
     * This method returns the value of the database column tz_sf_org.remark
     *
     * @return the value of tz_sf_org.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * This method sets the value of the database column tz_sf_org.remark
     *
     * @param remark the value for tz_sf_org.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * This method returns the value of the database column tz_sf_org.disabled
     *
     * @return the value of tz_sf_org.disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 是否删除
     * This method sets the value of the database column tz_sf_org.disabled
     *
     * @param disabled the value for tz_sf_org.disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 排序
     * This method returns the value of the database column tz_sf_org.orderNo
     *
     * @return the value of tz_sf_org.orderNo
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 排序
     * This method sets the value of the database column tz_sf_org.orderNo
     *
     * @param orderNo the value for tz_sf_org.orderNo
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 创建时间
     * This method returns the value of the database column tz_sf_org.createTime
     *
     * @return the value of tz_sf_org.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column tz_sf_org.createTime
     *
     * @param createTime the value for tz_sf_org.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * This method returns the value of the database column tz_sf_org.updateTime
     *
     * @return the value of tz_sf_org.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * This method sets the value of the database column tz_sf_org.updateTime
     *
     * @param updateTime the value for tz_sf_org.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建用户
     * This method returns the value of the database column tz_sf_org.createUserId
     *
     * @return the value of tz_sf_org.createUserId
     *
     * @mbggenerated
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户
     * This method sets the value of the database column tz_sf_org.createUserId
     *
     * @param createUserId the value for tz_sf_org.createUserId
     *
     * @mbggenerated
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新用户
     * This method returns the value of the database column tz_sf_org.updateUserId
     *
     * @return the value of tz_sf_org.updateUserId
     *
     * @mbggenerated
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新用户
     * This method sets the value of the database column tz_sf_org.updateUserId
     *
     * @param updateUserId the value for tz_sf_org.updateUserId
     *
     * @mbggenerated
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 创建用户名
     * This method returns the value of the database column tz_sf_org.createUserName
     *
     * @return the value of tz_sf_org.createUserName
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名
     * This method sets the value of the database column tz_sf_org.createUserName
     *
     * @param createUserName the value for tz_sf_org.createUserName
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 更新用户名
     * This method returns the value of the database column tz_sf_org.updateUserName
     *
     * @return the value of tz_sf_org.updateUserName
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 更新用户名
     * This method sets the value of the database column tz_sf_org.updateUserName
     *
     * @param updateUserName the value for tz_sf_org.updateUserName
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }
}