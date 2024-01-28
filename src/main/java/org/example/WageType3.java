package org.example;

public class WageType3 implements WageType{
    @Override
    public double calculate(double amount) {
        return amount * 0.8;
    }
}
