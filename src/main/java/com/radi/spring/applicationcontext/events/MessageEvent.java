package com.radi.spring.applicationcontext.events;

import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent {
    public MessageEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }
}
