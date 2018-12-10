package com.radi.spring.springJPA;

import java.util.List;

public interface SingerService {
    List<Singer> findAll();
    Singer findByName(String name);
}
