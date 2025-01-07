package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryService {
    private List<Book> books;

    public LibraryService() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // List all available books
    public List<Book> getAvailableBooks() {
        return books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());
    }

    // Search books by genre
    public List<Book> searchBooksByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    // Search books by author
    public List<Book> searchBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
}