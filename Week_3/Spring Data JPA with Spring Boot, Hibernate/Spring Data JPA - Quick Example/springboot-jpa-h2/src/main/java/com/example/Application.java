package com.example;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   @Bean
   public CommandLineRunner demo(CustomerRepository repository) {
      return (args) -> {
         repository.save(new Customer("Mayank"));
         repository.save(new Customer("Raj"));

         for (Customer customer : repository.findAll()) {
             System.out.println(customer.getName());
         }
      };
   }
}
