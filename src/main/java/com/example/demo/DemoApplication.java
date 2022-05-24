package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        System.out.println("hello git");
        System.out.println("hello git01");
        System.out.println("hello git02");
        System.out.println("hello git03");
        System.out.println("hello git-04");
        System.out.println("hello git-05");
        System.out.println("master git-test");
        System.out.println("hello git-06");
        System.out.println("push test");
    }

}
