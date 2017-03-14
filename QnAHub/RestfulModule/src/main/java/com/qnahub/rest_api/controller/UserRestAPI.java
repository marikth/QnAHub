package com.qnahub.rest_api.controller;

import com.qnahub.data_managers.managers.QanHubAuthenticationManager;
import com.qnahub.data_managers.managers.UserManager;
import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;
import com.qnahub.data_module.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by markth on 11/6/2016.
 */
@RestController
@RequestMapping(value="/user")
public class UserRestAPI {

    @Autowired
    private UserManager userManager;

    @Autowired
    private QanHubAuthenticationManager authenticationManager;



    @RequestMapping(value = "saveUser", method = RequestMethod.POST)
    public ResponseEntity<Boolean> createUser(){
        UserAuthenticationInfoEntity authenticationInfoEntity = new UserAuthenticationInfoEntity();
        authenticationInfoEntity.setPassword("1234");
        authenticationManager.createAuthenticationEntity(authenticationInfoEntity);

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("admin");
        userEntity.setAuthenticationInfo(authenticationInfoEntity);
        userManager.createUser(userEntity);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
