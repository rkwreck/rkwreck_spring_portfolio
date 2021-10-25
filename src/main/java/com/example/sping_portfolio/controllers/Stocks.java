package com.example.sping_portfolio.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Stocks {
    @GetMapping("/Stocks")
    public String stocks(Model model) throws IOException, InterruptedException {
        //rapidapi setup
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://stock-data-yahoo-finance-alternative.p.rapidapi.com/v6/finance/quote?symbols=AAPL%2CETH-USD"))
                .header("x-rapidapi-host", "stock-data-yahoo-finance-alternative.p.rapidapi.com")
                .header("x-rapidapi-key", "SIGN-UP-FOR-KEY")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        //rapidapi call
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());        //convert to java hash map
       var map = new ObjectMapper().readValue(response.body(), HashMap.class);
        //pass country stats to view
        model.addAttribute("data", map);
        model.addAttribute("results", map.get("result"));
        //model.addAttribute("countries", map.get("countries_stat"));
       return "Stocks"; //returns HTML view
    }
}