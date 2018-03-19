package com.testpro.mdaling.factory.factoryModel;

/**
 * Created by luojin on 2018/3/19.
 */

public class AndroidApi implements ApiModel {
    @Override
    public void doThing(String data) {
        System.out.println("android : " + data);
    }
}
