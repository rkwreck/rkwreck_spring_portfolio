package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.controllers.lucasModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class LucasController {

    public List<_Lucas> lucasInit(int nth) {
        //Lucas objects created with different initializers
        List<_Lucas> lucasList = new ArrayList<>();
        lucasList.add(new LucasFor(nth));
        lucasList.add(new LucasWhile(nth));
        lucasList.add(new LucasRecurse(nth));
        lucasList.add(new LucasStream(nth));

        return lucasList;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/lucas")
    public String lucas(@RequestParam(name="lucasseq", required=false,  defaultValue="1") String lucasseq, Model model) {
        //nth is lucas request
        int nth = Integer.parseInt(lucasseq);

        //MODEL attributes are passed back html
        model.addAttribute("lucasList", lucasInit(nth));

        return "lucasSequence"; //HTML render lucas results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<_Lucas> lucasList = new LucasController().lucasInit(nth);
        for (_Lucas lucas : lucasList)
            lucas.print();  //Console output locus results
    }
}