package com.radi.spring.applicationcontext.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component("publisher")
public class Publisher implements ApplicationContextAware {
    ApplicationContext applicationContext;
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Publisher publisher = (Publisher) context.getBean("publisher");
        publisher.publish("Sending message");
        publisher.publish("in hope of ");
        publisher.publish("Someone receiving it other side");

    }

    public void publish(String msg){
        applicationContext.publishEvent(new MessageEvent(this,msg));
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

    @Configuration
    @ComponentScan(basePackages = "com.radi.spring.applicationcontext.events" )
    static class Config{
    }
}
