package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.NOVEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    21,
                    LocalDate.of(2000, NOVEMBER, 12),
                    "mariam@mariam.com"
            );

            Student alex = new Student(
                    "ALex",
                    20,
                    LocalDate.of(2001, NOVEMBER, 12),
                    "alex@alex.com"
            );
            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
