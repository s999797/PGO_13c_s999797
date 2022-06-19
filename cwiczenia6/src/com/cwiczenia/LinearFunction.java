package com.cwiczenia;

public class LinearFunction extends Function implements Fun{

    private double a;
    private double b;

    public LinearFunction(double a, double b) {
        super();
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void increaseCoefficientsBy(double delta) {
        a = a + delta;
        b = b + delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta) {
        a = a - delta;
        b = b - delta;
    }

    @Override
    public double f(double x) {
        return a*x + b;
    }
}
