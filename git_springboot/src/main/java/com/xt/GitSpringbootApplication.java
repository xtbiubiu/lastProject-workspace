package com.xt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(GitSpringbootApplication.class, args);
        System.out.println("修改一次");
        System.out.println("修改二次");
    }

}