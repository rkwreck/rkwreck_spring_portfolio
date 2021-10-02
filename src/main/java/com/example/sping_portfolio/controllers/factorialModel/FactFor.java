package com.example.sping_portfolio.controllers.factorialModel;

public class FactFor extends _Factorial {
    public FactFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;
        for (long[] f = new long[]{0, 1}; limit-- > 0; f = new long[]{f[1], f[0] + f[1]})
            super.setData(f[0]);
    }

    public static void main(String[] args) {
        int num = 20;   //number of Fibs, 92 is max for long
        _Factorial factorial = new FactFor(num);
        factorial.print();
    }

}
