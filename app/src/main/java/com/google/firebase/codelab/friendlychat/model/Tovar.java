package com.google.firebase.codelab.friendlychat.model;

/**
 * Created by marlis on 22.12.2016.
 */

public class Tovar {

    private Integer tovareId;
    private String tovarName;
    private Integer amount;
    private Double tovarItemPrice;
    private Double orderTotalPrice;

    public Tovar() {
    }

    public Tovar(Integer tovareId, String tovarName, Integer amount, Double tovarItemPrice, Double orderTotalPrice) {
        this.tovareId = tovareId;
        this.tovarName = tovarName;
        this.amount = amount;
        this.tovarItemPrice = tovarItemPrice;
        this.orderTotalPrice = orderTotalPrice;
    }

    public Integer getTovareId() {
        return tovareId;
    }

    public void setTovareId(Integer tovareId) {
        this.tovareId = tovareId;
    }

    public String getTovarName() {
        return tovarName;
    }

    public void setTovarName(String tovarName) {
        this.tovarName = tovarName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getTovarItemPrice() {
        return tovarItemPrice;
    }

    public void setTovarItemPrice(Double tovarItemPrice) {
        this.tovarItemPrice = tovarItemPrice;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "tovareId=" + tovareId +
                ", tovarName='" + tovarName + '\'' +
                ", amount=" + amount +
                ", tovarItemPrice=" + tovarItemPrice +
                ", orderTotalPrice=" + orderTotalPrice +
                '}';
    }
}
