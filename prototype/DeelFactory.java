package com.testpro.mdaling.factory.prototype;

import java.util.ArrayList;

/**
 * Created by M_DaLing on 2018/3/21.
 */

public class DeelFactory {

    /**
     * 工厂一个订单最多生产1000个产品
     *
     * @param iOrder
     * @return
     */
    public ArrayList<IOrder> distrOrder(IOrder iOrder) {

        ArrayList<IOrder> orders = new ArrayList<>();
        int orderNum = iOrder.getOrderNum();
        while (orderNum > 0) {
            IOrder iOrder1 = (IOrder) iOrder.clonePrototype();
            iOrder1.setOrderName(iOrder.getOrderName());
            iOrder1.setOrderNum(orderNum > 1000 ? 1000 : orderNum);
            orders.add(iOrder1);
            orderNum -= 1000;
        }
        return orders;
    }

}
