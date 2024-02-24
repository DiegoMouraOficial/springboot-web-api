package com.br.diegomoura.springbootwebapi.controllers;

import com.br.diegomoura.springbootwebapi.models.Users;
import com.br.diegomoura.springbootwebapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<Users> getUsers() {
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public Users getOneUser(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUser (@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser (@RequestBody Users users) {
        repository.save(users);
    }
}
