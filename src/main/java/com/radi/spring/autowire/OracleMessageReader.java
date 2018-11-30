package com.radi.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

public class OracleMessageReader implements MessageReader {
    private MessageProvider messageProvider;
    public void displayMessage() {
        System.out.println(messageProvider.getMessage());
    }

    @Inject
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
