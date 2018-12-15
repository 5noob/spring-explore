package com.me.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author OuyangJie
 * @Date 2018/12/6 20:39
 * @Description:
 */
@Service
public class HelloService {
    private String word = "hello";

    public void say(){
        System.out.println(word);
    }
}
