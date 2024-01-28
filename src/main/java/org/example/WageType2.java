package org.example;

public class WageType2 implements WageType {
    @Override
    public double calculate(double amount) {
        return amount * 0.5;
    }
}
