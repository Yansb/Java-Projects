package com.yansb.store;

import com.yansb.store.budget.Budget;
import com.yansb.store.budget.BudgetItem;
import com.yansb.store.taxes.ICMS;
import com.yansb.store.taxes.ISS;
import com.yansb.store.taxes.TaxesCalculator;

import java.math.BigDecimal;

public class TestTaxes {
  public static void main(String[] args) {
    Budget budget = new Budget();
    budget.addItem(new BudgetItem(new BigDecimal("1000")));
    TaxesCalculator taxesCalculator = new TaxesCalculator();
    System.out.println(taxesCalculator.calculate(budget, new ISS(new ICMS(null))));
  }
}
