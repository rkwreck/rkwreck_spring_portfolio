package com.example.sping_portfolio.controllers.arithmeticModel;

public class ArithFor extends _Arithmetic {
    public ArithFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;
       // int count = 5;
        for (long[] f = new long[]{1, 5}; limit-- > 0; f = new long[]{f[1], f[1] + 4})
            super.setData(f[0]);
       // count++;
        }

    public static void main(String[] args) {
        int num = 20;
        _Arithmetic arithmetic = new ArithFor(num);
        arithmetic.print();
    }
}


