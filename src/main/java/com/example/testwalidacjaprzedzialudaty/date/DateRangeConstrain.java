package com.example.testwalidacjaprzedzialudaty.date;

import jakarta.validation.Constraint;

import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Documented
@Constraint(validatedBy = DateValidator.class)
@Target({TYPE})
@Retention(RUNTIME)
public @interface DateRangeConstrain {

    String message() default "dateTo must be after dateFrom";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
