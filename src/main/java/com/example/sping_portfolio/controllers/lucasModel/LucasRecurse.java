package com.example.sping_portfolio.controllers.lucasModel;

public class LucasRecurse extends _Lucas {

    public LucasRecurse(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{2, 1};
        initRecurse(limit,f);
    }

    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;                                 //exit condition
        super.setData(f[0]);
        initRecurse(--limit, new long[]{f[1], f[0] + f[1]});    //recursion requires pre-increment
    }

    public static void main(String[] args) {
        int num = 20;   //number of Lucas, 92 is max for long
        _Lucas lucas = new LucasRecurse(num);
        lucas.print();
    }
}
