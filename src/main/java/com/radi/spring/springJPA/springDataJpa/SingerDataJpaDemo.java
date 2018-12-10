package com.radi.spring.springJPA.springDataJpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SingerDataJpaDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingerDemoConfig.class);
        SingerService singerService = (SingerService) context.getBean("dataJpaSingerService");
        List<Singer> all1 = singerService.findAll();
        all1.forEach(x-> System.out.println(x));
        Singer suni = singerService.findByName("sunitha");
        System.out.println(suni);
        System.out.println("Demo custom query");

        singerService.customFind("an").forEach(x-> System.out.println(x));
        singerService.customFind("su").forEach(x-> System.out.println(x));


    }

}
