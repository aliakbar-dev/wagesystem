package org.example;

public class WageTypeFactory {

    public static WageType getWageType(int wtByUser) {
        if (wtByUser == 1)
            return new WageType1();
        else if (wtByUser == 2)
            return new WageType2();
        else if (wtByUser == 3)
            return new WageType3();
        return new WageType4();
    }

}
