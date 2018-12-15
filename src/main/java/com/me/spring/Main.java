package com.me.spring;

import com.me.spring.config.HelloConfig;
import com.me.spring.controller.HelloController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author OuyangJie
 * @Date 2018/12/6 20:26
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(HelloConfig.class);
        HelloController helloController = (HelloController) annotationConfigApplicationContext.getBean("helloController");
        helloController.hello();
    }
}
