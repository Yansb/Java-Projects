package com.yansb.store;

import com.yansb.store.budget.Budget;
import com.yansb.store.budget.BudgetItem;
import com.yansb.store.budget.BudgetProxy;

import java.math.BigDecimal;

public class TestComposition {
  public static void main(String[] args) {
    Budget old = new Budget();
    old.addItem(new BudgetItem(BigDecimal.valueOf(200)));
    old.reprove();

    Budget newBudget = new Budget();
    newBudget.addItem(new BudgetItem(BigDecimal.valueOf(150)));

    newBudget.addItem(old);

    BudgetProxy proxy = new BudgetProxy(newBudget);

    System.out.println(proxy.getValue());
    System.out.println(proxy.getValue());
  }
}
