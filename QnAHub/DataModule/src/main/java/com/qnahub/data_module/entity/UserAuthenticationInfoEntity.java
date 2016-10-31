package com.qnahub.data_module.entity;

import com.qnahub.common.entity.SuperEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by markth on 10/22/2016.
 */
@Entity
@Table(name = "USER_AUTHENTICATION_INFO")
public class UserAuthenticationInfoEntity extends SuperEntity {

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "PASSWORD_CREATE_DATE")
    private Date passwordCreateDate;

    @Column(name = "LOGIN_FAILED_ATTEMPTS")
    private Integer loginFaileddAttempts;

    @Column(name = "LAST_LOGIN")
    private Date lastLogin;

    @Column(name = "AUTH_TOKEN")
    private String authToken;

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getPasswordCreateDate() {
        return passwordCreateDate;
    }

    public void setPasswordCreateDate(Date passwordCreateDate) {
        this.passwordCreateDate = passwordCreateDate;
    }

    public Integer getLoginFaileddAttempts() {
        return loginFaileddAttempts;
    }

    public void setLoginFaileddAttempts(Integer loginFaileddAttempts) {
        this.loginFaileddAttempts = loginFaileddAttempts;
    }
}
