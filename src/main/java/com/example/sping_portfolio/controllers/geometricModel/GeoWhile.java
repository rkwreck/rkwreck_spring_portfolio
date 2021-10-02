package com.example.sping_portfolio.controllers.geometricModel;

public class GeoWhile extends com.example.sping_portfolio.controllers.geometricModel._Geometric {
    public GeoWhile() {
        super();
    }
    public GeoWhile(int nth, int r) {
        super(nth, r);
    }

    @Override
    protected void init() {
        super.name = "While";
        long limit = super.size;
        long[] f = new long[]{1};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[0] * super.ratio};
        }
    }

    /*
    Class method "main" with purpose of testing GeoWhile
     */
    public static void main(String[] args) {
        com.example.sping_portfolio.controllers.geometricModel._Geometric geometric = new GeoWhile();
        geometric.print();
    }
}
