package com.hp.domain;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class TOrders implements Serializable {
    private Integer id;

    private String ordersName;

    private Double price;

    private Integer alipay;

    private String address;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersName() {
        return ordersName;
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName == null ? null : ordersName.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAlipay() {
        return alipay;
    }

    public void setAlipay(Integer alipay) {
        this.alipay = alipay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}