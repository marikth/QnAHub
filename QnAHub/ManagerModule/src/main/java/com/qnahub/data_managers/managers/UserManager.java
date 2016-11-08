package com.qnahub.data_managers.managers;

import com.qnahub.common.managers.SuperManager;
import com.qnahub.dao.ifc.UserDAOIfc;
import com.qnahub.data_module.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by markth on 10/23/2016.
 */
@Service
public class UserManager extends SuperManager{


    @Autowired
    private UserDAOIfc userDao;

    public void createUser(UserEntity user){
        userDao.saveUser(user);
    }
}
