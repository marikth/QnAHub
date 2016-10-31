package com.qnahub.common.session;

import com.qnahub.common.entity.SuperEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;
import java.util.List;

/**
 * Created by markth on 5/2/2016.
 */
@Component
public class EntityManagerDAO {

    @PersistenceContext
    protected EntityManager em;

    public void persist(SuperEntity entity) {
        em.persist(entity);
    }

    public Collection getCollectionBy(Class clazz, String namedQuery, Object[] params) {
        Query query = createNamedQuery(clazz, namedQuery, params);
        List resultList = query.getResultList();

        return resultList;
    }

    private Query createNamedQuery(Class clazz, String namedQuery, Object[] params) {
        Query query = em.createNamedQuery(namedQuery, clazz);
        int indx = 1;
        for(Object param : params) {
            query.setParameter(indx++, param);
        }
        return query;
    }

    public <T> T getSingleEntityBy(Class clazz, String namedQuery, Object[] params){
        Query query = createNamedQuery(clazz, namedQuery, params);
        Collection collection = getCollectionBy(clazz, namedQuery, params);
        if(collection.size() == 0){
            return null;
        }else if(collection.size() > 1){
            throw new NonUniqueResultException("Query: " + query.toString() + " returns non unique results");
        }
        Object singleResult = collection.iterator().next();
        return (T)singleResult;
    }
}
