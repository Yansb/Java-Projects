package com.yansb.rh.service;

import com.yansb.rh.ValidationException;
import com.yansb.rh.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidateReadjustPercent implements ValidateReadjust{

  public void validate(Employee employee, BigDecimal value) {
    LocalDate lastReadjustDate = employee.getLastSalaryIncrease();
    LocalDate currentDate = LocalDate.now();

    long monthsLastReadjust = ChronoUnit.MONTHS.between(lastReadjustDate, currentDate);

    if(monthsLastReadjust < 6){
      throw new ValidationException("Salary increase must be at least 6 months");
    }
  }
}
