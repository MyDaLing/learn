package com.testpro.mdaling.factory.factoryModel;

import org.junit.Test;

/**
 * Created by luojin on 2018/3/19.
 */

public class client {

    @Test
    public void test() {

        new AndroidApi().doThing("start");
        new IosApi().doThing("start");

    }
}
