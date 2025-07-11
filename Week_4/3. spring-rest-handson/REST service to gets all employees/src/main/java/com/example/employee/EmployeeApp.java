package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class EmployeeApp {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApp.class, args);
    }
}