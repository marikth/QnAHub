package com.qnahub.rest_api.response;

/**
 * Created by markth on 10/25/2016.
 */
public class LoginResponse extends SuperRestResponse{
    protected String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
