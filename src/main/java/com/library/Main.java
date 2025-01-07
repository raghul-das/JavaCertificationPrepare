package com.library;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.User;
import com.library.service.LibraryService;
import com.library.service.LoanService;
import com.library.service.UserService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Setup services
        LibraryService libraryService = new LibraryService();
        UserService userService = new UserService();
        LoanService loanService = new LoanService();

        // Add books
        Book book1 = new Book("Java 8 in Action", "Raoul-Gabriel Urma", "Programming", LocalDate.of(2014, 8, 1));
        Book book2 = new Book("Effective Java", "Joshua Bloch", "Programming", LocalDate.of(2017, 1, 1));
        libraryService.addBook(book1);
        libraryService.addBook(book2);

        // Register user
        User user1 = new User("Alice", "U001");
        userService.registerUser(user1);

        // Borrow book
        loanService.borrowBook(book1, user1);
        System.out.println("Active loans: " + loanService.getActiveLoans());

        // Simulate returning the book
        Loan loan = loanService.getActiveLoans().get(0);  // Get the first active loan
        loanService.returnBook(loan);
        System.out.println("Active loans after returning: " + loanService.getActiveLoans());

        // Check overdue loans (can manipulate the system date for testing overdue functionality)
        System.out.println("Overdue loans: " + loanService.getOverdueLoans());
    }
}