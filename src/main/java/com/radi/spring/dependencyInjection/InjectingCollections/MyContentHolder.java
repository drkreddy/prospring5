package com.radi.spring.dependencyInjection.InjectingCollections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.function.Consumer;

@Service("holder")
public class MyContentHolder implements ContentHolder {

    @Autowired
    private List<String> namess;

    @Resource(name = "names")
    private List<String> correctNames;

    @Autowired
    @Qualifier("namess")
    private List<String> names;


    private Consumer<String> printer = x-> System.out.println(x);
    public void displayContent() {
        System.out.println("printing namess");
        namess.stream().forEach(printer);
        System.out.println("Printing correctNames");
        correctNames.stream().forEach(printer);

        System.out.println("Printing AutowiredNames with qualifier overried");
        names.stream().forEach(printer);

    }
}
