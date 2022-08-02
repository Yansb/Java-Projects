package com.yansb.store;

import com.yansb.store.budget.Budget;
import com.yansb.store.taxes.ICMS;
import com.yansb.store.taxes.TaxesCalculator;

import java.math.BigDecimal;

public class TestTaxes {
  public static void main(String[] args) {
    Budget budget = new Budget(new BigDecimal("100"), 1);
    TaxesCalculator taxesCalculator = new TaxesCalculator();
    System.out.println(taxesCalculator.calculate(budget, new ICMS()));
  }
}
