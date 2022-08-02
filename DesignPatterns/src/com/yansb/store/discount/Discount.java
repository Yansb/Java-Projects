package com.yansb.store.discount;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
  protected Discount next;

  protected Discount(Discount next) {
    this.next = next;
  }

  public BigDecimal calculate(Budget budget){
    if (shouldApply(budget)) {
      return makeCalculation(budget);
    }
    return next.calculate(budget);
  }
  protected abstract BigDecimal makeCalculation(Budget budget);

  public abstract boolean shouldApply(Budget budget);
}
