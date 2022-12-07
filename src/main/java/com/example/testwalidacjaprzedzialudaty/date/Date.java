package com.example.testwalidacjaprzedzialudaty.date;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

@DateRangeConstrain(message = "Nadpisany message adnotacji")
public class Date {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateFrom;
   @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTo;


    public Date(LocalDate dateFrom, LocalDate afterDate) {
        this.dateFrom = dateFrom;
        this.dateTo = afterDate;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public String toString() {
        return
                ", ealierDate=" + dateFrom +
                ", afterDate=" + dateTo +
                '}';
    }
}
