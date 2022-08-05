package com.yansb.rh.service;

import com.yansb.rh.ValidationException;
import com.yansb.rh.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidateReadjustPeriod implements ValidateReadjust {

  public void validate(Employee employee, BigDecimal value) {
    BigDecimal currentSalary = employee.getSalary();
    BigDecimal percent = value.divide(currentSalary, RoundingMode.HALF_UP);

    if(percent.compareTo(new BigDecimal("0.4")) > 0) {
      throw new ValidationException("Salary increase must be less than 40%");
    }
  }
}
