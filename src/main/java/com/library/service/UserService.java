package com.library.service;

import com.library.model.Book;
import com.library.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    // Register a new user
    public void registerUser(User user) {
        users.add(user);
    }

    // Borrow a book
    public Optional<Book> borrowBook(User user, Book book) {
        if (book.isAvailable()) {
            user.borrowBook(book);
            return Optional.of(book);
        } else {
            return Optional.empty(); // Book is not available
        }
    }

    // Return a book
    public void returnBook(User user, Book book) {
        user.returnBook(book);
    }

    // Find user by membership ID
    public Optional<User> findUserByMembershipId(String membershipId) {
        return users.stream()
                .filter(user -> user.getMemberShipId().equalsIgnoreCase(membershipId))
                .findFirst();
    }
}