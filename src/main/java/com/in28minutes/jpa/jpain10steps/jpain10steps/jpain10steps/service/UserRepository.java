package com.in28minutes.jpa.jpain10steps.jpain10steps.jpain10steps.service;

import com.in28minutes.jpa.jpain10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
