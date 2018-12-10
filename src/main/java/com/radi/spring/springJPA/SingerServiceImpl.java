package com.radi.spring.springJPA;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Service("jpaSingerService")
@Repository
@Transactional
public class SingerServiceImpl implements SingerService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<Singer> findAll() {
        return em.createNamedQuery(Singer.FIND_ALL,Singer.class).getResultList();
    }

    @Override
    public Singer findByName(String name) {
        TypedQuery<Singer> namedQuery = em.createNamedQuery(Singer.FIND_BY_NAME, Singer.class);
        namedQuery.setParameter("name",name);
        return namedQuery.getSingleResult();
    }
}
