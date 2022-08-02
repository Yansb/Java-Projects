package com.yansb.store;

import com.yansb.store.budget.Budget;
import com.yansb.store.discount.DiscountCalculator;
import com.yansb.store.taxes.ICMS;
import com.yansb.store.taxes.TaxesCalculator;

import java.math.BigDecimal;

public class TestDiscounts {
  public static void main(String[] args) {
    Budget firstBudget = new Budget(new BigDecimal("501"), 3);
    Budget secondBudget = new Budget(new BigDecimal("200"), 5);
    Budget thirdBudget = new Budget(new BigDecimal("200"), 2);

    DiscountCalculator discountCalculator = new DiscountCalculator();

    System.out.println(discountCalculator.calculate(firstBudget));
    System.out.println(discountCalculator.calculate(secondBudget));
    System.out.println(discountCalculator.calculate(thirdBudget));
  }
}
