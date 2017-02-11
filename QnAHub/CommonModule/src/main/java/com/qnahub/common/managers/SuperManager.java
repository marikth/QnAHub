package com.qnahub.common.managers;

import com.qnahub.common.session.EntityManagerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by markth on 10/23/2016.
 */
@Transactional
public class SuperManager {

    @Autowired
    private EntityManagerDAO entityDao;
}
