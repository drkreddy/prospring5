package com.radi.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class OracleMessageReader implements MessageReader {
    @Autowired
    private MessageProvider messageProvider;
    public void displayMessage() {
        System.out.println(messageProvider.getMessage());
    }

    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
