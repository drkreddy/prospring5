package com.radi.spring.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("reader")
public class OracleMessageReader implements MessageReader {
    @Autowired
    private MessageProvider provider;

    public void displayMessage() {
        System.out.println("Message from provider: "+provider.getMessage());
    }
}
