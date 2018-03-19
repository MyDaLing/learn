package com.testpro.mdaling.factory.factoryModel;

/**
 * Created by luojin on 2018/3/19.
 */

public class IosFactory extends Ifactory {
    @Override
    public ApiModel iFactoryModel() {
        return new IosApi();
    }
}
