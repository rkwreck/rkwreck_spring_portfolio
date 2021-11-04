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
public class loginStocks {
    @GetMapping("/loginStocks")
    /*public String Search(@RequestParam(name="sym", required=false, defaultValue="TWTR") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("sym", name); // MODEL is passed to html
        return "loginStocks"; // returns HTML VIEW (greeting)
    }*/
    public String Search(@RequestParam(name="sym", required=false, defaultValue="TWTR") String name, Model model) throws IOException, InterruptedException {
            String rapidapiurl = "https://myallies-breaking-news-v1.p.rapidapi.com/GetCompanyDetailsBySymbol?symbol=" + name;
            //rapid setup
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(rapidapiurl))
                    .header("x-rapidapi-host", "myallies-breaking-news-v1.p.rapidapi.com")
                    .header("x-rapidapi-key", "1921f2f385msh8c6d68cf81b3011p18ec0ejsn3bb209316b36")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            //rapidapi call
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()); //convert to java hash map

            var map = new ObjectMapper().readValue(response.body(), HashMap.class);
            //pass stats to view
            model.addAttribute("data", map);
            model.addAttribute("identity", map.get("StockID"));
            model.addAttribute("trade", map.get("LastTradePriceOnly"));
            model.addAttribute("percentage", map.get("ChangePercent"));
            model.addAttribute("name", map.get("CompanyName"));
            return "loginStocks";
    }
}
