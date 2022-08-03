package com.yansb.store.budget;

import com.yansb.store.DomainException;
import com.yansb.store.http.HttpAdapter;

import java.util.Map;

public class RegisterBudget {
  final private HttpAdapter http;

  public RegisterBudget(HttpAdapter http) {
    this.http = http;
  }


  public void register(Budget budget) {
    if(!budget.isFinished()){
      throw new DomainException("Budget is not finished");
    }

    final var url = "http://api.com/budget";

    Map<String, Object> data = Map.of(
          "value", budget.getValue(),
          "itemsQuantity", budget.getItemsQuantity()
        );

    this.http.post(url, data);
  }
}
