package com.qnahub.common.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;

/**
 * Created by markth on 10/23/2016.
 */
public class Environment {
    private AutowireCapableBeanFactory beanFactory;

    public Environment(String authToken, AutowireCapableBeanFactory beanFactory){
        this.beanFactory = beanFactory;

        beanFactory.autowireBean(this);
    }

    private static final ThreadLocal<Environment> envThreadLocal = new InheritableThreadLocal<>();

    public static void setEnvironment(Environment env){
        envThreadLocal.set(env);
    }

    public static Environment getEnv(){
        return envThreadLocal.get();
    }

    public void doStuff() {
     //   MyBean obj = new MyBean();
     //   beanFactory.autowireBean(obj);
        // obj will now have its dependencies autowired.
    }
}
