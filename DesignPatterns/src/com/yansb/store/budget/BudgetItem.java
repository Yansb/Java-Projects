package com.yansb.store.budget;

import java.math.BigDecimal;

public record BudgetItem(BigDecimal value) implements Budgetable {

}
