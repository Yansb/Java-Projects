package com.yansb.store.budget;

import com.yansb.store.budget.status.BudgetStatus;
import com.yansb.store.budget.status.Finished;
import com.yansb.store.budget.status.InAnalysis;

import java.math.BigDecimal;

public class Budget {
  private BigDecimal value;
  final private int itemsQuantity;
  private BudgetStatus status;

  public Budget(BigDecimal value, int itemsQuantity) {
    this.value = value;
    this.itemsQuantity = itemsQuantity;
    this.status = new InAnalysis();
  }

  public void applyExtraDiscount(){
    BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);
    this.value = this.value.subtract(extraDiscountValue);
  }

  public BigDecimal getValue() {
    return value;
  }

  public int getItemsQuantity() {
    return itemsQuantity;
  }

  public void setStatus(BudgetStatus status) {
    this.status = status;
  }

  public void approve(){
    this.status.approve(this);
  }

  public void reprove(){
    this.status.reprove(this);
  }

  public boolean isFinished(){
    return status instanceof Finished;
  }

  public void finish() {
    this.status.finish(this);
  }
}