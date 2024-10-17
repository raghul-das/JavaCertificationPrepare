package com.library.model;

import java.time.LocalDate;

public class Loan {

    private Book book;
    private User user;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private boolean isReturned;

    public Loan(Book book, User user, LocalDate borrowDate, LocalDate dueDate) {
        this.book = book;
        this.user = user;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

  /*  @Override
    public String toString() {
        return "Loan{" +
                "book=" + book +
                ", user=" + user +
                ", borrowDate=" + borrowDate +
                ", dueDate=" + dueDate +
                ", isReturned=" + isReturned +
                '}';
    }*/

    @Override
    public String toString() {
        return "Loan{" +
                "book=" + book.getTitle() +
                ", user=" + user.getName() +
                ", dueDate=" + dueDate +
                ", dueDate=" + dueDate +
                ", isReturned=" + isReturned +
                '}';
    }
}
