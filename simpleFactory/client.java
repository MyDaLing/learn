package com.testpro.mdaling.factory.simpleFactory;

import org.junit.Test;

/**
 * Created by luojin on 2018/3/19.
 */

public class client {

    @Test
    public void test() {
        ApiModel apiModel = Factory.createApi(Api.API_MODEL_ONE);
        apiModel.doThing();
        apiModel = Factory.createApi(Api.API_MODEL_TWO);
        apiModel.doThing();
        apiModel = Factory.createApi(Api.API_MODEL_THREE);
        apiModel.doThing();
    }
}
