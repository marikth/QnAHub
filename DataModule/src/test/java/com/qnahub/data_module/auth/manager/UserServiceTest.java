package com.qnahub.data_module.auth.manager;

import com.qnahub.common.session.EntityManagerDAO;
import com.qnahub.data_module.auth.entity.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by markth on 5/2/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*=spring.xml"})
public class UserServiceTest {

    @Test
    public void testAddUser(){
        //Create Spring application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        //Get service from context. (service's dependency (ProductDAO) is autowired in ProductService)
        UserService userService = ctx.getBean(UserService.class);

        //Do some data operation

        userService.addUser(new User());

        userService.addUser(new User());

        ctx.close();
    }
}
