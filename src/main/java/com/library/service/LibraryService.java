package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryService {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
        book.setAvailable(false);
    }

}