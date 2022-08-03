package com.yansb.store.budget.status;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public class Reproved extends BudgetStatus{


  @Override
  public void finish(Budget budget) {
    budget.setStatus(new Finished());
  }
}
