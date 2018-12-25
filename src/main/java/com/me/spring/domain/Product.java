package com.me.spring.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author OuyangJie
 * @Date 2018/12/24 22:38
 * @Description:
 */
@Component
public class Product implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===调用Product的afterPropertiesSet===");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("===调用Product的destroy===");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("===调用Product的postConstruct===");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("===调用Product的preDestroy===");
    }
}
