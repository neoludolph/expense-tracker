package de.neoludolph.expense_tracker_api.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "expenses")
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "amount", nullable = false)
    private long amount;

    @Column(name = "category", nullable = false)
    private category category;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "date", updatable = false)
    private LocalDateTime date;

    public Expenses() {
    }

    public enum category {
        GROCERIES,
        LEISURE,
        ELECTRONICS,
        UTILITIES,
        CLOTHING,
        HEALTH,
        OTHERS
    }

    public Expenses(long amount, category category, String description) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = LocalDateTime.now();
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public category getCategory() {
        return category;
    }

    public void setCategory(category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}