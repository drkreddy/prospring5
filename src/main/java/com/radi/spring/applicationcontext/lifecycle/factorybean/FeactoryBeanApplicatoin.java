package com.radi.spring.applicationcontext.lifecycle.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeactoryBeanApplicatoin {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FeactoryBeanApplicatoin.class);
        MessageDigester digester = (MessageDigester)context.getBean("digester");
        System.out.println(digester.getDefaultDigest());
        System.out.println(digester.getShaDigest());
        digester.digest("Hi hello");
        System.out.println("=================");
        MessageDigestFactoryBean shaDi= (MessageDigestFactoryBean) context.getBean("myshaDigest");
        System.out.println(shaDi);
    }

    @Bean
    public MessageDigestFactoryBean myshaDigest(){
        MessageDigestFactoryBean bean = new MessageDigestFactoryBean();
        bean.setAlgorithmName("SHA1");
        return bean;
    }

    @Bean
    public MessageDigestFactoryBean defaultDigest(){
        return new MessageDigestFactoryBean();
    }
@Bean
    public MessageDigester digester() throws Exception {
        MessageDigester messageDigester = new MessageDigester();
        messageDigester.setDefaultDigest(defaultDigest().getObject());
        messageDigester.setShaDigest(myshaDigest().getObject());
        return messageDigester;
    }
}
