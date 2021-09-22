package com.example.spring_portfolio.minilabs;
import java.util.Scanner;

public class counter {

    public static void main(String[] args) {

        Scanner iteration = new Scanner(System.in);
        System.out.println("Welcome! How many numbers of the Arithmetic Sequence do you need?");
        String arithmetic = input.nextLine();
        int anum = Integer.parseInt(arithmetic);

        Scanner cd = new Scanner(System.in);
        System.out.println("What is the common difference?");
        String slope = input.nextLine();
        int snum = Integer.parseInt(slope);

        Scanner cd = new Scanner(System.in);
        System.out.println("What is the initial value?");
        String yint = input.nextLine();
        int inum = Integer.parseInt(yint);

        int num1 = inum;
        int count = 0;

        while (count < anum) {

            System.out.print(num1 + " ");

            int num2 = num1 + snum;
            num1 = num2;
            count = count + 1;
        }


    }
}