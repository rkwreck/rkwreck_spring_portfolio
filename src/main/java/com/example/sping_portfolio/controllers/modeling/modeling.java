package com.example.sping_portfolio.controllers.modeling;
import java.util.ArrayList;
import lombok.Getter;
import java.net.URL;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

@Getter
public class modeling {

    public String file, url;

    public modeling(String file, String url) {

    }

    ArrayList<ii> lii = new ArrayList<>();

    public void add() {
        ii file0 = new ii("/images/Mona_Lisa.png");
        lii.add(file0);
        ii file1 = new ii("/images/bulb_on.gif");
        lii.add(file1);
        ii file2 = new ii("/bulb_off.png");
        lii.add(file2);
    }



    public class ii {
        public String file;

        public ii(String file) {
            this.file = file;
        }

        ArrayList<iprop> list = new ArrayList<iprop>();
        iprop test = new iprop("hello", "hi");

        public void add() {
            list.add(test);
        }


    }

    public class iprop {
        public String description;
        public String base64;

        public iprop(String descrip, String base) {
            this.description = descrip;
            this.base64 = base;
        }




    }

    public class iprgb {

    }

    public int[][][] rgb() {
        int intArray[][][] = new int[20][][];
        return intArray;

    }

    public String hexa() {
        return "hello";

    }

    public int[][][] binary() {
        int intArray[][][] = new int[20][][];
        return intArray;

    }
     /////

}




