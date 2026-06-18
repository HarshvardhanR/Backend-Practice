package com.example.demo.Repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.Domain.User;

@Repository
public class UserRepository{

    List<User> users;

    public UserRepository(){
        users = new ArrayList<>();
        User user = new User(1, "Harsh");
        users.add(user);
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(users);
    }
}