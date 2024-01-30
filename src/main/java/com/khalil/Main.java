package com.khalil;

import com.khalil.customer.Customer;
import com.khalil.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository){
        return args -> {
            Customer khalil = new Customer("Khalil", "khalil@gmail.com", 25);
            Customer ayoub = new Customer("Ayoub", "Ayoub@gmail.com", 25);

            List<Customer> customers = List.of(khalil, ayoub);
            customerRepository.saveAll(customers);
        };
    }
}
