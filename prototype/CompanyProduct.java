package com.testpro.mdaling.factory.prototype;

/**
 * Created by M_DaLing on 2018/3/21.
 */

public class CompanyProduct implements IOrder {

    private int orderNum;
    private String orderName;

    @Override
    public String toString() {
        return "CompanyProduct{" +
                "orderNum=" + orderNum +
                ", orderName='" + orderName + '\'' +
                '}';
    }

    @Override
    public Prototype clonePrototype() {
        CompanyProduct companyProduct = new CompanyProduct();
        companyProduct.orderNum = orderNum;
        companyProduct.orderName = orderName;
        return companyProduct;
    }

    @Override
    public void setOrderNum(int num) {
        this.orderNum = num;
    }

    @Override
    public void setOrderName(String name) {
        this.orderName = name;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public String getOrderName() {
        return orderName;
    }
}
