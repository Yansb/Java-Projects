package com.yansb.store.budget;

import java.math.BigDecimal;

public class BudgetProxy extends Budget{
  private final Budget budget;

  private BigDecimal value;
  public BudgetProxy( Budget budget) {
    this.budget = budget;
  }

  @Override
  public BigDecimal getValue() {
    if(value == null){
      this.value = budget.getValue();
    }

    return this.value;
  }
}
