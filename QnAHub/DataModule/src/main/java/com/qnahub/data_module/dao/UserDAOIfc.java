package com.qnahub.data_module.dao;

import com.qnahub.common.ifc.SuperDaoIfc;
import com.qnahub.data_module.entity.UserEntity;

/**
 * Created by markth on 10/23/2016.
 */
public interface UserDAOIfc extends SuperDaoIfc {

    void create(UserEntity userEntity);
}
