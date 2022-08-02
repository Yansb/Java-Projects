package com.yansb.store.budget;

import java.math.BigDecimal;

public class Budget {
  final private BigDecimal value;

  public Budget(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }
}