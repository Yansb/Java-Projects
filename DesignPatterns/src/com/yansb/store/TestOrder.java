package com.yansb.store;

import com.yansb.store.order.GenerateOrder;
import com.yansb.store.order.GenerateOrderHandler;

import java.math.BigDecimal;

public class TestOrder {
  public static void main(String[] args) {
    String customer = args[0];
    BigDecimal budgetValue = new BigDecimal(args[1]);
    int itemsQuantity = Integer.parseInt(args[2]);

    GenerateOrder generateOrder = new GenerateOrder(customer, budgetValue, itemsQuantity);
    GenerateOrderHandler generateOrderHandler = new GenerateOrderHandler();

    generateOrderHandler.execute(generateOrder);
  }
}
