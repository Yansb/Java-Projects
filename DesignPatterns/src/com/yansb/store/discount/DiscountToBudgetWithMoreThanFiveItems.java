package com.yansb.store.discount;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountToBudgetWithMoreThanFiveItems extends Discount{
  protected DiscountToBudgetWithMoreThanFiveItems(Discount next) {
    super(next);
  }

  public BigDecimal calculate(Budget budget) {
    if(budget.getItemsQuantity() >= 5){
      return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    return next.calculate(budget);
  }
}
