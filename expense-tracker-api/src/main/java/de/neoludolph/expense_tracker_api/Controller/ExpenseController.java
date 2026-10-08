package de.neoludolph.expense_tracker_api.Controller;

import de.neoludolph.expense_tracker_api.Dto.ExpenseUpdateDto;
import de.neoludolph.expense_tracker_api.Model.Expense;
import de.neoludolph.expense_tracker_api.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(@Qualifier("standardExpenseService") ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/addExpense")
    public void addExpense(@RequestBody Expense expense) {
        expenseService.createExpense(expense);
    }

    @DeleteMapping("/removeExpense/{id}")
    public void removeExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }

    @PutMapping("/updateExpense/{id}")
    public void updateExpense(@RequestBody ExpenseUpdateDto expenseUpdateDto, @PathVariable Long id) {
        expenseService.updateExpense(expenseUpdateDto, id);
    }

    @GetMapping("/listExpenses")
    public List<Expense> listExpense() {
        return expenseService.listExpenses();
    }

    @GetMapping("/filterExpenses/{period}")
    public List<Expense> filterExpense(@PathVariable String period) {
        return expenseService.filterExpenses(period);
    }
}
