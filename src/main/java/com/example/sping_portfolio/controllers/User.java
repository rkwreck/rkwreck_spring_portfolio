package com.example.sping_portfolio.controllers;

import javax.persistence.*;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private String password;
}
