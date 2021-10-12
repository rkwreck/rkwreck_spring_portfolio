/*

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
    public int scale_factor;
    public int height, scaled_height;
    public int width, scaled_width;
    public int[][][] rgb_matrix;

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
        String orbase64 = pixels_to_base64(img.getWidth(), img.getHeight(), pixels_int);
        iprop original = new iprop("original info", orbase64);
        byte[] pixels_int2 = grayscale(pixels_int);
        String gsbase64 = pixels_to_base64(img.getWidth(), img.getHeight(), pixels_int2);
        iprop gray = new iprop("greyscale info", gsbase64);




        public void add() {

            list.add(original);
            list.add(gray);
        }
        ///


    }

    public class iprop {
        public String description;
        public String base64;

        public iprop(String descrip, String base) {
            this.description = descrip;
            this.base64 = base;
        }

        ArrayList<iprgb> rgb = new ArrayList<iprgb>();

        public void add() {
            //rgb.add(iprgb.int);
        }
    }

    public class iprgb {

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

    public byte[] grayscale(byte[] pixels){
        byte[] pixels_int = new byte[pixels.length];
        for(int i=0;i<pixels.length;i+=4) {
            float val = 0;
            for(int y=1;y<4;y++) {
                val += (pixels[i+y] & 0xFF)/3.0; // The & 0xFF is a "bitwise and" https://www.geeksforgeeks.org/bitwise-operators-in-java/. Just divigin by 3 to get the average
            }
            pixels_int[i+0] = pixels[i]; // keep alpha the same
            pixels_int[i+1] = (byte)val;
            pixels_int[i+2] = (byte)val;
            pixels_int[i+3] = (byte)val;
        }
        return pixels_int;
    }



    public int getScaled_height(int row) {
        return row * this.scale_factor;
    }

    public int getScaled_width(int col) {
        return col * this.scale_factor;
    }
    public String getRGB(int row, int col) {
        int h = row * this.scale_factor;
        int w = col * this.scale_factor;
        return "(" + rgb_matrix[h][w][0] +
                "," + rgb_matrix[h][w][1] +
                "," + rgb_matrix[h][w][2] +
                ")" ;
    }

    public String getHexCode(int row, int col) {
        int h = row * this.scale_factor;
        int w = col * this.scale_factor;
        // String.format guarantees 0 padding vs Integer.toHexString
        return "#" +
                String.format("%02X",rgb_matrix[h][w][0]) +
                String.format("%02X",rgb_matrix[h][w][1]) +
                String.format("%02X",rgb_matrix[h][w][2]) ;
    }

    public String getBinary(int row, int col) {
        int h = row * this.scale_factor;
        int w = col * this.scale_factor;
        // Java does not have binary as string formatter
        return  String.format("%8s", Integer.toBinaryString(rgb_matrix[h][w][0])).replace(' ', '0') +
                " " +
                String.format("%8s", Integer.toBinaryString(rgb_matrix[h][w][1])).replace(' ', '0') +
                " " +
                String.format("%8s", Integer.toBinaryString(rgb_matrix[h][w][2])).replace(' ', '0') ;
    }

}


*/

