package com.example.sping_portfolio.controllers.factorialModel;

public class FactWhile extends _Factorial {
    public FactWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";
        long limit = super.size;
        long[] f = new long[]{0, 1};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[0] + f[1]};
        }
    }

    public static void main(String[] args) {
        int num = 20;   //number of Fibs, 92 is max for long
        _Factorial factorial = new FactWhile(num);
        factorial.print();
    }
}
