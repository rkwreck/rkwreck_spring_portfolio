package com.example.sping_portfolio.controllers.arithmeticModel;

import com.example.sping_portfolio.controllers.arithmeticModel._Arithmetic;

public class ArithWhile extends _Arithmetic {
    public ArithWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";
        long limit = super.size;
        long[] f = new long[]{1, 5};
       //int count = 5;
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[1] + 4};
            //count ++;
        }
    }

    public static void main(String[] args) {
        int num = 20;   //number of terms, 92 is max for long
        _Arithmetic arithmetic = new com.example.sping_portfolio.controllers.arithmeticModel.ArithWhile(num);
        arithmetic.print();
    }
}
