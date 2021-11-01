package com.example.sping_portfolio.controllers;

import lombok.Getter;

import javax.persistence.*;

public class User {

    private String firstname;
    private String password;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
