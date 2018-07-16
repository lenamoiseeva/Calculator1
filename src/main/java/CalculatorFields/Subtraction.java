package CalculatorFields;

public class Subtraction extends CalculatorFields {
    public Subtraction() {
    }
    public double getSubtraction() {
        return getFn() - getSn();
    }
    public double getResultOfSubtraction(){
        System.out.printf("Result = %.4f", getSubtraction());
        return 0;
    }
}
