package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by richa on 29/6/17.
 */
public class SpringMainAnnotationConfigDemo {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config-annotation.xml");
        Shape triangle = (Triangle) beanFactory.getBean("triangle");
        System.out.println(triangle);
    }
}
