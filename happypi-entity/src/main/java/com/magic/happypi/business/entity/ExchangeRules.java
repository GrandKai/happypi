package com.magic.happypi.business.entity;

import java.math.BigDecimal;

public class ExchangeRules {
    /**
     * 
     * exchange_id
     */
    private String exchangeId;

    /**
     * 兑换名称
     * exchange_name
     */
    private String exchangeName;

    /**
     * 所需积分数量
     * integration
     */
    private BigDecimal integration;

    /**
     *
     * @mbg.generated
     */
    public ExchangeRules(String exchangeId, String exchangeName, BigDecimal integration) {
        this.exchangeId = exchangeId;
        this.exchangeName = exchangeName;
        this.integration = integration;
    }

    /**
     *
     * @mbg.generated
     */
    public ExchangeRules() {
        super();
    }

    /**
     * 
     * @return exchange_id 
     */
    public String getExchangeId() {
        return exchangeId;
    }

    /**
     * 
     * @param exchangeId 
     */
    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId == null ? null : exchangeId.trim();
    }

    /**
     * 兑换名称
     * @return exchange_name 兑换名称
     */
    public String getExchangeName() {
        return exchangeName;
    }

    /**
     * 兑换名称
     * @param exchangeName 兑换名称
     */
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName == null ? null : exchangeName.trim();
    }

    /**
     * 所需积分数量
     * @return integration 所需积分数量
     */
    public BigDecimal getIntegration() {
        return integration;
    }

    /**
     * 所需积分数量
     * @param integration 所需积分数量
     */
    public void setIntegration(BigDecimal integration) {
        this.integration = integration;
    }
}