package com.yansb.store.order;

import com.yansb.store.order.action.ActionAfterGenerateOrder;

public class OrderLog implements ActionAfterGenerateOrder {
  @Override
  public void execute(Order order) {
    System.out.println("Order generated: " + order.getOrderDate());
  }
}
