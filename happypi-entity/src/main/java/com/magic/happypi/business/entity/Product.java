package com.magic.happypi.business.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    /**
     * 
     * product_id
     */
    private String productId;

    /**
     * 
     * product_name
     */
    private String productName;

    /**
     * 产品价格
     * product_price
     */
    private BigDecimal productPrice;

    /**
     * 产品剩余数量
     * product_count
     */
    private BigDecimal productCount;

    /**
     * 产品兑换所需积分
     * integration
     */
    private BigDecimal integration;

    /**
     * 产品描述
     * product_description
     */
    private String productDescription;

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
     * @mbg.generated
     */
    public Product(String productId, String productName, BigDecimal productPrice, BigDecimal productCount, BigDecimal integration, String productDescription, Date createTime, String createBy, Date updateTime, String updateBy) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
        this.integration = integration;
        this.productDescription = productDescription;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
    }

    /**
     *
     * @mbg.generated
     */
    public Product() {
        super();
    }

    /**
     * 
     * @return product_id 
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId 
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * 
     * @return product_name 
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 
     * @param productName 
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 产品价格
     * @return product_price 产品价格
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * 产品价格
     * @param productPrice 产品价格
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 产品剩余数量
     * @return product_count 产品剩余数量
     */
    public BigDecimal getProductCount() {
        return productCount;
    }

    /**
     * 产品剩余数量
     * @param productCount 产品剩余数量
     */
    public void setProductCount(BigDecimal productCount) {
        this.productCount = productCount;
    }

    /**
     * 产品兑换所需积分
     * @return integration 产品兑换所需积分
     */
    public BigDecimal getIntegration() {
        return integration;
    }

    /**
     * 产品兑换所需积分
     * @param integration 产品兑换所需积分
     */
    public void setIntegration(BigDecimal integration) {
        this.integration = integration;
    }

    /**
     * 产品描述
     * @return product_description 产品描述
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * 产品描述
     * @param productDescription 产品描述
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
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
}