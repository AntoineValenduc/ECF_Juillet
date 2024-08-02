package com.ecfJuillet.back.controllers;

import com.ecfJuillet.back.entities.User;
import com.ecfJuillet.back.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/quizgame/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/id")
    public Optional<User> getUserById(@RequestParam int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create_user")
    public void createUser(@RequestParam User user) {
        userService.createUser(user);
    }
}
