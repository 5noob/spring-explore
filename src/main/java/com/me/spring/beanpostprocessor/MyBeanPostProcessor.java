package com.me.spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author OuyangJie
 * @Date 2018/12/19 22:17
 * @Description:
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("helloController".equals(beanName)){
            System.out.println("===调用MyBeanPostProcessor的前置方法=====");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("helloController".equals(beanName)){
            System.out.println("===调用MyBeanPostProcessor的后置方法=====");
        }
        return bean;
    }
}
