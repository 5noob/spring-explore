package com.me.spring.config;

import com.me.spring.condition.MyCondition;
import com.me.spring.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author OuyangJie
 * @Date 2018/12/6 21:05
 * @Description:
 */
@Configuration
@ComponentScan("com.me.spring")
public class HelloConfig {

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
}
