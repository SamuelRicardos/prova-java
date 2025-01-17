package com.example.demo.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/h2-console/**", "/cidadao/**")
                )
                .headers(headers -> headers
                        .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin
                        )
                )
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll()
                        .requestMatchers(HttpMethod.GET, "/cidadao/").permitAll()
                        .requestMatchers(HttpMethod.GET, "/cidadao/{id}").permitAll()
                        .requestMatchers(HttpMethod.POST, "/cidadao/").permitAll()
                        .requestMatchers(HttpMethod.PUT, "/cidadao/{id}").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/cidadao/{id}").permitAll()
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}