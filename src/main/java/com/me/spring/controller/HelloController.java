package com.me.spring.controller;

import com.me.spring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author OuyangJie
 * @Date 2018/12/6 20:30
 * @Description:
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    public void hello(){
        helloService.say();
    }
}
