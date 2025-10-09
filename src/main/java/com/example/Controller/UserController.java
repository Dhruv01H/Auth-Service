package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.JPARepository;
import com.example.bean.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class UserController {
    @Autowired 
    private JPARepository repoObj;
    
    @PostMapping
    public String createUser(@RequestParam List<User> users) {
        
        repoObj.saveAll(users);
        return new String();
    }
    
}
