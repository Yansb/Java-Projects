package com.yansb.store.discount;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
  protected Discount next;

  protected Discount(Discount next) {
    this.next = next;
  }

  public abstract BigDecimal calculate(Budget budget);
}
