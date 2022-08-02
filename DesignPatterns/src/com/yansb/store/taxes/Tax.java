package com.yansb.store.taxes;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;

public interface Tax {

  BigDecimal calculate(Budget budget);
}

