package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.controllers.geometricModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GeometricController {

    public List<_Geometric> geomInit(int nth, int r) {
        //Geometric objects with different initializers based on method
        List<_Geometric> geomList = new ArrayList<>();
        geomList.add(new GeoFor(nth, r));
        geomList.add(new GeoWhile(nth, r));
        geomList.add(new GeoRecurse(nth, r));
        geomList.add(new GeoStream(nth, r));

        return geomList;
    }

    // GET request, parameters are passed within the URI
    @GetMapping("/geometricSequence")
    public String geo(@RequestParam(name="geomSeq", required=false, defaultValue="20") String geomSeq, @RequestParam(name="geomRatio", required=false, defaultValue="2") String geomRatio, Model model) {
        //nth is how far the sequence goes
        int nth = Integer.parseInt(geomSeq);
        int r = Integer.parseInt(geomRatio);
        //MODEL attributes are passed back html
        model.addAttribute("geomList", geomInit(nth, r));

        return "/geometricSequence"; //HTML render factorial results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long
        int r = 2;
        List<_Geometric> geomList = new GeometricController().geomInit(nth, r);
        for (_Geometric geometric: geomList)
            geometric.print();  //Console output factorial results
    }
}