package com.me.spring.config;

import com.me.spring.beanpostprocessor.MyBeanPostProcessor;
import com.me.spring.condition.MyCondition;
import com.me.spring.domain.Person;
import com.me.spring.factorybean.MyFactoryBean;
import com.me.spring.importregister.MyImportBeanDefinitionRegistrar;
import com.me.spring.importselector.MyImportSelector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author OuyangJie
 * @Date 2018/12/6 21:05
 * @Description:
 */
@Import({MyFactoryBean.class, MyBeanPostProcessor.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@Configuration
@ComponentScan("com.me.spring")
@PropertySource("classpath:application.properties")
public class HelloConfig {
    @Value("${say}")
    private String say;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "zhangSan")
    public Person zhangsan(){
        Person person = new Person();
        person.setName("张三");
        return person;
    }

    @Conditional(MyCondition.class)
    @Bean(name = "lisi")
    public Person lisi(){
        Person person = new Person();
        person.setName("李四");
        return person;
    }

    public void say() {
        System.out.println(this.say);
    }
}
