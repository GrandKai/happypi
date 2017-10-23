package com.magic.happypi.business.entity;

public class CustomerReceiverAddress {
    /**
     * 
     * address_id
     */
    private String addressId;

    /**
     * 
     * customer_id
     */
    private String customerId;

    /**
     * 
     * country
     */
    private String country;

    /**
     * 
     * province
     */
    private String province;

    /**
     * 
     * city
     */
    private String city;

    /**
     * 
     * district
     */
    private String district;

    /**
     * 街道
     * street
     */
    private String street;

    /**
     * 
     * detail_address
     */
    private String detailAddress;

    /**
     * 收件人电话
     * receiver_name
     */
    private String receiverName;

    /**
     * 收件人手机号码
     * receiver_mobile
     */
    private String receiverMobile;

    /**
     *
     * @mbg.generated
     */
    public CustomerReceiverAddress(String addressId, String customerId, String country, String province, String city, String district, String street, String detailAddress, String receiverName, String receiverMobile) {
        this.addressId = addressId;
        this.customerId = customerId;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.detailAddress = detailAddress;
        this.receiverName = receiverName;
        this.receiverMobile = receiverMobile;
    }

    /**
     *
     * @mbg.generated
     */
    public CustomerReceiverAddress() {
        super();
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
     * @return country 
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country 
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 
     * @return province 
     */
    public String getProvince() {
        return province;
    }

    /**
     * 
     * @param province 
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 
     * @return city 
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city 
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 
     * @return district 
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 
     * @param district 
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 街道
     * @return street 街道
     */
    public String getStreet() {
        return street;
    }

    /**
     * 街道
     * @param street 街道
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * 
     * @return detail_address 
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 
     * @param detailAddress 
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    /**
     * 收件人电话
     * @return receiver_name 收件人电话
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 收件人电话
     * @param receiverName 收件人电话
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 收件人手机号码
     * @return receiver_mobile 收件人手机号码
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 收件人手机号码
     * @param receiverMobile 收件人手机号码
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }
}