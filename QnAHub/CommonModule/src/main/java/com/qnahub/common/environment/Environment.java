package com.qnahub.common.environment;

/**
 * Created by markth on 10/23/2016.
 */
public class Environment {

    private static final ThreadLocal<Environment> envThreadLocal = new InheritableThreadLocal<>();

    public static void setEnvironment(Environment env){
        envThreadLocal.set(env);
    }

    public static Environment getEnv(){
        return envThreadLocal.get();
    }
}
