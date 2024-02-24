package com.br.diegomoura.springbootwebapi.repositories;

import com.br.diegomoura.springbootwebapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    // Pode add métodos personalizados aqui, se necessário.
}
