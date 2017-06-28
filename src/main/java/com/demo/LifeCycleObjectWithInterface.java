package com.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by richa on 29/6/17.
 */
public class LifeCycleObjectWithInterface implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Inside Destroy DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside After properties Set initializing Bean");
    }
}
