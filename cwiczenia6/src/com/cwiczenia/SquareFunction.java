package com.cwiczenia;

public class SquareFunction extends Function implements Fun{

    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a == 0){
            throw new IllegalArgumentException("Coefficient a cannot be zero.");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public SquareFunction(double a, double b, double c) {
        super();
        setA(a);
        setB(b);
        setC(c);
    }

    @Override
    public void increaseCoefficientsBy(double delta) {
        a = a + delta;
        b = b + delta;
        c = c + delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta) {
        a = a - delta;
        b = b - delta;
        c = c - delta;
    }

    @Override
    public double f(double x) {
        return a*Math.pow(x,2) + b*x + c;
    }
}
