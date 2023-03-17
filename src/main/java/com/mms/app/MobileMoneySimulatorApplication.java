package com.mms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.mms.domain"})
@EnableScheduling
@EnableJpaAuditing
@ComponentScan(basePackages = {"com.mms"})
@EnableJpaRepositories(basePackages = {"com.mms.persistence"})
public class MobileMoneySimulatorApplication{
    public static void main(String[] args) {
        SpringApplication.run(MobileMoneySimulatorApplication.class, args);
    }

}
