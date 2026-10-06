package de.neoludolph.expense_tracker_api.Service;

import de.neoludolph.expense_tracker_api.Model.Expenses;
import de.neoludolph.expense_tracker_api.Repository.ExpensesRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("standardExpenseService")
@Primary
public class ExpensesServiceImpl implements ExpensesService {

    private final ExpensesRepository expensesRepository;

    public ExpensesServiceImpl(ExpensesRepository expensesRepository) {
        this.expensesRepository = expensesRepository;
    }

    @Override
    public createExpense(Expenses expense) {

    }
}
