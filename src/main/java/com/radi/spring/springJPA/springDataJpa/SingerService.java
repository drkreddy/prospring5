package com.radi.spring.springJPA.springDataJpa;

import java.util.List;

public interface SingerService {
    List<Singer> findAll();
    Singer findByName(String name);
    List<Singer> customFind(String pattern);
}
