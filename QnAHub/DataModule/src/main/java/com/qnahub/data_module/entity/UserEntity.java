package com.qnahub.data_module.entity;

import com.qnahub.common.entity.SuperEntity;

import javax.persistence.*;

/**
 * Created by markth on 4/13/2016.
 */
@Entity
@Table(name = "USER")
@NamedQueries({
        @NamedQuery(name = UserEntity.FIND_BY_USERNAME, query = "SELECT o FROM UserEntity o WHERE o.username = ?1"),
        @NamedQuery(name = UserEntity.FIND_BY_TOKEN, query = "SELECT o FROM UserEntity o WHERE o.securityInfo.authToken = ?1")
})
public class UserEntity extends SuperEntity{
    public static final String FIND_BY_USERNAME = "findByUsername";
    public static final String FIND_BY_TOKEN = "findByAuthenticationToken";


    @Column(name = "USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn(name = "SECURITY_INFO")
    private UserAuthenticationInfoEntity securityInfo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserAuthenticationInfoEntity getSecurityInfo() {
        return securityInfo;
    }

    public void setSecurityInfo(UserAuthenticationInfoEntity securityInfo) {
        this.securityInfo = securityInfo;
    }
}
