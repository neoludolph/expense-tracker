package de.neoludolph.expense_tracker_api.Service;

import de.neoludolph.expense_tracker_api.Dto.ExpenseUpdateDto;
import de.neoludolph.expense_tracker_api.Model.Expense;

import java.util.List;

public interface ExpenseService {
    void createExpense(Expense expense);
    void deleteExpense(Long id);
    void updateExpense(ExpenseUpdateDto expenseUpdateDto, Long id);
    List<Expense> listExpenses();
    List<Expense> filterExpenses(String period);
}
