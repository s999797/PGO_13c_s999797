package com.cwiczenia;

public class AbsoluteLinearFunction extends LinearFunction implements Fun{

    public AbsoluteLinearFunction(double a, double b) {
        super(a, b);
    }

    @Override
    public void increaseCoefficientsBy(double delta) {
        super.increaseCoefficientsBy(delta);
    }

    @Override
    public void decreaseCoefficientsBy(double delta) {
        super.decreaseCoefficientsBy(delta);
    }

    @Override
    public double f(double x) {
        return Math.abs(super.f(x));
    }
}
