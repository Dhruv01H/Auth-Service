package com.example.Auth_Service.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Auth_Service.Service.JPARepository;
import com.example.Auth_Service.bean.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/login")
public class UserController {
    @Autowired 
    private JPARepository repoObj;
    
    @PostMapping("/addUser")
    public String createUser(@RequestBody List<User> users) {
        
        repoObj.saveAll(users);
        return new String();
    }
    
}
