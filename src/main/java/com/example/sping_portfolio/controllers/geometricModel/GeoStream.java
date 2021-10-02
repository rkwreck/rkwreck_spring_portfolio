package com.example.sping_portfolio.controllers.geometricModel;

import java.util.stream.Stream;

public class GeoStream extends com.example.sping_portfolio.controllers.geometricModel._Geometric {
    public GeoStream() {
        super();
    }
    public GeoStream(int nth, int r) {
        super(nth, r);
    }

    /*
    Abstract Polymorphic "init()" method using Stream and Lambda expressions
    */
    @Override
    protected void init() {
        super.name = "Stream";
        // Stream iterates using lambda "->" syntax unil ".limit" is reached
        Stream.iterate(new long[]{1}, f -> new long[]{f[0] * super.ratio})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]));
    }

    /*
    Class method "main" with purpose of testing GeoStream
     */
    public static void main(String[] args) {
        com.example.sping_portfolio.controllers.geometricModel._Geometric geometric = new GeoStream();
        geometric.print();
    }
}
