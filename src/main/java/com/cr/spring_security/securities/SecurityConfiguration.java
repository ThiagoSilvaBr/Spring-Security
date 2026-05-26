package com.cr.spring_security.securities;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller
@EnableWebSecurity
public class SecurityConfiguration {

    //Isso configura que qualquer usuário pode utilizar os modificadores sem estar verificado.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) {
        return httpSecurity.csrf(csrf -> csrf.disable())
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth ->
                        auth.requestMatchers(HttpMethod.GET, "/pessoas").permitAll()
                        .requestMatchers(HttpMethod.POST, "/pessoas").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/pessoas/**").permitAll()
                        .requestMatchers(HttpMethod.PUT, "/pessoas/**").permitAll())
                .build();
    }


}
