package com.example.springboot.DJ;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DJConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            DJRepository repository) {
        return args -> {
            DJ Deron = new DJ(
                    "Deron",
                    25,
                    "Electric"
            );

            DJ Sanjin = new DJ(
                    "Sanjin",
                    25,
                    "Rock"
            );

            repository.saveAll(
                    List.of(Deron, Sanjin)

            );

        };
    }
}
