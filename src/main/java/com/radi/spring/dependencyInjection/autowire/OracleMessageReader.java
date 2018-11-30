package com.radi.spring.dependencyInjection.autowire;

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
