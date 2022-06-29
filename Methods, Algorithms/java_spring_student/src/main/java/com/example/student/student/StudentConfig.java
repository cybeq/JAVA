package com.example.student.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Maria =  new Student(
                    1L,
                    "Maria",
                    LocalDate.of(2021,11,23),
                    "maria@bulma.pl"
            );
            Student Grazyna = new Student(
                    2L,
                    "Grazyna",
                    LocalDate.of(2022,11,21),
                    "grazyan@a"
            );
            repository.saveAll(List.of(Maria, Grazyna));
        };
    }


}
