package com.radi.spring.fieldInjection;

import org.springframework.stereotype.Component;

@Component("messageConfig")
public class MessageConfig {
    private String message = "Message from Configuration";
    private String  address = "Address from COnfiguration";


    public String getMessage() {
        return message;
    }

    public String getAddress() {
        return address;
    }
}
