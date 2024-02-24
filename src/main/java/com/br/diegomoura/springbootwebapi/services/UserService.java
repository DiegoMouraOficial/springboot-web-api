package com.br.diegomoura.springbootwebapi.services;

import com.br.diegomoura.springbootwebapi.exceptions.UserNotFoundException;
import com.br.diegomoura.springbootwebapi.models.User;
import com.br.diegomoura.springbootwebapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Lista todos usuários
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Busca usuário por id
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id" + id));
    }

    // Cria usuário
    public User createUser(User user) {

        //Verifica se o email já está em uso
        if(userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new UserNotFoundException("Email already in use" + user.getEmail());
        }
        return userRepository.save(user);
    }

    // Atualiza usuário
    public User updateUser (Long id, User userDetails) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id " + id));

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());

        return userRepository.save(user);
    }

    // Deleta usuário
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
