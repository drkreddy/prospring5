package com.radi.spring.constructorinjection.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class MessageProviderImpl implements MessageProvider {

    private String message;

    public MessageProviderImpl(@Value("Configurable Message") String message) {
        this.message=message;
    }

    public String getMessage() {
        return this.message;
    }
}
