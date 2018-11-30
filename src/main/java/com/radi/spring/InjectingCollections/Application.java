package com.radi.spring.InjectingCollections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ContentHolder holder = (ContentHolder) context.getBean("holder");
        holder.displayContent();
    }
}
