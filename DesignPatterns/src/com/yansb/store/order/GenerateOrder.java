package com.yansb.store.order;

import com.yansb.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {

  private final String customer;
  private final BigDecimal budgetValue;
  private final int itemsQuantity;

  public GenerateOrder(String customer, BigDecimal budgetValue, int itemsQuantity) {
    this.customer = customer;
    this.budgetValue = budgetValue;
    this.itemsQuantity = itemsQuantity;
  }


  public String getCustomer() {
    return customer;
  }

  public BigDecimal getBudgetValue() {
    return budgetValue;
  }

  public int getItemsQuantity() {
    return itemsQuantity;
  }
}
