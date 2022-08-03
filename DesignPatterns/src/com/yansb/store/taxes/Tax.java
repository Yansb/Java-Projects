package com.yansb.store.taxes;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {

  private final Tax other;

  public Tax(Tax other) {
    this.other = other;
  }

  protected abstract BigDecimal makeCalculation(Budget budget);
  public BigDecimal calculate(Budget budget){
    BigDecimal value = makeCalculation(budget);
    BigDecimal otherTaxValue = BigDecimal.ZERO;

    if(other != null){
      otherTaxValue = other.makeCalculation(budget);
    }
    return value.add(otherTaxValue);
  }


}

