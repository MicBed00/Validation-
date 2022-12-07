package com.example.testwalidacjaprzedzialudaty.controller;

import com.example.testwalidacjaprzedzialudaty.date.Date;
import com.example.testwalidacjaprzedzialudaty.date.DateService;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import org.springframework.cglib.core.Local;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Controller
public class DateController {

    private final DateService dateService;

    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping("/")
    public String mainView() {
        return "index";
    }

    @PostMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> approvedDate(@RequestBody @Valid Date date) {
        System.out.println("Obiekt date: " + date);
        dateService.validationDate(date);
        return ResponseEntity.ok("Date object is valid");
    }

}
