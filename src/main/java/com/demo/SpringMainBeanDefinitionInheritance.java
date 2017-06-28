package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by richa on 29/6/17.
 */
public class SpringMainBeanDefinitionInheritance {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config-beanDefinitionInheritance.xml");
        Triangle triangle = (Triangle)beanFactory.getBean("triangle");
        System.out.println(triangle);
    }
}
