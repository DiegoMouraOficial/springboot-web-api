package com.br.diegomoura.springbootwebapi.repositories;

import com.br.diegomoura.springbootwebapi.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Pode add métodos personalizados aqui, se necessário.
}
