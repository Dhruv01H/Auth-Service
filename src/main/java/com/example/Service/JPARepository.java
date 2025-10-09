package com.example.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.User;

@Repository
public interface JPARepository extends JpaRepository<User,String>{
    
}
