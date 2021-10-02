package com.example.sping_portfolio.controllers.factorialModel;

public class FactRecurse extends _Factorial {

    public FactRecurse(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{1, 2};
        initRecurse(limit,f, 2);
    }

    private void initRecurse(long limit, long[] f, int count) {
        if (limit == 0) return;                                 //exit condition
        super.setData(f[0]);
        count++;
        initRecurse(--limit, new long[]{f[1], f[1] * count}, count);    //recursion requires pre-increment
    }

    public static void main(String[] args) {
        int num = 20;   //size of sequence, 92 is max for long
        _Factorial factorial = new FactRecurse(num);
        factorial.print();
    }

}
