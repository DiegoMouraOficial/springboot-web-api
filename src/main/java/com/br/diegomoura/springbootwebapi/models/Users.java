package com.br.diegomoura.springbootwebapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    //#region ... Constructor
    public Users() {}
    public Users(String name, String email)  {
        this.name = name;
        this.email = email;
    }
    //#endregion

    //#region ... Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //#endregion

    //#region ... To String
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    //#endregion

    //#region ... Equals e HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users users)) return false;
        return Objects.equals(id, users.id) && Objects.equals(name, users.name) && Objects.equals(email, users.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
    //#endregion
}
