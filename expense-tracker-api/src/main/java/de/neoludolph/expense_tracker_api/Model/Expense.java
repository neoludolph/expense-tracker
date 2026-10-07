package de.neoludolph.expense_tracker_api.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount", nullable = false)
    private long amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private Category category;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "date", updatable = false)
    private LocalDateTime date;

    public Expense() {
    }

    public enum Category {
        GROCERIES,
        LEISURE,
        ELECTRONICS,
        UTILITIES,
        CLOTHING,
        HEALTH,
        OTHERS
    }

    public Expense(long amount, Category category, String description) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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