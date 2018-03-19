package com.testpro.mdaling.factory.simpleFactory;

/**
 * Created by luojin on 2018/3/19.
 */

public class Factory {

    public static ApiModel createApi(int api) {

        ApiModel apiModel = null;

        switch (api) {
            case Api.API_MODEL_ONE:
                apiModel = new ApiModelOne();
                break;
            case Api.API_MODEL_TWO:
                apiModel = new ApiModelTwo();
                break;
            case Api.API_MODEL_THREE:
                apiModel = new ApiModelThree();
                break;
        }
        return apiModel;
    }
}
