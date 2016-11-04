package com.qnahub.data_managers.managers;

import com.qnahub.common.managers.SuperManager;
import com.qnahub.data_module.entity.UserEntity;
import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;
import com.qnahub.data_module.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


/**
 * Created by markth on 10/23/2016.
 */
@Service
public class UserManager extends SuperManager{

    @Autowired
    private UserService userService;

    public void createUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("admin");
        UserAuthenticationInfoEntity securityInfoEntity = new UserAuthenticationInfoEntity();
        securityInfoEntity.setPassword("1234");
       // securityInfoEntity.setPasswordCreateDate(LocalDateTime.now());
        userEntity.setSecurityInfo(securityInfoEntity);
        userService.create(userEntity);
    }
}
