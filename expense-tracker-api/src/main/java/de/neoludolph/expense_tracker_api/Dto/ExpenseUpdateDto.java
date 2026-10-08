package de.neoludolph.expense_tracker_api.Dto;

import de.neoludolph.expense_tracker_api.Model.Expense;

public record ExpenseUpdateDto(
        Long amount,
        Expense.Category category,
        String description
) {}
