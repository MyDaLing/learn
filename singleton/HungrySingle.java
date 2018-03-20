package com.testpro.mdaling.factory.singleton;

/**
 * 饿汉式
 */

public class HungrySingle {
    private static final HungrySingle single = new HungrySingle();

    private HungrySingle() {
    }

    public static HungrySingle getInstance() {
        return single;
    }
}
