package com.qnahub.data_module.services;

import com.qnahub.common.services.SuperService;
import com.qnahub.data_module.dao.UserDAOIfc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by markth on 10/23/2016.
 */
@Service
public class AuthenticationService extends SuperService{
    @Autowired
    private UserDAOIfc userDAOIfc;
}
