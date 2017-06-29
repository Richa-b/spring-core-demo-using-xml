package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMainRequiredAnnotationDemo {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config-requiredAnnotation.xml");
        Shape triangle = (Triangle) beanFactory.getBean("triangle");
        System.out.println(triangle);
    }
}
