package com.testpro.mdaling.factory.prototype;

/**
 * Created by M_DaLing on 2018/3/21.
 */

public class PersonProduct implements IOrder {

    private int orderNum;
    private String orderName;
    private int size;

    @Override
    public String toString() {
        return "PersonProduct{" +
                "orderNum=" + orderNum +
                ", orderName='" + orderName + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public Prototype clonePrototype() {
        PersonProduct personProduct = new PersonProduct();
        personProduct.orderNum = orderNum;
        personProduct.orderName = orderName;
        personProduct.size = 10;
        return personProduct;
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
