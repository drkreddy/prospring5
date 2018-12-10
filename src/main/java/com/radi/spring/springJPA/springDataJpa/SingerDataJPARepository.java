package com.radi.spring.springJPA.springDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SingerDataJPARepository extends JpaRepository<Singer,Long> {
   Singer findByFirstName(String firstName);
}
