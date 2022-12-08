package com.example.testwalidacjaprzedzialudaty;

import com.example.testwalidacjaprzedzialudaty.date.DateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestWalidacjaPrzedzialuDatyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext contexApp = SpringApplication.run(TestWalidacjaPrzedzialuDatyApplication.class, args);
//
//        DateService dateService = contexApp.getBean(DateService.class);
//        System.out.println("Poprawny obiekt stworzony w main>>>>>>>>>>>>");
//        dateService.creatDateDto("2022-11-01", "2023-11-01");
//        System.out.println("Niepoprawny obiekt stworzony w main>>>>>>>>>>>>");
//        dateService.creatDateDto("2022-11-01", "2000-11-01");
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }

}
