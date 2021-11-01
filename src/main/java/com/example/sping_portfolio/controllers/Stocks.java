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
        //rapid setup
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://myallies-breaking-news-v1.p.rapidapi.com/GetCompanyDetailsBySymbol?symbol=twtr"))
                .header("x-rapidapi-host", "myallies-breaking-news-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "1921f2f385msh8c6d68cf81b3011p18ec0ejsn3bb209316b36")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        //rapidapi call
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()); //convert to java hash map

        var map = new ObjectMapper().readValue(response.body(), HashMap.class);
        //pass stats to view
        model.addAttribute("data", map);
        model.addAttribute("StockID", map.get("identity"));
        model.addAttribute("LastTradePriceOnly", map.get("trade"));
        model.addAttribute("ChangePercent", map.get("percentage"));
        model.addAttribute("CompanyName", map.get("name"));
       return "Stocks"; //returns HTML view
    }
}