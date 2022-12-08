package com.example.testwalidacjaprzedzialudaty.date;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

@Service
public class DateService {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final Validator validator;

    public DateService(Validator validator) {
        this.validator = validator;
    }

    public void creatDateDto(String dateFrom, String dateTo) {
        LocalDate d1 = LocalDate.parse(dateFrom);
        LocalDate d2 = LocalDate.parse(dateTo);
        Date object = new Date(d1, d2);
        Set<ConstraintViolation<Date>> errors = validator.validate(object);
        if(!errors.isEmpty()) {
            System.out.println("Błąd przy tworzeniu obiektu Date");
            errors.forEach(err -> System.out.println(err.getMessage()));
        } else {
            System.out.println("Stworzono obiekt Date: " + object.toString());
        }
    }
}
