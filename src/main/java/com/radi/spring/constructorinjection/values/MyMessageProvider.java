package com.radi.spring.constructorinjection.values;

import org.springframework.stereotype.Service;

@Service("providerr")
public class MyMessageProvider implements MessageProvider {
    public String getMessage() {
        return "ravindra message";
    }
}
