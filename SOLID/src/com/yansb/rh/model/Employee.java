package com.yansb.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
  private final String name;
  private final String cpf;
  private Role role;
  private BigDecimal salary;

  private LocalDate lastSalaryIncrease;

  public Employee(String name, String cpf, Role role, BigDecimal salary, LocalDate lastSalaryIncrease) {
    this.name = name;
    this.cpf = cpf;
    this.role = role;
    this.salary = salary;
  }


  public void updateSalary(BigDecimal newSalary) {
    this.salary = newSalary;
    this.lastSalaryIncrease = LocalDate.now();
  }

  public String getName() {
    return name;
  }

  public String getCpf() {
    return cpf;
  }

  public Role getRole() {
    return role;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public LocalDate getLastSalaryIncrease() {
    return lastSalaryIncrease;
  }

  public void promote(Role newRole) {
    this.role = newRole;
  }
}
