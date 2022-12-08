package com.example.testwalidacjaprzedzialudaty.controller;

import com.example.testwalidacjaprzedzialudaty.date.Date;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
public class DateController {

    @GetMapping("/")
    public String mainView() {
        return "index";
    }

    @PostMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Date> approvedDate(@RequestBody@Valid Date date) {
        return ResponseEntity.ok(date);
    }

//    @PostMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Date> approvedDate(@RequestBody@Valid Date date) {
//        if (bindingResult.hasErrors()) {
//            List<ObjectError> errors = bindingResult.getAllErrors();
//            errors.forEach(err -> System.out.println(err.getDefaultMessage()));
//        } else {
//            System.out.println("Obiekt date: " + date);
//        }
//
//        return ResponseEntity.ok(date);
//    }


}
