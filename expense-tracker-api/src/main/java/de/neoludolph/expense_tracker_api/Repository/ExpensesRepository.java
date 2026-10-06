package de.neoludolph.expense_tracker_api.Repository;

import de.neoludolph.expense_tracker_api.Model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses, Long> {
    
}
