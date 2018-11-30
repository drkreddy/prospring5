package com.radi.spring.dependencyInjection.methodLookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("standardLookupBean")
public class StandardLookupDemoBean implements DemoBean {

   private Singer singer;
    @Override
    public Singer getMySinger() {
        return this.singer;
    }

    @Override
    public void doSomething() {

    }
    @Autowired
    @Qualifier("singer")
    public void setSinger(Singer singer) {
        this.singer = singer;
    }
}
