package com.in28minutes.jpa.jpain10steps.jpain10steps.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.in28minutes.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {


    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }

/*
public class SomeEntityDaoService{

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(SomeEntity entity){
        entityManager.persist(entity);
        return entity.getId();
    }
}
*/

}
