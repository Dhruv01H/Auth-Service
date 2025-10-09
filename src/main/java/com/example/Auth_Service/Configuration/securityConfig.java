package com.example.Auth_Service.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityConfig {
  @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        System.out.println("✅ Custom SecurityConfig loaded!");
        http
            .csrf(csrf -> csrf.disable()) // disable CSRF for Postman testing
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // allow all endpoints
            )
            .httpBasic(httpBasic -> httpBasic.disable()) // disable basic auth
            .formLogin(form -> form.disable()); // disable login form

        return http.build();
    }
    
}
