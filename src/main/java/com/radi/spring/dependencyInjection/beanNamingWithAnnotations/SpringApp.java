package com.radi.spring.dependencyInjection.beanNamingWithAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.radi.spring.dependencyInjection.beanNamingWithAnnotations")
public class SpringApp {
    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(SpringApp.class);
        Map<String, Simple> beans = context.getBeansOfType(Simple.class);
        beans.entrySet().stream().forEach(b ->
                System.out.println("id: " + b.getKey()
                        + "\n aliases: "
                        + Arrays.toString(context.getAliases(b.getKey())) + "\n")
        );
    }

    @Bean(name = {"ac",
            "def",
            "simple1",
            "simple2",
            "simple4"})
    Simple simpleBean() {
        return new Simple();
    }
}
