package com.example.sping_portfolio.controllers.factorialModel;

public class FactWhile extends _Factorial {
    public FactWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";
        long limit = super.size;
        long[] f = new long[]{1, 2};
        int count = 3;
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[1] * count};
            count++;
        }
    }

    public static void main(String[] args) {
        int num = 20;   //size of sequence, 92 is max for long
        _Factorial factorial = new FactWhile(num);
        factorial.print();
    }
}
