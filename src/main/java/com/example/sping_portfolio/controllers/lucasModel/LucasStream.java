package com.example.sping_portfolio.controllers.lucasModel;

import java.util.stream.Stream;

public class LucasStream extends _Lucas {
    public LucasStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "Stream";
        Stream.iterate(new long[]{2, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]) );
    }

    public static void main(String[] args) {
        int num = 20;   //number of Lucas, 92 is max for long
        _Lucas lucas = new LucasStream(num);
        lucas.print();
    }
}
