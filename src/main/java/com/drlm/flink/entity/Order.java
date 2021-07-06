package com.drlm.flink.entity;

/**
 * 新增
 *
 * @author guanyq
 * @date 2021/1/22
 */
public class Order {
    /**
     * 原价
     */
    private Double originalPrice;
    /**
     * 实际价格：通过动态规则控制
     */
    private Double realPrice;

    @Override
    public String toString() {
        return "Order{" +
                "originalPrice=" + originalPrice +
                ", realPrice=" + realPrice +
                '}';
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    public Order(Double originalPrice, Double realPrice) {
        this.originalPrice = originalPrice;
        this.realPrice = realPrice;
    }
}
