package com.radi.spring.springDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("singerRepository")
public abstract class SingerRepository implements JpaRepository<Singer, Long> {

    public abstract List<Singer> findAll();
}
