package com.example.sping_portfolio.controllers.asciiArt;
import java.awt.Color;
import lombok.Getter;
import org.apache.tomcat.util.codec.binary.Base64;
import org.apache.tomcat.util.codec.binary.StringUtils;

import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


import com.example.sping_portfolio.controllers.lucasModel._Lucas;

public class asciiArt {


    @Getter  // automatic getter, https://projectlombok.org/features/GetterSetter
    public class ImageInfo {
        public int scale_factor;
        public String file, url;
        public int height, scaled_height;
        public int width, scaled_width;
        public int[][][] rgb_matrix;

        // basic constructor
        public ImageInfo(String file, String url, int scale_factor) {
            this.file = file;
            this.url = url;
            this.scale_factor = scale_factor;
        }

        // sets for properties of the image, including pixels and colors
        public Exception read_image() {
            try {
                BufferedImage img = ImageIO.read(new URL(this.url));
                this.height = img.getHeight();
                this.scaled_height = this.height / scale_factor;
                this.width = img.getWidth();
                this.scaled_width = this.width / scale_factor;
                //System.out.println(Integer.toString(this.height) + " " + Integer.toString(this.width));
                this.rgb_matrix = new int[this.height][this.width][3];

                for (int y = 0; y < this.height; y++) {
                    for (int x = 0; x < this.width; x++) {
                        int pixel = img.getRGB(x, y);
                        Color color = new Color(pixel, true);

                        this.rgb_matrix[y][x][0] = color.getRed();
                        this.rgb_matrix[y][x][1] = color.getGreen();
                        this.rgb_matrix[y][x][2] = color.getBlue();
                    }
                }

            } catch (Exception e) {
                return e;
            }

            return null;
        }

        /**
         * Converts the colored pixel array to 1D INT array of grayscale values
         * Grayscale is simple all rgb values set to the same value, (0,0,0) (100,100,100) (255, 255, 255)
         * Look through the byte values and take the average of the RGB values and set them all equal to that same average
         * Ignore the alpha, it controls transparency
         */
        public int[] grayscale(byte[] pixels) {
            int[] pixels_int = new int[pixels.length];
            for (int i = 0; i < pixels.length; i += 4) {
                float val = 0;
                for (int y = 1; y < 4; y++) {
                    val += (pixels[i + y] & 0xFF) / 3.0; // The & 0xFF is a "bitwise and" https://www.geeksforgeeks.org/bitwise-operators-in-java/. Just divigin by 3 to get the average
                }
                pixels_int[i] = pixels[i]; // keep alpha the same
                pixels_int[i + 1] = (int) val;
                pixels_int[i + 2] = (int) val;
                pixels_int[i + 3] = (int) val;
            }
            return pixels_int;
        }

        public int[][] to_grayscale() {
            // grey scale is calculated to average of pixel
            int[][] gs = new int[height][width];
            for (int h = 0; h < height; h++) {
                for (int w = 0; w < width; w++) {
                    int r = this.rgb_matrix[h][w][0];
                    int g = this.rgb_matrix[h][w][1];
                    int b = this.rgb_matrix[h][w][2];
                    // averaging
                    int avg = (r + g + b) / 3;
                    gs[h][w] = avg;
                }
            }
            return gs;

        }

    }

}
