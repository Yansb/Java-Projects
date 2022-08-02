package com.yansb.store.budget;

import java.math.BigDecimal;

public class Budget {
  final private BigDecimal value;

  final private int itemsQuantity;

  public Budget(BigDecimal value, int itemsQuantity) {
    this.value = value;
    this.itemsQuantity = itemsQuantity;
  }

  public BigDecimal getValue() {
    return value;
  }

  public int getItemsQuantity() {
    return itemsQuantity;
  }
}