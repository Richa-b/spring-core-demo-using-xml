package com.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by richa on 29/6/17.
 */
public class SpringMainLifeCycleWithoutInterfaceDemo {

    public static void main(String[] args) {
        AbstractApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config-lifeCycleWithoutInterface.xml");
        beanFactory.getBean(LifeCycleObjectWithoutInterface.class);
        beanFactory.registerShutdownHook();
    }
}
