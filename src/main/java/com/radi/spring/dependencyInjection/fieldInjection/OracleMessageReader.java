package com.radi.spring.dependencyInjection.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("reader")
public class OracleMessageReader implements MessageReader {
    @Autowired
    private MessageProvider provider;

    public void displayMessage() {
        System.out.println("Message from provider: "+provider.getMessage());
    }
}
