package com.qnahub.data_module.auth.manager;

import com.qnahub.common.session.EntityManagerDAO;
import com.qnahub.data_module.auth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by markth on 5/2/2016.
 */
@Component
public class UserService {

    @Autowired
    private EntityManagerDAO entityManagerDAO = null;

    @Transactional
    public void addUser(User user){
        entityManagerDAO.persist(user);
    }
}
