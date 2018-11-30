package com.radi.spring.dependencyInjection.constructorinjection.basic;

public class MessageProviderImpl implements MessageProvider {

    public String getMessage() {
        return "Hello World!!";
    }
}
