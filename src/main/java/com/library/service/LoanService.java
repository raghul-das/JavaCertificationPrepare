package com.library.service;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LoanService {

    private List<Loan> loansList = new ArrayList<>();

    public void borrowBook(Book book1, User user1) {
            LocalDate today = LocalDate.now();
            Loan loan = new Loan(book1, user1, today, today.plusDays(14));
            loansList.add(loan);
    }

    public List<Loan> getActiveLoans() {
        return loansList.stream().filter(activeLoan -> !activeLoan.isReturned()).collect(Collectors.toList());
    }
}