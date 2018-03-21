package com.testpro.mdaling.factory.prototype;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by M_DaLing on 2018/3/21.
 */

public class client {
    @Test
    public void Test() {
        DeelFactory deelFactory = new DeelFactory();
        CompanyProduct companyProduct = new CompanyProduct();
        companyProduct.setOrderName("company Android phone");
        companyProduct.setOrderNum(10200);
        ArrayList<IOrder> orders = deelFactory.distrOrder(companyProduct);
        for (IOrder order : orders) {
            System.out.println(order.toString());
        }

        PersonProduct personProduct = new PersonProduct();
        personProduct.setOrderName("person Android phone");
        personProduct.setOrderNum(2456);
        ArrayList<IOrder> personOrders = deelFactory.distrOrder(personProduct);
        for (IOrder order : personOrders) {
            System.out.println(order.toString());
        }

    }
}
