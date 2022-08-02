package com.yansb.store.discount;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount{
  protected NoDiscount() {
    super(null);
  }

  public BigDecimal calculate(Budget budget) {
    return BigDecimal.ZERO;
  }
}
