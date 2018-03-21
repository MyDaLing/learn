package com.testpro.mdaling.factory.prototype;

/**
 * Created by M_DaLing on 2018/3/21.
 */

public interface IOrder extends Prototype {

    void setOrderNum(int num);

    void setOrderName(String name);

    int getOrderNum();

    String getOrderName();
}
