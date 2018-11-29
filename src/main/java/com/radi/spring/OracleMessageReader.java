package com.radi.spring;

public class OracleMessageReader implements MessageReader {
    private MessageProvider messageProvider;

    public OracleMessageReader(MessageProvider provider){
        this.messageProvider = provider;
    }
    public void displayMessage() {
        System.out.println(messageProvider.getMessage());
    }
}
