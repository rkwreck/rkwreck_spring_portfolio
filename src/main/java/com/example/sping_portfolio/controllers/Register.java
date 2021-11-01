package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.sping_portfolio.controllers.lucasModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Register {

    @GetMapping("/register")
    public String register(@RequestParam(name="account", required=true) String account, Model model) {

        // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
        return "Register"; // returns HTML VIEW (greeting)
    }
}




