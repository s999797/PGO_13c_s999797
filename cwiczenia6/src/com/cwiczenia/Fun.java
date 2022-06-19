package com.cwiczenia;

public interface Fun {

    double f(double x);

    static double minimum (Fun func, double a, double b, double alpha){
        if (a >= b){
            throw new IllegalArgumentException("The a have to be smaller than b.");
        }
        double min = func.f(a);
        int n = 1;
        for (double i = a; i <= b; i += alpha) {
            if(func.f(a + n*alpha) < min){
                min = func.f(a + n*alpha);
            }
            n++;
        }

        return min;
    }
}
