package com.me.spring.publisher;

import com.me.spring.event.MyApplicationEvent;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author OuyangJie
 * @Date 2018/12/20 19:47
 * @Description:
 */
public class MyApplicationEventPublisher implements ApplicationEventPublisherAware {
    @Override
    public void setApplicationEventPublisher(org.springframework.context.ApplicationEventPublisher applicationEventPublisher) {
        MyApplicationEvent myApplicationEvent = new MyApplicationEvent("xx");
        applicationEventPublisher.publishEvent(myApplicationEvent);
    }
}
