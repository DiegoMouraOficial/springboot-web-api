package com.br.diegomoura.springbootwebapi.models;

public class Users {
    private Integer id;
    private String login;
    private String password;

    //#region ... Constructor
    public Users() {}
    public Users(String login, String password)  {
        this.login = login;
        this.password = password;
    }
    //#endregion

    //#region ... Getters and Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //#endregion

    //#region ... To String
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passaword='" + password + '\'' +
                '}';
    }
    //#endregion
}
