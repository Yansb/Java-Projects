package com.yansb.store.order;

import com.yansb.store.budget.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {
  public void execute(GenerateOrder data){
    Budget budget = new Budget(data.getBudgetValue(), data.getItemsQuantity());

    Order order = new Order(data.getCustomer(), LocalDateTime.now(), budget);

    System.out.println("Save on db");
    System.out.println("Send email");
  }
}
