package com.yansb.store.taxes;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class ISS implements Tax{

  public BigDecimal calculate(Budget  budget){
    return budget.getValue().multiply(new BigDecimal("0.06"));
  }
}
