package com.example.sping_portfolio.controllers.geometricModel;

import java.util.stream.Stream;

public class GeoFor extends com.example.sping_portfolio.controllers.geometricModel._Geometric {
    public GeoFor() {
        super();
    }
    public GeoFor(int nth, int r) {
        super(nth, r);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;
        for (long[] f = new long[]{1}; limit-- > 0; f = new long[]{f[0] * super.ratio})
            super.setData(f[0]);
    }

    /*
    Class method "main" with purpose of testing GeoStream
     */
    public static void main(String[] args) {
        com.example.sping_portfolio.controllers.geometricModel._Geometric geometric = new GeoFor();
        geometric.print();
    }
}
