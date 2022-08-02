package com.yansb.store.order;

import com.yansb.store.budget.Budget;

import java.time.LocalDateTime;

public class Order {
  private String customer;
  private LocalDateTime orderDate;
  private Budget budget;

  public Order(String customer, LocalDateTime orderDate, Budget budget) {
    this.customer = customer;
    this.orderDate = orderDate;
    this.budget = budget;
  }

  public String getCustomer() {
    return customer;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public Budget getBudget() {
    return budget;
  }
}
