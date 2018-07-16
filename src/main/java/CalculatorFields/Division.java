package CalculatorFields;

public class Division extends CalculatorFields {
    public Division(){
    }
    public double getDivision() {
        return getFn() / getSn();
    }
    public double getResultOfDivision(){
        System.out.printf("Result = %.4f", getDivision());
        return 0;
    }
}
