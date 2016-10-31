package com.qnahub.data_module.auth;

/**
 * Created by markth on 10/25/2016.
 */
public enum LoginStatusEnum {
    SUCCESS(1),
    FAILED(2);

    private final int status;

    LoginStatusEnum(int status){
        this.status = status;
    }
}
