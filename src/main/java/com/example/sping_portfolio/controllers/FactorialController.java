package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.controllers.factorialModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FactorialController {

    public List<_Factorial> factInit(int nth) {
        //Factorial objects with different initializers based on method
        List<_Factorial> factList = new ArrayList<>();
        factList.add(new FactFor(nth));
        factList.add(new FactWhile(nth));
        factList.add(new FactRecurse(nth));
        factList.add(new FactStream(nth));

        return factList;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/factorialSequence")
    public String fib(@RequestParam(name="factseq", required=false,  defaultValue="2") String factseq, Model model) {
        //nth is how far the sequence goes
        int nth = Integer.parseInt(factseq);

        //MODEL attributes are passed back html
        model.addAttribute("factList", factInit(nth));

        return "/factorialSequence"; //HTML render factorial results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<_Factorial> factList = new FactorialController().factInit(nth);
        for (_Factorial factorial : factList)
            factorial.print();  //Console output factorial results
    }
}
