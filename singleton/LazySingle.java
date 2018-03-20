package com.testpro.mdaling.factory.singleton;

/**
 * 懒汉式
 */

public class LazySingle {

    private static LazySingle single;

    //加上volatile双重检查
//    private volatile static LazySingle single;

    private LazySingle() {
    }

    public static LazySingle getInstance() {
        if (single == null) {
            synchronized (LazySingle.class) {
                if (single == null) {
                    single = new LazySingle();
                }
            }
        }
        return single;
    }

}
