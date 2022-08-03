package com.yansb.store.taxes;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class ISS extends Tax {
  public ISS(Tax other) {
    super(other);
  }

  @Override
  public BigDecimal makeCalculation(Budget  budget){
    return budget.getValue().multiply(new BigDecimal("0.06"));
  }


}
