package de.neoludolph.expense_tracker_api.Controller;

import de.neoludolph.expense_tracker_api.Model.Expenses;
import de.neoludolph.expense_tracker_api.Service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/expenses")
public class ExpensesController {

    private final ExpensesService expensesService;

    public ExpensesController(@Qualifier("standardExpenseService") ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @PostMapping("/addExpense")
    public void addExpense(@RequestBody Expenses expense) {
        expensesService.createExpense(expense);
    }

    @DeleteMapping("/removeExpense/{id}")
    public void removeExpense(@PathVariable String id) {
        expensesService.deleteExpense(id);
    }

    @PutMapping("/updateExpense/{id}")
    public void updateExpense(@RequestBody Expenses expense, @PathVariable String id) {
        expensesService.updateExpense(expense, id);
    }

    @GetMapping("/listExpenses")
    public List<Expenses> listExpenses() {
        return expensesService.listExpenses();
    }

    @GetMapping("/filterExpenses/{period}")
    public List<Expenses> filterExpenses(@PathVariable String period) {
        return expensesService.filterExpenses(period);
    }
}
