package com.CESI.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    //private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner demo(ContactRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Contact(1,"Jack", "Bauer"));
            repository.save(new Contact(2,"Chloe", "O'Brian"));
            repository.save(new Contact(3,"Kim", "Bauer"));
            repository.save(new Contact(4,"David", "Palmer"));
            repository.save(new Contact(5, "Michelle", "Dessler"));

            // fetch all customers
            log.info("Contacts found with findAll():");
            log.info("-------------------------------");
            for (Contact contact : repository.findAll()) {
                log.info(contact.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Contact contact = repository.findById(1);
            log.info("Contact found with findById(1L):");
            log.info("--------------------------------");
            log.info(contact.toString());
            log.info("");

            // fetch customers by last name
            log.info("Contact found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Contact bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }*/
}