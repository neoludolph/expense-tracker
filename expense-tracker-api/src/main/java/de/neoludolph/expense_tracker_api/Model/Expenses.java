package de.neoludolph.expense_tracker_api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Expenses {

    @Id
    private long amount;
    private category category;
    private String description;
    private LocalDateTime date;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}