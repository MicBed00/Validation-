package com.example.testwalidacjaprzedzialudaty.date;

import jakarta.validation.ConstraintViolation;

import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Set;

@Service
public class DateService {
    private final Validator validator;

    @Autowired
    public DateService(Validator validator) {
        this.validator = validator;
    }

    public void validationDate(Date date) {
        Set<ConstraintViolation<Date>> violations = validator.validate(date);
        if(violations.isEmpty()) {
            System.out.println("Date object is valid");
        }else {
            for (ConstraintViolation<Date> violation : violations) {
                System.out.println(violation.getPropertyPath() + " " + violation.getMessage());
            }
        }
    }
}
