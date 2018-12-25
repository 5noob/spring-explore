package com.me.spring.factorybean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OuyangJie
 * @Date 2018/12/19 21:45
 * @Description:
 */
public class MyFactoryBean implements FactoryBean, BeanFactoryPostProcessor {
    @Override
    public Object getObject() throws Exception {
        System.out.println("调用MyFactoryBean的getObject()方法");
        Map<String, String> map = new HashMap<>();
        map.put("test", "test");
        return map;
    }

    @Override
    public Class<?> getObjectType() {
        return HashMap.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用MyFactoryBean的postProcessBeanFactory()方法");
    }
}
