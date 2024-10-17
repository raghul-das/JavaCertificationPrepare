package com.library.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String memberShipId;
    private List<Book> borrowedBooks;

    public User(String name, String memberShipId) {
        this.name = name;
        this.memberShipId = memberShipId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberShipId() {
        return memberShipId;
    }

    public void setMemberShipId(String memberShipId) {
        this.memberShipId = memberShipId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        book.setAvailable(false);
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
        book.setAvailable(true);
    }
}
