package com.radi.spring.fieldInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class MessageProviderImpl implements MessageProvider {

    @Value("Value at field message")
    private String message;

    public String getMessage() {
        return this.message;
    }
}
