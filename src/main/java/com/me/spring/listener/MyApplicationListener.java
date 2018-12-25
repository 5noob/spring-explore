package com.me.spring.listener;

import com.me.spring.event.MyApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author OuyangJie
 * @Date 2018/12/19 22:07
 * @Description:
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("===监听到一个myApplicationEvent事件===");
    }
}
