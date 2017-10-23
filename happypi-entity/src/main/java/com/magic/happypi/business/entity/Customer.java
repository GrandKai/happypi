package com.magic.happypi.business.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    /**
     * 
     * customer_id
     */
    private String customerId;

    /**
     * 
     * customer_name
     */
    private String customerName;

    /**
     * 出生日期
     * birthday
     */
    private Date birthday;

    /**
     * 用户昵称
     * nickname
     */
    private String nickname;

    /**
     * 头像
     * head_pic
     */
    private String headPic;

    /**
     * 手机号
     * mobile
     */
    private String mobile;

    /**
     * 性别，1：男，2：女
     * gender
     */
    private String gender;

    /**
     * 国家
     * country
     */
    private String country;

    /**
     * 省
     * province
     */
    private String province;

    /**
     * 市
     * city
     */
    private String city;

    /**
     * 区
     * district
     */
    private String district;

    /**
     * 备注
     * remark
     */
    private String remark;

    /**
     * 个人签名
     * whatsup
     */
    private String whatsup;

    /**
     * 
     * create_time
     */
    private Date createTime;

    /**
     * 
     * create_by
     */
    private String createBy;

    /**
     * 
     * update_time
     */
    private Date updateTime;

    /**
     * 
     * update_by
     */
    private String updateBy;

    /**
     * 
     * address_id
     */
    private String addressId;

    /**
     * 
     * integration
     */
    private BigDecimal integration;

    /**
     *
     * @mbg.generated
     */
    public Customer(String customerId, String customerName, Date birthday, String nickname, String headPic, String mobile, String gender, String country, String province, String city, String district, String remark, String whatsup, Date createTime, String createBy, Date updateTime, String updateBy, String addressId, BigDecimal integration) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.birthday = birthday;
        this.nickname = nickname;
        this.headPic = headPic;
        this.mobile = mobile;
        this.gender = gender;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.remark = remark;
        this.whatsup = whatsup;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
        this.addressId = addressId;
        this.integration = integration;
    }

    /**
     *
     * @mbg.generated
     */
    public Customer() {
        super();
    }

    /**
     * 
     * @return customer_id 
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 
     * @param customerId 
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * 
     * @return customer_name 
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 
     * @param customerName 
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 出生日期
     * @return birthday 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 出生日期
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 用户昵称
     * @return nickname 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 用户昵称
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 头像
     * @return head_pic 头像
     */
    public String getHeadPic() {
        return headPic;
    }

    /**
     * 头像
     * @param headPic 头像
     */
    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    /**
     * 手机号
     * @return mobile 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 性别，1：男，2：女
     * @return gender 性别，1：男，2：女
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别，1：男，2：女
     * @param gender 性别，1：男，2：女
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 国家
     * @return country 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 省
     * @return province 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 市
     * @return city 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 区
     * @return district 区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 区
     * @param district 区
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 个人签名
     * @return whatsup 个人签名
     */
    public String getWhatsup() {
        return whatsup;
    }

    /**
     * 个人签名
     * @param whatsup 个人签名
     */
    public void setWhatsup(String whatsup) {
        this.whatsup = whatsup == null ? null : whatsup.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 
     * @return update_by 
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 
     * @param updateBy 
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 
     * @return address_id 
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * 
     * @param addressId 
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    /**
     * 
     * @return integration 
     */
    public BigDecimal getIntegration() {
        return integration;
    }

    /**
     * 
     * @param integration 
     */
    public void setIntegration(BigDecimal integration) {
        this.integration = integration;
    }
}