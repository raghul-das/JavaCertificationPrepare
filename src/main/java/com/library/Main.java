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
        Book book3 = new Book("Master of Emotions", "John", "Self-help", LocalDate.of(2020,7,15));
        libraryService.addBook(book1);
        libraryService.addBook(book2);

        // Register user
        User user1 = new User("Alice", "U001");
        userService.registerUser(user1);

        // Borrow book
        loanService.borrowBook(book1, user1);
        System.out.println("Active loans: " + loanService.getActiveLoans());

        // Check available books
        /*System.out.println("Available books: " + libraryService.getAvailableBooks());

        // Search by genre and author
        System.out.println("Programming books: " + libraryService.searchBooksByGenre("Programming"));
        System.out.println("Books by Joshua Bloch: " + libraryService.searchBooksByAuthor("Joshua Bloch"));

        // Return book
        Loan loan = loanService.getActiveLoans().get(0);  // Get first active loan
        loanService.returnBook(loan);
        System.out.println("Active loans after return: " + loanService.getActiveLoans());

        // Check overdue loans
        System.out.println("Overdue loans: " + loanService.getOverdueLoans());

        // Find user by membership ID
        userService.findUserByMembershipId("U001").ifPresent(u -> System.out.println("Found user: " + u.getName()));
    */}
}