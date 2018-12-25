package com.me.spring.importregister;

import com.me.spring.publisher.MyApplicationEventPublisher;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author OuyangJie
 * @Date 2018/12/20 10:03
 * @Description:
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(MyApplicationEventPublisher.class);
        registry.registerBeanDefinition("myApplicationEventPublisher", rootBeanDefinition);
    }
}
