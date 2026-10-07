package de.neoludolph.expense_tracker_api.Repository;

import de.neoludolph.expense_tracker_api.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
