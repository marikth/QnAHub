package com.qnahub.dao.managers;

import com.qnahub.common.dao.SuperDao;
import com.qnahub.dao.ifc.UserAuthenticationDAOIfc;
import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by markth on 10/23/2016.
 */
@Repository
public class UserAuthenticationDAO extends SuperDao implements UserAuthenticationDAOIfc {

    public void saveUserAuthentication(UserAuthenticationInfoEntity authenticationInfo) {
        entityManagerDAO.persist(authenticationInfo);
    }
}
