package com.cwiczenia;

public abstract class Function implements Fun{
    public Function() {
    }

    public abstract void increaseCoefficientsBy(double delta);
    public abstract void decreaseCoefficientsBy(double delta);

}
