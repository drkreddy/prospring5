package com.radi.spring.dependencyInjection.methodLookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("singletonLookupBean")
public class SingletonLookupDemoBean implements DemoBean {
    @Autowired
    @Qualifier("singer")
    private Singer singer;

    @Override
    public Singer getMySinger() {
        return this.singer;
    }

    @Override
    public void doSomething() {
        singer.sing();
    }
}
