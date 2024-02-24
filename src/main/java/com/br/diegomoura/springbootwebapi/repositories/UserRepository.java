package com.br.diegomoura.springbootwebapi.repositories;

import com.br.diegomoura.springbootwebapi.models.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Users users) {
        if (users.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(users);
    }
    public void deleteById (Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário %n", id);
        System.out.println(id);
    }
    public List<Users> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");

        List<Users> users = new ArrayList<>();
        users.add(new Users("diego","password1"));
        users.add(new Users("bruna","password2"));

        return users;
    }
    public Users findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d para localizar um usuário", id);
        return new Users("diego", "password1");
    }
    public Users findByUsername(String username) {
        System.out.printf("FIND/username - Recebendo o username: %s para localizar um usuário ", username);
        return new Users("diego","passaword");
    }
}
