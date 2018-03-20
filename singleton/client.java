package com.testpro.mdaling.factory.singleton;

import org.junit.Test;

/**
 * Created by luojin on 2018/3/20.
 */

public class client {

    @Test
    public void Test() {
//        System.out.println(EnumSingle.instance.getIndex());
//        System.out.println(EnumSingle.instance.getName());

        for (int i = 0; i < 20; i++) {
            System.out.println(Connection.getInstance());
        }
    }
}
