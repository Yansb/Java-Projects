package com.yansb.store.order.action;

import com.yansb.store.order.Order;

public class SendOrderEmail implements ActionAfterGenerateOrder {

  public void execute(Order order){
    System.out.println("Sending email with order details");
  }
}
