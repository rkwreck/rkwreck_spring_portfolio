package com.example.sping_portfolio.controllers.factorialModel;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class FactStream extends _Factorial {
    public FactStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "Stream";
        // have to use atomic integer in order to change increment value each time
        AtomicInteger atomicint = new AtomicInteger(3);
        Stream.iterate(new long[]{1, 2}, f -> new long[]{f[1], f[1] * atomicint.getAndIncrement()})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]));
    }

    public static void main(String[] args) {
        int num = 20;   //size of sequence, 92 is max for long
        _Factorial factorial = new FactStream(num);
        factorial.print();
    }
}
