package com.yansb.store.taxes;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {

  public ICMS(Tax other) {
    super(other);
  }

  @Override
  public BigDecimal makeCalculation(Budget  budget){
    return budget.getValue().multiply(new BigDecimal("0.1"));
  }
}
