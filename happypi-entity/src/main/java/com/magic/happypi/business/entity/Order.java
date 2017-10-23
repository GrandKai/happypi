package com.magic.happypi.business.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     * 
     * order_id
     */
    private String orderId;

    /**
     * 
     * customer_id
     */
    private String customerId;

    /**
     * 
     * product_id
     */
    private String productId;

    /**
     * 订单时间
     * order_time
     */
    private Date orderTime;

    /**
     * 订单编号
     * order_no
     */
    private String orderNo;

    /**
     * 支付方式，1：微信，2：支付宝，3：银行卡，4：网银
     * pay_type
     */
    private String payType;

    /**
     * 订单状态：1：代付款，2：代发货，3：待收货，4：待评价：5：退款/售后， 6：完成交易，7：交易关闭
     * order_status
     */
    private String orderStatus;

    /**
     * 收货人姓名
     * receiver
     */
    private String receiver;

    /**
     * 收货人手机号
     * receiver_mobile
     */
    private String receiverMobile;

    /**
     * 收货人地址
     * receiver_address
     */
    private String receiverAddress;

    /**
     * 运费
     * freight
     */
    private BigDecimal freight;

    /**
     * 抵扣金额
     * deduction
     */
    private BigDecimal deduction;

    /**
     * 实付款（含运费）
     * actual_payment
     */
    private BigDecimal actualPayment;

    /**
     *
     * @mbg.generated
     */
    public Order(String orderId, String customerId, String productId, Date orderTime, String orderNo, String payType, String orderStatus, String receiver, String receiverMobile, String receiverAddress, BigDecimal freight, BigDecimal deduction, BigDecimal actualPayment) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.orderTime = orderTime;
        this.orderNo = orderNo;
        this.payType = payType;
        this.orderStatus = orderStatus;
        this.receiver = receiver;
        this.receiverMobile = receiverMobile;
        this.receiverAddress = receiverAddress;
        this.freight = freight;
        this.deduction = deduction;
        this.actualPayment = actualPayment;
    }

    /**
     *
     * @mbg.generated
     */
    public Order() {
        super();
    }

    /**
     * 
     * @return order_id 
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 
     * @param orderId 
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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
     * 订单时间
     * @return order_time 订单时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 订单时间
     * @param orderTime 订单时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 订单编号
     * @return order_no 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 订单编号
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 支付方式，1：微信，2：支付宝，3：银行卡，4：网银
     * @return pay_type 支付方式，1：微信，2：支付宝，3：银行卡，4：网银
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 支付方式，1：微信，2：支付宝，3：银行卡，4：网银
     * @param payType 支付方式，1：微信，2：支付宝，3：银行卡，4：网银
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * 订单状态：1：代付款，2：代发货，3：待收货，4：待评价：5：退款/售后， 6：完成交易，7：交易关闭
     * @return order_status 订单状态：1：代付款，2：代发货，3：待收货，4：待评价：5：退款/售后， 6：完成交易，7：交易关闭
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态：1：代付款，2：代发货，3：待收货，4：待评价：5：退款/售后， 6：完成交易，7：交易关闭
     * @param orderStatus 订单状态：1：代付款，2：代发货，3：待收货，4：待评价：5：退款/售后， 6：完成交易，7：交易关闭
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * 收货人姓名
     * @return receiver 收货人姓名
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 收货人姓名
     * @param receiver 收货人姓名
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * 收货人手机号
     * @return receiver_mobile 收货人手机号
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 收货人手机号
     * @param receiverMobile 收货人手机号
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * 收货人地址
     * @return receiver_address 收货人地址
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 收货人地址
     * @param receiverAddress 收货人地址
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * 运费
     * @return freight 运费
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * 运费
     * @param freight 运费
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * 抵扣金额
     * @return deduction 抵扣金额
     */
    public BigDecimal getDeduction() {
        return deduction;
    }

    /**
     * 抵扣金额
     * @param deduction 抵扣金额
     */
    public void setDeduction(BigDecimal deduction) {
        this.deduction = deduction;
    }

    /**
     * 实付款（含运费）
     * @return actual_payment 实付款（含运费）
     */
    public BigDecimal getActualPayment() {
        return actualPayment;
    }

    /**
     * 实付款（含运费）
     * @param actualPayment 实付款（含运费）
     */
    public void setActualPayment(BigDecimal actualPayment) {
        this.actualPayment = actualPayment;
    }
}