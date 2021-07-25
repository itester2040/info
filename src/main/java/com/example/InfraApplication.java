package com.example;

import lombok.extern.log4j.Log4j2;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@EnableBatchProcessing
@SpringBootApplication
public class InfraApplication {

    public static void main(String[] args) {

        log.info("AAAAAAAAAAAAAAAAAA");
        SpringApplication.run(InfraApplication.class, args);
    }

}
