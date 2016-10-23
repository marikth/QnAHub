package com.qnahub.data_module.auth.entity;

import com.qnahub.common.entity.SuperEntity;

import javax.persistence.*;

/**
 * Created by markth on 4/13/2016.
 */
@Entity
@Table(name = "USER")
public class User extends SuperEntity{

    @Column(name = "USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn(name = "SECURITY_INFO")
    private UserSecurityInfo securityInfo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserSecurityInfo getSecurityInfo() {
        return securityInfo;
    }

    public void setSecurityInfo(UserSecurityInfo securityInfo) {
        this.securityInfo = securityInfo;
    }
}
