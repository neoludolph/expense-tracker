package de.neoludolph.expense_tracker_api.Service;

import de.neoludolph.expense_tracker_api.Dto.ExpenseUpdateDto;
import de.neoludolph.expense_tracker_api.Model.Expense;
import de.neoludolph.expense_tracker_api.Repository.ExpenseRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("standardExpenseService")
@Primary
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Transactional
    @Override
    public void createExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Transactional
    @Override
    public void deleteExpense(Long id) {
        Expense expense = expenseRepository.getReferenceById(id);
        expenseRepository.delete(expense);
    }

    @Transactional
    @Override
    public void updateExpense(ExpenseUpdateDto expenseUpdateDto, Long id) {
        Expense expense = expenseRepository.getReferenceById(expenseUpdateDto)
    }

    @Override
    public List<Expense> listExpenses() {
        expenseRepository.
    }

    @Override
    public List<Expense> filterExpenses(String period) {

    }
}
