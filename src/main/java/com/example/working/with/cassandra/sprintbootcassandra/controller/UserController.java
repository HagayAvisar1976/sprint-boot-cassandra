package com.example.working.with.cassandra.sprintbootcassandra.controller;

import com.example.working.with.cassandra.sprintbootcassandra.model.User;
import com.example.working.with.cassandra.sprintbootcassandra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void saveUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User(UUID.randomUUID(),"hagay1","address1",44));
        users.add(new User(UUID.randomUUID(),"hagay2","address2",44));
        users.add(new User(UUID.randomUUID(),"hagay3","address3",44));
        users.add(new User(UUID.randomUUID(),"hagay4","address4",44));

        userRepository.saveAll(users);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/getUserByAge/{age}")
    public List<User> getUserByAge(@PathVariable int age){
        return userRepository.findByAge(age);
    }
}
