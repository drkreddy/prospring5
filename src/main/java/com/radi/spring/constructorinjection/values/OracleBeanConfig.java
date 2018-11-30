package com.radi.spring.constructorinjection.values;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
@ComponentScan("com.radi.spring.constructorinjection.values")
public class OracleBeanConfig {
//    @Bean
//    public MessageProvider provider(){
//       return new MessageProviderImpl();
//    }
//
//    @Bean
//    public MessageReader reader(){
//        OracleMessageReader reader = new OracleMessageReader(provider());
//        return reader;
//    }
}
