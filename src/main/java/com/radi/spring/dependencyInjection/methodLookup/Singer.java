package com.radi.spring.dependencyInjection.methodLookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singer")
@Scope("prototype")
public class Singer {
    private String lyric = "I am sining song";

    public void sing(){
        System.out.println(lyric);
    }
}
