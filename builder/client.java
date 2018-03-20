package com.testpro.mdaling.factory.builder;

import org.junit.Test;

/**
 * Created by luojin on 2018/3/20.
 */

public class client {

    @Test
    public void Test() {
        Room room = new WorkBuilder().makeWindow("Floor window").makeFloor("Wood floor").build();
        System.out.println(room);
    }
}
