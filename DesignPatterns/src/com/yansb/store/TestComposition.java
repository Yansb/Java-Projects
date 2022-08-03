package com.yansb.store;

import com.yansb.store.budget.Budget;
import com.yansb.store.budget.BudgetItem;

import java.math.BigDecimal;

public class TestComposition {
  public static void main(String[] args) {
    Budget old = new Budget();
    old.addItem(new BudgetItem(BigDecimal.valueOf(200)));
    old.reprove();

    Budget newBudget = new Budget();
    newBudget.addItem(new BudgetItem(BigDecimal.valueOf(150)));

    newBudget.addItem(old);

    System.out.println(newBudget.value());
  }
}
