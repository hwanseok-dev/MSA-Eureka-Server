package me.hwanseok.simplemsaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SimpleMsaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleMsaEurekaApplication.class, args);
    }

}
