package com.qnahub.data_module.dao;

import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;

/**
 * Created by markth on 10/23/2016.
 */
public interface UserSecurityInfoDAOIfc {
    void create(UserAuthenticationInfoEntity securityInfo);
}
