package com.yansb.store.budget.status;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetStatus {
  public BigDecimal calculateExtraDiscountValue(Budget budget){
    return budget.getValue().multiply(new BigDecimal("0.02"));
  }

  @Override
  public void finalize(Budget budget) {
    budget.setStatus(new Finished());
  }
}
