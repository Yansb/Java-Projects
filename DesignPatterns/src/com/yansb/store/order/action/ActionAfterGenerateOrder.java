package com.yansb.store.order.action;

import com.yansb.store.order.Order;

public interface ActionAfterGenerateOrder {
  void execute(Order order);
}
