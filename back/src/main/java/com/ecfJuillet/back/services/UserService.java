package com.ecfJuillet.back.services;

import com.ecfJuillet.back.entities.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(int id);

    public void createUser(User user);
}
