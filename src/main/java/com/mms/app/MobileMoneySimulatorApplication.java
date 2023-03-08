package com.mms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.mms.domain"})  // scan JPA entities
//@EnableSwagger2
public class MobileMoneySimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileMoneySimulatorApplication.class, args);
    }

}
