package com.example.sping_portfolio.controllers.geometricModel;

public class GeoRecurse extends com.example.sping_portfolio.controllers.geometricModel._Geometric {
    public GeoRecurse() {
        super();
    }
    public GeoRecurse(int nth, int r) {
        super(nth, r);
    }


    @Override
    protected void init() {
        super.name = "Recurse";
        long limit = super.size;
        long[] f = new long[]{1};
        initRecurse(limit, f);
    }


    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;
        super.setData(f[0]);
        initRecurse(--limit, new long[]{f[0] * super.ratio});
    }
    /*
    Class method "main" with purpose of testing GeoStream
     */
    public static void main(String[] args) {
        com.example.sping_portfolio.controllers.geometricModel._Geometric geometric = new GeoRecurse();
        geometric.print();
    }
}
