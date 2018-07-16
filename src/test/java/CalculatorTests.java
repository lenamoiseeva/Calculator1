import CalculatorFields.*;
import org.junit.Assert;
import org.junit.Test;


public class CalculatorTests {

    @Test
    public void TestAddition() {
        Addition addition = new Addition();
        addition.setFn(46);
        addition.setSn(9);
        Assert.assertTrue("The result of the addition is incorrect", addition.getAddition() == 55);
    }


    @Test
    public void TestSubtruction() {
        Subtraction subtraction = new Subtraction();
        subtraction.setFn(101);
        subtraction.setSn(22);
        Assert.assertTrue("The result of the subtraction is incorrect", subtraction.getSubtraction() == 79);
    }

    @Test
    public void TestMultiplication() {
        Multiplication multiplication = new Multiplication();
        multiplication.setFn(11);
        multiplication.setSn(33);
        Assert.assertTrue("The result of the multiplication is incorrect", multiplication.getMultiplication() == 363);
    }

    @Test
    public void TestDivision() {
        Division division = new Division();
        division.setFn(25);
        division.setSn(5);
        Assert.assertTrue("The result of the division is incorrect", division.getDivision() == 5);
    }

    @Test(expected = ArithmeticException.class)
    public void TestDivisionByZero() {
        Division division = new Division();
        division.setFn(7);
        division.setSn(0);
        division.getDivision();
        
    }

}