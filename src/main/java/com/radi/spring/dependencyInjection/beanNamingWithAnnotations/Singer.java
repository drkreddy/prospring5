package com.radi.spring.dependencyInjection.beanNamingWithAnnotations;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("johnMayer")
@Award(prize = "grammy")
@Lazy
public class Singer {
    private String lyric = "We found a message in a bottle we were drinking";
    public void sing() {
        System.out.println(lyric);
    }
}