package com.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainCodingToInterfacesDemo {

    public static void main(String[] args) {

        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config-codigToInterfaces.xml");
        Drawing drawing = beanFactory.getBean(Drawing.class);
        Shape shape = drawing.shape;
        System.out.println(drawing.shape);
        shape.drawShape();
    }
}
