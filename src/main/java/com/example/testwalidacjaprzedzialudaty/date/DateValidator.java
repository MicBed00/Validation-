package com.example.testwalidacjaprzedzialudaty.date;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraintvalidation.SupportedValidationTarget;
import jakarta.validation.constraintvalidation.ValidationTarget;

//@SupportedValidationTarget(ValidationTarget.PARAMETERS)
public class DateValidator implements ConstraintValidator<DateRangeConstrain, Date> {

    @Override
    public boolean isValid(Date date, ConstraintValidatorContext constraintValidatorContext) {
        return date.getDateTo().isAfter(date.getDateFrom());
    }
}
