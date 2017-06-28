package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by richa on 29/6/17.
 */
public class SpringMainLifeCycleWithInterfaceDemo {

    public static void main(String[] args) {
        AbstractApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config-lifeCycleUsingInterface.xml");
        beanFactory.getBean(LifeCycleObjectWithInterface.class);
        beanFactory.registerShutdownHook();
    }
}
