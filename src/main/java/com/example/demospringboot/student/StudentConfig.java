package com.example.demospringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student erick = new Student(1L, "erick", "erick@mail.com", LocalDate.of(2000, 1, 1));
            Student nati = new Student("nati", "nati@mail.com", LocalDate.of(2001, 1, 1));
            repository.saveAll(Arrays.asList(erick, nati));
        };
    }
}
