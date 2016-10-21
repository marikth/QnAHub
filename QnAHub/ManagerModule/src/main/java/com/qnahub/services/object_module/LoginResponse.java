package com.qnahub.services.object_module;

/**
 * Created by markth on 10/20/2016.
 */
public class LoginResponse {

    protected String token = "asdasdasd";

    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
