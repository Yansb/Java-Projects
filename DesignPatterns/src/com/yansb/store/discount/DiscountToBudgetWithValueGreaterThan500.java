package com.yansb.store.discount;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountToBudgetWithValueGreaterThan500 extends Discount {

  protected DiscountToBudgetWithValueGreaterThan500(Discount next) {
    super(next);
  }

  public BigDecimal makeCalculation(Budget budget) {
      return budget.getValue().multiply(new BigDecimal("0.05"));
  }

  @Override
  public boolean shouldApply(Budget budget) {
    return budget.getValue().compareTo(new BigDecimal("500")) > 0;
  }
}
