package com.radi.spring.dependencyInjection.InjectingCollections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration()
@ComponentScan("com.radi.spring.dependencyInjection.InjectingCollections")
public class BeanConfig {
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
    @Bean
    public List<String> names(){
        List<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("Raj");
        return list;
    }
    @Bean
    public List<String> namess(){
        List<String> list=new ArrayList<>();
        list.add("Ravia");
        list.add("Raaj");
        return list;
    }
}
