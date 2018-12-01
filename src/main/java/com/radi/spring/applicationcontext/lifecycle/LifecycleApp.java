package com.radi.spring.applicationcontext.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.radi.spring.applicationcontext.lifecycle" )
public class LifecycleApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifecycleApp.class);
        context.getBean("simpleBean");
        System.out.println("=======in main======");
        context.close();
    }

    @Bean(initMethod ="initMethod", destroyMethod = "destroyMethod")
    public SimpleBean simpleBean(){
        return new SimpleBean();
    }
}
