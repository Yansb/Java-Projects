package com.yansb.store;

import com.yansb.store.order.GenerateOrder;
import com.yansb.store.order.GenerateOrderHandler;
import com.yansb.store.order.OrderLog;
import com.yansb.store.order.action.SaveOrderInDB;
import com.yansb.store.order.action.SendOrderEmail;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestOrder {
  public static void main(String[] args) {
    String customer = "John Doe";
    BigDecimal budgetValue = new BigDecimal("500");
    int itemsQuantity = Integer.parseInt("2");

    GenerateOrder generateOrder = new GenerateOrder(customer, budgetValue, itemsQuantity);
    GenerateOrderHandler generateOrderHandler = new GenerateOrderHandler(
        Arrays.asList(
            new SaveOrderInDB(),
            new SendOrderEmail(),
            new OrderLog()
        )
    );

    generateOrderHandler.execute(generateOrder);
  }
}
