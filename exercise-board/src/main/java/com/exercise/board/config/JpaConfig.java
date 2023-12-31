package com.exercise.board.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {


    @Bean
    public AuditorAware<String> auditorAware(){
        return () -> Optional.of("bw"); // TODO: 스프링 시큐리티로 인증 기능을 붙이게 될 때, 수정
    }
}
