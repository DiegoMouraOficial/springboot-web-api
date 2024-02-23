package com.br.diegomoura.springbootwebapi.models;

public class Users {
    private Integer id;
    private String login;
    private String passaword;

    //#region ... Constructor
    public Users() {}
    public Users(String login, String passaword)  {
        this.login = login;
        this.passaword = passaword;
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
    public String getPassaword() {
        return passaword;
    }
    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }
    //#endregion

    //#region ... To String
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passaword='" + passaword + '\'' +
                '}';
    }
    //#endregion
}
