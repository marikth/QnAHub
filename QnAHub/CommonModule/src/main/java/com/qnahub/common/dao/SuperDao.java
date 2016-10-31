package com.qnahub.common.dao;

import com.qnahub.common.entity.SuperEntity;
import com.qnahub.common.ifc.SuperDaoIfc;
import com.qnahub.common.session.EntityManagerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by markth on 10/23/2016.
 */
@Transactional
public abstract class SuperDao implements SuperDaoIfc {

    @Autowired
    protected EntityManagerDAO entityManagerDAO = null;

    public Collection getCollectionBy(Class clazz, String namedQuery, Object... params) {
        return entityManagerDAO.getCollectionBy(clazz, namedQuery, params);
    }

    public <T extends SuperEntity> T getSingleEntityBy(Class clazz, String namedQuery, Object... params) {
        return entityManagerDAO.getSingleEntityBy(clazz, namedQuery, params);
    }


}
