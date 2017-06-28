package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by richa on 29/6/17.
 */
public class SpringMainCollectionDemo {


    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-config-collection.xml");
        Triangle triangle = beanFactory.getBean(Triangle.class);
        System.out.println(triangle);
        for (Point point : triangle.pointList) {
            System.out.println(point);
        }

       /* for (Map.Entry<String, Point> entry : triangle.pointMap.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }*/
    }
}
