package com.radi.spring.fieldInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class MessageProviderImpl implements MessageProvider {

    @Value("#{messageConfig.message}")
    private String message;

    @Value("#{messageConfig.address}")
    private String address;

    public String getMessage() {
        return this.message+"-\n"+this.address;
    }
}
