package CalculatorFields;

public class Addition extends CalculatorFields {
    public Addition(){}
    public double getAddition(){
        return getFn() + getSn();
    }
    public double getResultOfAddition(){
        System.out.printf("Result = %.4f", getAddition());
        return 0;
    }
}
