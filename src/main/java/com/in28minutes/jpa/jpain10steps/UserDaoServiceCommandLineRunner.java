package com.in28minutes.jpa.jpain10steps;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.jpa.jpain10steps.entity.User;
import com.in28minutes.jpa.jpain10steps.jpain10steps.jpain10steps.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
           LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDaoService;

    @Override
    public void run(String... arg0) throws Exception{
        User user = new User("Jack", "Admin");
        long insert = userDaoService.insert(user);
        log.info("New User is created: " + user);
    }

}
