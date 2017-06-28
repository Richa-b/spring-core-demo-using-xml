package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringMainApplicationContextDemo {

    public static void main(String[] args) {

        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        Shape triangle = beanFactory.getBean(Triangle.class);
        System.out.println(triangle);
        triangle.drawShape();
    }
}
