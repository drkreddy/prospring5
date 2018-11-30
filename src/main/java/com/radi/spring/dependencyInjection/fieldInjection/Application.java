package com.radi.spring.dependencyInjection.fieldInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OracleBeanConfig.class);
        MessageReader messageReader = (OracleMessageReader) context.getBean("reader");
        messageReader.displayMessage();
    }
}
