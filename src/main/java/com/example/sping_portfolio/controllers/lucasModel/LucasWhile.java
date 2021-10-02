package com.example.sping_portfolio.controllers.lucasModel;

public class LucasWhile extends _Lucas {
    public LucasWhile(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        super.name = "While";
        long limit = super.size;
        long[] f = new long[]{2, 1};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[0] + f[1]};
        }
    }

    public static void main(String[] args) {
        int num = 20;   //number of Lucas, 92 is max for long
        _Lucas lucas = new LucasWhile(num);
        lucas.print();
    }
}
