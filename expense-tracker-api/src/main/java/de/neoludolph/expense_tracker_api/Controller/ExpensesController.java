package de.neoludolph.expense_tracker_api.Controller;

import de.neoludolph.expense_tracker_api.Model.Expenses;
import de.neoludolph.expense_tracker_api.Service.ExpensesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    private final ExpensesService expensesService;

    public ExpensesController(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @PostMapping("/addExpense")
    public void addExpense(@RequestBody Expenses expense) {
        expensesService.createExpense(expense);
    }

    @DeleteMapping("/removeExpense/{id}")
    public void removeExpense(@PathVariable String id) {
        expensesService.deleteExpense(expense);
    }

    @PutMapping("/updateExpense/{id}")
    public void updateExpense(@RequestBody Expenses expense, @PathVariable String id) {
        expensesService.updateExpense(expense);
    }

    @GetMapping("/listExpenses")
    public void listExpenses() {
        expensesService.listExpenses();
    }

    @GetMapping("/filterExpenses")
    public void filterExpenses() {
        expensesService.filterExpenses();
    }
}
