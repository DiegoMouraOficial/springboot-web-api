package com.br.diegomoura.springbootwebapi.controllers;

import com.br.diegomoura.springbootwebapi.models.User;
import com.br.diegomoura.springbootwebapi.repositories.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @Operation(summary = "Listar", description = "Metódo que retorna todos os dados da Users", tags = "Users")
    @GetMapping()
    public List<User> getUsers() {
        return repository.findAll();
    }
//    @GetMapping("/{username}")
//    public Users getOneUser(@PathVariable("username") String username) {
//        return repository.findByUsername(username);
//    }
    @DeleteMapping("/{id}")
    public void deleteUser (@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser (@RequestBody User user) {
        repository.save(user);
    }
}
