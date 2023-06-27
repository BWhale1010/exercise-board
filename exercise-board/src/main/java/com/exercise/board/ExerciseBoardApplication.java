package com.exercise.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ExerciseBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseBoardApplication.class, args);
    }

}
