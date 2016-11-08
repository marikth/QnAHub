package com.qnahub.dao.managers;

import com.qnahub.common.dao.SuperDao;
import com.qnahub.dao.ifc.UserDAOIfc;
import com.qnahub.data_module.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by markth on 5/2/2016.
 */
@Repository
public class UserDAO extends SuperDao implements UserDAOIfc {

    @Override
    public void saveUser(UserEntity userEntity) {
        entityManagerDAO.persist(userEntity);
    }
}
