package com.testpro.mdaling.factory.singleton;

/**
 * 静态内部类
 */

public class InnerClassSingle {
    private InnerClassSingle() {
    }

    private static class SingletonHolder {
        private static InnerClassSingle single = new InnerClassSingle();

    }

    public static InnerClassSingle getInstance() {
        return SingletonHolder.single;
    }
}
