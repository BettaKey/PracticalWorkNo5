package com.pw5.pw5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .anyRequest().permitAll() // Разрешить доступ ко всем страницам без аутентификации
                )
                .csrf(AbstractHttpConfigurer::disable) // Отключить CSRF
                .httpBasic(AbstractHttpConfigurer::disable) // Отключить базовую аутентификацию
                .formLogin(AbstractHttpConfigurer::disable) // Отключить форму логина
                .logout(AbstractHttpConfigurer::disable); // Отключить logout

        return http.build();
    }
}
