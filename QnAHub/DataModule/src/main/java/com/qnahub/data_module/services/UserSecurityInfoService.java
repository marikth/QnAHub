package com.qnahub.data_module.services;

import com.qnahub.common.services.SuperService;
import com.qnahub.data_module.dao.UserSecurityInfoDAOIfc;
import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by markth on 10/23/2016.
 */
@Service
public class UserSecurityInfoService extends SuperService {

    @Autowired
    private UserSecurityInfoDAOIfc securityInfoDAO;

    public void create(UserAuthenticationInfoEntity securityInfo) {
        securityInfoDAO.create(securityInfo);
    }
}
