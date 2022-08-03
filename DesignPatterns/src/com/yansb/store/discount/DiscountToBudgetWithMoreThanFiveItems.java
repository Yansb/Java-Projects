package com.yansb.store.discount;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountToBudgetWithMoreThanFiveItems extends Discount{
  protected DiscountToBudgetWithMoreThanFiveItems(Discount next) {
    super(next);
  }

  @Override
  protected BigDecimal makeCalculation(Budget budget) {
    return budget.value().multiply(new BigDecimal("0.1"));
  }

  @Override
  public boolean shouldApply(Budget budget) {
    return budget.getItemsQuantity() >= 5;
  }
}
