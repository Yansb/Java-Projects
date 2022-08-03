package com.yansb.store.budget;

import com.yansb.store.budget.status.BudgetStatus;
import com.yansb.store.budget.status.Finished;
import com.yansb.store.budget.status.InAnalysis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable{
  private BigDecimal value;

  private final List<Budgetable> items;

  private BudgetStatus status;

  public Budget() {
    this.value = BigDecimal.ZERO;
    this.items = new ArrayList<>();
    this.status = new InAnalysis();
  }

  public void applyExtraDiscount(){
    BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);
    this.value = this.value.subtract(extraDiscountValue);
  }

  public BigDecimal getValue() {
    try {
      Thread.sleep(2000);
    }catch (Exception e){
      throw new RuntimeException(e);
    }
    return value;
  }

  public int getItemsQuantity() {
    return items.size();
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

  public void addItem(Budgetable item) {
    this.value = this.value.add(item.getValue());
    this.items.add(item);
  }
}