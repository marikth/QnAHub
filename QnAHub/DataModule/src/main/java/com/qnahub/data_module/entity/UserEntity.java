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
        @NamedQuery(name = UserEntity.FIND_BY_TOKEN, query = "SELECT o FROM UserEntity o WHERE o.authenticationInfo.authToken = ?1")
})
public class UserEntity extends SuperEntity{
    public static final String FIND_BY_USERNAME = "userEntity.findByUsername";
    public static final String FIND_BY_TOKEN = "userEntity.findByAuthenticationToken";


    @Column(name = "USERNAME")
    private String username;

    @OneToOne
    @JoinColumn(name = "AUTHENTICATION_INFO")
    private UserAuthenticationInfoEntity authenticationInfo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserAuthenticationInfoEntity getAuthenticationInfo() {
        return authenticationInfo;
    }

    public void setAuthenticationInfo(UserAuthenticationInfoEntity authenticationInfo) {
        this.authenticationInfo = authenticationInfo;
    }
}
