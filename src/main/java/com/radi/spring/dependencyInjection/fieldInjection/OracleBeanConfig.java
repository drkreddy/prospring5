package com.radi.spring.dependencyInjection.fieldInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
@ComponentScan("com.radi.spring.dependencyInjection.fieldInjection")
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
