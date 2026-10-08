package de.neoludolph.expense_tracker_api.Service;

import de.neoludolph.expense_tracker_api.Dto.ExpenseUpdateDto;
import de.neoludolph.expense_tracker_api.Model.Expense;
import de.neoludolph.expense_tracker_api.Repository.ExpenseRepository;
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
        Expense expense = expenseRepository.getReferenceById(id);
        if (expenseUpdateDto.amount() != null) {
            expense.setAmount(expenseUpdateDto.amount());
        }

        if (expenseUpdateDto.category() != null) {
            expense.setCategory(expenseUpdateDto.category());
        }

        if (expenseUpdateDto.description() != null) {
            expense.setDescription(expenseUpdateDto.description());
        }
    }

    @Override
    public List<Expense> listExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public List<Expense> filterExpenses(String period) {

    }
}
