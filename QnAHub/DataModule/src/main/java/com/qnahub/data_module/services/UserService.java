package com.qnahub.data_module.services;

import com.qnahub.common.services.SuperService;
import com.qnahub.data_module.dao.UserDAOIfc;
import com.qnahub.data_module.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by markth on 10/23/2016.
 */
@Service
public class UserService extends SuperService{

    @Autowired
    private UserDAOIfc userDAOIfc;

    @Autowired
    private UserSecurityInfoService securityInfoService;

    public UserEntity getUserMyUsername(String username){
        return null;
    }

    public void create(UserEntity userEntity){
        securityInfoService.create(userEntity.getSecurityInfo());
        userDAOIfc.create(userEntity);


    }
}
