package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.modulith.Modulith;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@Modulith // If you're using Spring Modulith, keep this annotation.
public class CicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);
        System.out.println("Hello World!");
    }

}
