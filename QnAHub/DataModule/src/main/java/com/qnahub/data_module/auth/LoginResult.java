package com.qnahub.data_module.auth;

import com.qnahub.data_module.entity.UserEntity;

/**
 * Created by markth on 10/25/2016.
 */
public class LoginResult {
    protected LoginStatusEnum statusEnum;
    protected UserEntity loggedInUser;
    protected boolean isAdmin;

    public LoginResult(LoginStatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public LoginResult(LoginStatusEnum statusEnum, UserEntity loggedInUser, boolean isAdmin) {
        this.statusEnum = statusEnum;
        this.loggedInUser = loggedInUser;
        this.isAdmin = isAdmin;
    }

    public LoginStatusEnum getStatusEnum() {
        return statusEnum;
    }

    public UserEntity getLoggedInUser() {
        return loggedInUser;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
