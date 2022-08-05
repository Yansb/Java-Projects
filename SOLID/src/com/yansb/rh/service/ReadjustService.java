package com.yansb.rh.service;

import com.yansb.rh.model.Employee;

import java.math.BigDecimal;

import java.util.List;

public class ReadjustService {

  private List<ValidateReadjust> validations;

  public ReadjustService(List<ValidateReadjust> validations) {
    this.validations = validations;
  }


  public void readjustEmployeeSalary(Employee employee, BigDecimal value) {

    this.validations.forEach(validation -> validation.validate(employee, value));

    BigDecimal readjustedSalary = employee.getSalary().add(value);

    employee.updateSalary(readjustedSalary);
  }
}
