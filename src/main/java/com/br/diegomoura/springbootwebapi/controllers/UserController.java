package com.br.diegomoura.springbootwebapi.controllers;

import com.br.diegomoura.springbootwebapi.models.User;
import com.br.diegomoura.springbootwebapi.repositories.UserRepository;
import com.br.diegomoura.springbootwebapi.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    public List<User> getUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserByid(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
    @PostMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }

    @DeleteMapping({"/{id}"})
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "User deleted successfuly";
    }

}
