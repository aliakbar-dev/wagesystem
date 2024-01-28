package org.example;

public class WageType1 implements WageType {
    @Override
    public double calculate(double amount) {
        return amount * 0.1;
    }
}
