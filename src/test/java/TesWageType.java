import org.example.CalculateWageType;
import org.junit.Assert;
import org.junit.Test;

public class TesWageType {

    @Test
    public void tesWageType1() {
        final double amount = 100;
        CalculateWageType calculateWageType = new CalculateWageType();
        final double wage = calculateWageType.calculateWageType(amount, 1);
        Assert.assertEquals(10, wage, 0.0);
    }

    @Test
    public void tesWageType2() {
        final double amount = 100;
        CalculateWageType calculateWageType = new CalculateWageType();
        final double wage = calculateWageType.calculateWageType(amount, 2);
        Assert.assertEquals(50, wage, 0.0);
    }

    @Test
    public void tesWageType3() {
        final double amount = 100;
        CalculateWageType calculateWageType = new CalculateWageType();
        final double wage = calculateWageType.calculateWageType(amount, 3);
        Assert.assertEquals(80, wage, 0.0);
    }

}
