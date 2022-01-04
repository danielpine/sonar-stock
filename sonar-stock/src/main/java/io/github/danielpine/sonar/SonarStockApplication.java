package io.github.danielpine.sonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SonarStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SonarStockApplication.class, args);
    }

}
