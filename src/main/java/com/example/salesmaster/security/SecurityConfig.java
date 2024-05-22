package com.example.salesmaster.security;

import jdk.jfr.Enabled;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.formLogin();
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        return httpSecurity.build();
    }
    @Bean
    public InMemoryUserDetailsManagere inMemoryUserDetailsManagere(){
        return InMemoryUserDetailsManager(
                User.withUsername("admin").password("{noop}123".roles("ADMIN","USER").build(),
                User.withUsername("utilisateur").password("{noop}123".roles("UTILISATEUR").build(),
        );
    }
}

