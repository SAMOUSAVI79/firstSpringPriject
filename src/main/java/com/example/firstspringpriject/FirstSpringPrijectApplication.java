package com.example.firstspringpriject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstSpringPrijectApplication {

    public static void main(String[] args) {
//        SpringApplication.run(FirstSpringPrijectApplication.class, args);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Member member = (Member) ctx.getBean("Member");

        member.setName("Ali");
        member.setFamily("Mosa");
        System.out.println(member.toString());

    }

}
