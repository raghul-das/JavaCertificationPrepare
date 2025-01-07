package com.library.service;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LoanService {
    private List<Loan> loans;
    private static final int LOAN_PERIOD_DAYS = 14; // 2 weeks loan period

    public LoanService() {
        this.loans = new ArrayList<>();
    }

    // Borrow a book (create a loan)
    public Loan borrowBook(Book book, User user) {
        LocalDate loanDate = LocalDate.now();
        LocalDate dueDate = loanDate.plusDays(LOAN_PERIOD_DAYS);
        Loan loan = new Loan(book, user, loanDate, dueDate);
        loans.add(loan);
        return loan;
    }

    // Return a book
    public void returnBook(Loan loan) {
        loan.setReturned(true);
        loan.getBook().setAvailable(true);  // Make book available again
    }

    // Get all active loans (not returned)
    public List<Loan> getActiveLoans() {
        return loans.stream()
                .filter(loan -> !loan.isReturned())
                .collect(Collectors.toList());
    }

    // Get overdue loans (loans past due date)
    public List<Loan> getOverdueLoans() {
        LocalDate today = LocalDate.now();
        return loans.stream()
                .filter(loan -> !loan.isReturned() && loan.getDueDate().isBefore(today))
                .collect(Collectors.toList());
    }

    // Get loans by user
    public List<Loan> getLoansByUser(User user) {
        return loans.stream()
                .filter(loan -> loan.getUser().equals(user) && !loan.isReturned())
                .collect(Collectors.toList());
    }
}