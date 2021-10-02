package com.example.sping_portfolio.controllers.factorialModel;

public class FactFor extends _Factorial {
    public FactFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;
        int count = 2;
        for (long[] f = new long[]{1, 2}; limit-- > 0; f = new long[]{f[1], f[1] * count})
        {
            super.setData(f[0]);
            count++;
        }

    }

    public static void main(String[] args) {
        int num = 20;   //size of sequence, 92 is max for long
        _Factorial factorial = new FactFor(num);
        factorial.print();
    }

}
