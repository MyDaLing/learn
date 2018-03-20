package com.testpro.mdaling.factory.singleton;

/**
 * Created by luojin on 2018/3/20.
 */

public enum EnumSingle {

    instance(1, "2");

    private int index;
    private String name;

    EnumSingle(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

}
