package CalculatorFields;

public class Multiplication extends CalculatorFields {
    public Multiplication(){
    }
    public double getMultiplication() {
        return getFn() * getSn();
    }
    public double getResultOfMultiplication(){
        System.out.printf("Result = %.4f", getMultiplication());
        return 0;
    }
}