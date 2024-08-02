package com.ecfJuillet.back.services.impl;

import com.ecfJuillet.back.entities.User;
import com.ecfJuillet.back.repositories.UserRepository;
import com.ecfJuillet.back.services.UserService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll().stream().toList();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void createUser(User user) {
        userRepository.saveAndFlush(user);
    }
}
