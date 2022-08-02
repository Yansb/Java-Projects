package com.yansb.store.budget.status;

import com.yansb.store.DomainException;
import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetStatus {

  public BigDecimal calculateExtraDiscountValue(Budget budget) {
    return BigDecimal.ZERO;
  }

  public void approve(Budget budget) {
    throw new DomainException("Budget already approved");
  }

  public void reprove(Budget budget) {
    throw new DomainException("Budget already repproved");
  }

  public void finalize(Budget budget) {
    throw new DomainException("Budget already finalized");
  }
}
