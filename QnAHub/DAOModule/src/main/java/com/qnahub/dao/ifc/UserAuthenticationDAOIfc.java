package com.qnahub.dao.ifc;

import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;

/**
 * Created by markth on 10/23/2016.
 */
public interface UserAuthenticationDAOIfc {
    void saveUserAuthentication(UserAuthenticationInfoEntity securityInfo);
}
