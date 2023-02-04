package com.example.demo.service;



import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void delete(int id);
    void add(User user);
    public User getById(int id);
    void update(User user);
    List<User> listUsers();
}
