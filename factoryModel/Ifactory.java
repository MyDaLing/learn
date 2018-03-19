package com.testpro.mdaling.factory.factoryModel;

/**
 * Created by luojin on 2018/3/19.
 */

public abstract class Ifactory {

    public abstract ApiModel iFactoryModel();

    public void dothing(String data) {
        ApiModel apiModel = iFactoryModel();
        apiModel.doThing(data);
    }

}
