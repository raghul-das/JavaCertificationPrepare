package com.library.service;

import com.library.model.Book;
import com.library.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private List<User> userList = new ArrayList<>();

    public void registerUser(User user) {
        userList.add(user);
    }
}