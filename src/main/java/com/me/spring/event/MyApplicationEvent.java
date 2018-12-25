package com.me.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author OuyangJie
 * @Date 2018/12/19 22:08
 * @Description:
 */
public class MyApplicationEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
