package com.radi.spring.dependencyInjection.constructorinjection.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OracleBeanConfig.class);
        MessageReader reader = (MessageReader) context.getBean("reader");
        reader.displayMessage();
    }
}
