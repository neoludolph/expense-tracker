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
        expensesService.addExpense(expense);
    }

    @DeleteMapping("/removeExpense/{id}")
    public void addExpense(@PathVariable String id) {
        expensesService.removeExpense(expense);
    }

    @PutMapping("/updateExpense/{id}")
    public void addExpense(@RequestBody Expenses expense, @PathVariable String id) {
        expensesService.updateExpense(expense);
    }

    @GetMapping("/listExpenses")
    public void addExpense() {
        expensesService.listExpenses();
    }

    @GetMapping("/filterExpenses")
    public void addExpense() {
        expensesService.filterExpenses();
    }
}
