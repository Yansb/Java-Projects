package com.yansb.store;

import com.yansb.store.budget.Budget;
import com.yansb.store.budget.RegisterBudget;
import com.yansb.store.http.JavaHttpClient;

import java.math.BigDecimal;

public class TestAdapter {
  public static void main(String[] args){
    Budget budget = new Budget(BigDecimal.valueOf(100), 10);
    budget.approve();
    budget.finish();

    RegisterBudget registerBudget = new RegisterBudget(new JavaHttpClient());

    registerBudget.register(budget);

  }
}
