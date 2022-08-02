package com.yansb.store.discount;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount{
  protected NoDiscount() {
    super(null);
  }

  @Override
  protected BigDecimal makeCalculation(Budget budget) {
    return BigDecimal.ZERO;
  }

  @Override
  public boolean shouldApply(Budget budget) {
    return true;
  }
}
