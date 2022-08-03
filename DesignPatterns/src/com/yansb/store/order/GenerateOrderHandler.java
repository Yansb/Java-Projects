package com.yansb.store.order;

import com.yansb.store.budget.Budget;
import com.yansb.store.budget.BudgetItem;
import com.yansb.store.order.action.ActionAfterGenerateOrder;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

  private final List<ActionAfterGenerateOrder> actions;

  public GenerateOrderHandler(List<ActionAfterGenerateOrder> actions) {
    this.actions = actions;
  }

  public void execute(GenerateOrder data){
    Budget budget = new Budget();
    budget.addItem(new BudgetItem(data.getBudgetValue()));

    Order order = new Order(data.getCustomer(), LocalDateTime.now(), budget);

    actions.forEach(a -> a.execute(order));
  }
}
