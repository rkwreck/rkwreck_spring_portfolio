package com.example.sping_portfolio.controllers;

public class ArithmeticWhile extends _Arithmetic {
    public ArithmeticWhile(int nth) { super(nth);}

    @Override
    protected void init(){
        super.name = "While";
        long limit = super.size;
        long[] f = new long[]{0,1};
        while (limit-- > 0) {
            super.setData(f[0]);
            super.setData(f[c]);
            s = new long[]{f[1]}
        }
    }

    public static void main(String[] args) {
        int num = 20;   //number of Fibs, 92 is max for long
        _Arithmetic arithmetic = new ArithmeticWhile(num);
        arithmetic.print();
    }

}



public class FibWhile extends _Fibonacci {
    public FibWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";
        long limit = super.size;
        long[] f = new long[]{0, 1};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[0] + f[1]};
        }
    }

    public static void main(String[] args) {
        int num = 20;   //number of Fibs, 92 is max for long
        _Fibonacci fibonacci = new FibWhile(num);
        fibonacci.print();
    }
}
