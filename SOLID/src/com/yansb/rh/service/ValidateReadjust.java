package com.yansb.rh.service;

import com.yansb.rh.model.Employee;

import java.math.BigDecimal;

public interface ValidateReadjust {
  void validate(Employee employee, BigDecimal value);
}
