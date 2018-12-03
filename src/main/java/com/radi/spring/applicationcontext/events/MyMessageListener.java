package com.radi.spring.applicationcontext.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("listener")
public class MyMessageListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        MessageEvent event = (MessageEvent) applicationEvent;
        System.out.println("Received :: "+event.getMessage());

    }
}
