package com.springboot.webApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository){

        return args -> {
            log.info("Preloading " + repository.save(new User("Matias", "Kobold", "mk", "matiaskobold@gmail.com" )));
            log.info("Preloading " + repository.save(new User("Florencia", "Kobold", "fk", "florenciakobold@gmail.com" )));
        };

    }


}