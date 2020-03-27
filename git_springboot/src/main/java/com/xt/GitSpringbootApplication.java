package com.xt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(GitSpringbootApplication.class, args);
        System.out.println("修改一次");
        System.out.println("修改二次");
        System.out.println("在dev里修改");


        System.out.println("123");

        System.out.println("在dev里第一次改  123");
        System.out.println("master 345");

        System.out.println("测试保存工作现场stash 1.0");

    }

}
