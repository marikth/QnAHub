package com.qnahub.common.session;

import com.qnahub.common.entity.SuperEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by markth on 5/2/2016.
 */
@Component
public class EntityManagerDAO {

    @PersistenceContext
    private EntityManager em;

    public void persist(SuperEntity entity) {
        em.persist(entity);
    }
}
