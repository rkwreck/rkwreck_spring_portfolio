package com.example.sping_portfolio.controllers.arithmeticModel;

public class ArithRecurse extends _Arithmetic {

    public ArithRecurse(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{1, 5};
        int count = 4;
        initRecurse(limit,f, 4);
    }

    private void initRecurse(long limit, long[] f, int count) {
        if (limit == 0) return;
        super.setData(f[0]);
        initRecurse(--limit, new long[]{f[1], f[1] + count}, count);
    }

    public static void main(String[] args) {
        int num = 20;
        _Arithmetic arithmetic = new ArithRecurse(num);
        arithmetic.print();
    }

}
