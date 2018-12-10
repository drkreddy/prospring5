package com.radi.spring.springJPA.springDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SingerDataJPARepository extends JpaRepository<Singer,Long> {
   Singer findByFirstName(String firstName);

   @Query("select s from Singer s where s.firstName like %:title%")
   List<Singer> customFind(@Param("title")String name);
}
