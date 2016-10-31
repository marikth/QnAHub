package com.qnahub.common.ifc;

import com.qnahub.common.entity.SuperEntity;

import java.util.Collection;

/**
 * Created by markth on 10/25/2016.
 */
public interface SuperDaoIfc {
    Collection getCollectionBy(Class clazz, String namedQuery, Object... params);

    <T extends SuperEntity> T getSingleEntityBy(Class clazz, String namedQuery, Object... params);

}
