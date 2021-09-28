package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class arithmeticSequence {
    @GetMapping("/arithmeticSequence")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String initialvalue(@RequestParam(name="initVal", required=true, defaultValue="Null") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("initVal", name); // MODEL is passed to html
        model.addAttribute("cdVal", name); // MODEL is passed to html
        model.addAttribute("iteration", name); // MODEL is passed to html
        model.addAttribute("aseqPrint", name);

        return "arithmeticSequence"; // returns HTML VIEW (greeting)
    }

}