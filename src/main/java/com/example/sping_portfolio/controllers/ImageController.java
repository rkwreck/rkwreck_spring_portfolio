package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class ImageController {
    @GetMapping("/image")
    public String image(Model model, @RequestParam(name="grayparam", required=false, defaultValue="off") String grayscale)  {

        //String web_server = "http://localhost:8080/";
        String web_server = "https://csa.nighthawkcodingsociety.com";
        Map<String, ImageInfo> lii = new HashMap<String, ImageInfo>();

        String file0 = "/images/Mona_Lisa.png";
        lii.put("Mona_lisa", new ImageInfo(file0, web_server+file0, 12));

        String file1 = "/images/bulb_on.gif";
        lii.put("bulb_on", new ImageInfo(file1, web_server+file1, 2));

        String file2 = "/images/bulb_off.png";
        lii.put("bulb_off", new ImageInfo(file2, web_server+file2, 7));

        String file3 = "/images/giraffe_albino.png";
        lii.put("albino_giraffe", new ImageInfo(file3, web_server+file3, 7));

        String file4 = "/images/giraffe_sky.png";
        lii.put("giraffe_sky", new ImageInfo(file4, web_server+file4, 7));

        String file5 = "/images/giraffe_smile.png";
        lii.put("giraffe_smile", new ImageInfo(file5, web_server+file5, 7));

        String file6 = "/images/giraffe_walking.png";
        lii.put("giraffe_walking", new ImageInfo(file6, web_server+file6, 7));

        String file7 = "/images/giraffe_smelling.png";
        lii.put("giraffe_smelling", new ImageInfo(file7, web_server+file7, 7));

        String file8 = "/images/giraffe_head.png";
        lii.put("giraffe_head", new ImageInfo(file8, web_server+file8, 7));

        String file9 = "/images/giraffe_trick.png";
        lii.put("giraffe_trick", new ImageInfo(file9, web_server+file9, 7));

        if (grayscale == "on"){
            lii.forEach((k,v) -> v.grayscale());
        }
        else{
            lii.forEach((k,v) -> v.read_image());
        }
        List<ImageInfo> list = new ArrayList<ImageInfo>(lii.values());
        model.addAttribute("lii", list);
        return "/image";
    }


    /*
    @GetMapping("/image/grayscale")
    public String image_grayscale(Model model) {
        //String web_server = "http://localhost:8080/";
        String web_server = "https://csa.nighthawkcodingsociety.com";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/blue-square-16.gif";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        String str = lii.get(0).grayscale();
        model.addAttribute("str", str);
        return "/image_grayscale";
    }
    */

}