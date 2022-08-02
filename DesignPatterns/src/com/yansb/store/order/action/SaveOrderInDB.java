package com.yansb.store.order.action;

import com.yansb.store.order.Order;

public class SaveOrderInDB implements ActionAfterGenerateOrder{

  public void execute(Order order){
    System.out.println("Saving order details in database");
  }
}
