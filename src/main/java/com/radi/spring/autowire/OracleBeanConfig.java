package com.radi.spring.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OracleBeanConfig {
    @Bean
    public MessageProvider provider(){
       return new MessageProviderImpl();
    }

    @Bean
    public MessageReader reader(){
        OracleMessageReader reader = new OracleMessageReader();
        return reader;
    }
}
