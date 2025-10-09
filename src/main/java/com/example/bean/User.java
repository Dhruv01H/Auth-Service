package com.example.bean;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "User")
public class User {
    @Id
  
    private int id;

    @Column(name="email")
    @Getter @Setter
    private String email;

    @Column(name="password")
    @Getter @Setter
    private String password;


}
