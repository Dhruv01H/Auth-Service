package com.example.Auth_Service.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Auth_Service.bean.User;

@Repository
public interface JPARepository extends JpaRepository<User,Integer>{
    
}
