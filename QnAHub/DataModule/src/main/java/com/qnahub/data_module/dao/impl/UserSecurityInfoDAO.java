package com.qnahub.data_module.dao.impl;

import com.qnahub.common.dao.SuperDao;
import com.qnahub.data_module.dao.UserSecurityInfoDAOIfc;
import com.qnahub.data_module.entity.UserAuthenticationInfoEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by markth on 10/23/2016.
 */
@Repository
public class UserSecurityInfoDAO extends SuperDao implements UserSecurityInfoDAOIfc {

    public void create(UserAuthenticationInfoEntity securityInfoEntity) {
        entityManagerDAO.persist(securityInfoEntity);
    }
}
