package com.example.testwalidacjaprzedzialudaty.controller;

import com.example.testwalidacjaprzedzialudaty.date.Date;
import com.example.testwalidacjaprzedzialudaty.date.DateService;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import org.springframework.cglib.core.Local;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
    public ResponseEntity<Date> approvedDate(@RequestBody @Valid Date date) {
//            dateService.validationDate(date);
            System.out.println("Obiekt date: " + date);
            return ResponseEntity.ok(date);


    }

}
