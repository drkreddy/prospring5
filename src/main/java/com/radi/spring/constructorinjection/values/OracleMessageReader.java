package com.radi.spring.constructorinjection.values;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("reader")
public class OracleMessageReader implements MessageReader {
    private List<MessageProvider> messageProvider;
    private MessageProvider provider;
    private MessageProvider providerr;

//    @Autowired
    public OracleMessageReader(List<MessageProvider> providers,MessageProvider provider, MessageProvider providerr){
        this.messageProvider = providers;
        this.provider = provider;
        this.providerr = providerr;
    }
    public void displayMessage() {
        System.out.println("Message from COllections: "+messageProvider.get(1).getMessage());
        System.out.println("Message from provider: "+provider.getMessage());
        System.out.println("Message from providerr: "+providerr.getMessage());
    }
}
