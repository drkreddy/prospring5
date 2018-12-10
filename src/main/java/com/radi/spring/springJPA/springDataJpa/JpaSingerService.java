package com.radi.spring.springJPA.springDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dataJpaSingerService")
public class JpaSingerService implements SingerService {

    @Autowired
    SingerDataJPARepository singerRepo;


    @Override
    public List<Singer> findAll() {
        return singerRepo.findAll();
    }

    @Override
    public Singer findByName(String name) {
        return singerRepo.findByFirstName(name);
    }
}
