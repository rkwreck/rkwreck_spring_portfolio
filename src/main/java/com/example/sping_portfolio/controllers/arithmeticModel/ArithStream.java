package com.example.sping_portfolio.controllers.arithmeticModel;

import java.util.stream.Stream;

public class ArithStream extends _Arithmetic {
    public ArithStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "Stream";
        int count = 5;
        Stream.iterate(new long[]{1, 5}, f -> new long[]{f[1], f[1] + 4})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]) );
    }

    public static void main(String[] args) {
        int num = 20;
        _Arithmetic arithmetic = new ArithStream(num);
        arithmetic.print();
    }
}