package org.example;

public class CalculateWageType {

    public double calculateWageType(double amount, int wtByUser) {
        return WageTypeFactory.getWageType(wtByUser).calculate(amount);

//        if (wageType == 1) {
//            return amount * 0.1;
//        } else if (wageType == 2) {
//            return amount * 0.5;
//        } else if (wageType == 3) {
//            return amount * 0.8;
//        }
//        return 0;
    }

}
