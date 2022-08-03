package com.yansb.store;

import com.yansb.store.budget.Budget;
import com.yansb.store.budget.BudgetItem;
import com.yansb.store.discount.DiscountCalculator;
import com.yansb.store.taxes.ICMS;
import com.yansb.store.taxes.TaxesCalculator;

import java.math.BigDecimal;

public class TestDiscounts {
  public static void main(String[] args) {
    Budget firstBudget = new Budget();
    Budget secondBudget = new Budget();
    Budget thirdBudget = new Budget();
    firstBudget.addItem(new BudgetItem(new BigDecimal("1000")));

    secondBudget.addItem(new BudgetItem(new BigDecimal("200")));
    secondBudget.addItem(new BudgetItem(new BigDecimal("200")));
    secondBudget.addItem(new BudgetItem(new BigDecimal("200")));
    secondBudget.addItem(new BudgetItem(new BigDecimal("200")));
    secondBudget.addItem(new BudgetItem(new BigDecimal("200")));

    thirdBudget.addItem(new BudgetItem(new BigDecimal("200")));

    DiscountCalculator discountCalculator = new DiscountCalculator();

    System.out.println(discountCalculator.calculate(firstBudget));
    System.out.println(discountCalculator.calculate(secondBudget));
    System.out.println(discountCalculator.calculate(thirdBudget));
  }
}
