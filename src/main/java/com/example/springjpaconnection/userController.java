package com.example.springjpaconnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private userRepository userRepo;
    @GetMapping("/all")
    public List<userEntity> getAllUsers() {
        return userRepo.findAll();
    }



}
