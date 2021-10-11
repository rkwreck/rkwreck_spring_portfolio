package com.example.sping_portfolio.controllers.modeling;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import lombok.Getter;
import org.apache.tomcat.util.codec.binary.Base64;

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

    public void add() throws IOException {
        ii file0 = new ii("/images/Mona_Lisa.png");
        lii.add(file0);
        ii file1 = new ii("/images/bulb_on.gif");
        lii.add(file1);
        ii file2 = new ii("/bulb_off.png");
        lii.add(file2);
    }



    public class ii {
        public String file;
        BufferedImage img = ImageIO.read(new URL(url));

        public ii(String file) throws IOException {
            this.file = file;
        }

        ArrayList<iprop> list = new ArrayList<iprop>();
        byte[] pixels_int = image_to_pixels(img);
        String base64 = pixels_to_base64(img.getWidth(), img.getHeight(), pixels_int);
        iprop original = new iprop("original info", base64);



        public void add() {

            list.add(original);
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

    public String pixels_to_base64(int width, int height, byte[] pixels) throws IOException {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for(int y=0; y<height;y++) {
            for(int x=0; x<width; x++) {
                int a,r,g,b;
                int s = (y*width + x)*4;
                a=pixels[s+0];
                r=pixels[s+1];
                g=pixels[s+2];
                b=pixels[s+3];
                img.setRGB(x,y, argb(a,r,g,b));
            }
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(img, "gif", bos);
        byte[] data = bos.toByteArray();
        return Base64.encodeBase64String(data);
    }

    public int argb(int a, int r, int g, int b) {
        return ((a&0x0ff)<<24)|((r&0x0ff)<<16)|((g&0x0ff)<<8)|(b&0x0ff);
    }

    public byte[] image_to_pixels(BufferedImage img) throws IOException {
        byte[] pixels = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
        return pixels;
    }

}




