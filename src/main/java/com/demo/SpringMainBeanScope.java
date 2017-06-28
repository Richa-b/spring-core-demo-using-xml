package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by richa on 29/6/17.
 */
public class SpringMainBeanScope {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config-beanScope.xml");
        System.out.println(beanFactory.getBean(Triangle.class));
        System.out.println(beanFactory.getBean(Triangle.class));
        System.out.println(beanFactory.isSingleton("triangle"));
    }
}
