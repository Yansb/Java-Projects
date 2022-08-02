package com.yansb.store.discount;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator{

  public BigDecimal calculate(Budget budget) {

    return new DiscountToBudgetWithMoreThanFiveItems(
        new DiscountToBudgetWithValueGreaterThan500(new NoDiscount())
    ).calculate(budget);
  }
}
