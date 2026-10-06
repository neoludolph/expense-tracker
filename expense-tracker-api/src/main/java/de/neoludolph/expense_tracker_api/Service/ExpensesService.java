package de.neoludolph.expense_tracker_api.Service;

import de.neoludolph.expense_tracker_api.Model.Expenses;

import java.util.List;

public interface ExpensesService {
    void createExpense(Expenses expense);
    void deleteExpense(String id);
    void updateExpense(Expenses expense, String id);
    List<Expenses> listExpenses();
    List<Expenses> filterExpenses(String period);
}
