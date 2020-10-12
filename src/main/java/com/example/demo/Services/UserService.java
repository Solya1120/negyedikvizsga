package com.example.demo.Services;

import com.example.demo.Modells.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User create(User user);
    void delete(Integer id);
    User update(User user);
}
