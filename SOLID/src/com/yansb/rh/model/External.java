package com.yansb.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class External extends Employee {

  private String company;

  public External(String name, String cpf, Role role, BigDecimal salary, LocalDate lastSalaryIncrease) {
    super(name, cpf, role, salary, lastSalaryIncrease);
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
}
