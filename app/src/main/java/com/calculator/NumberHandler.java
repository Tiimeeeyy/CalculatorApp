package com.calculator;

public class NumberHandler {
    String currentNumber;
    String previousNumber;
    private Calculator calculator;
    private Calculator.currentOperation currentOperation;

    public NumberHandler(Calculator calculator) {
        this.calculator = calculator;
    }

    public void handleNumber(String number) {
        currentNumber += number;
    }

    public double parseArgument(String a) {
        try {
            return Double.parseDouble(a);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    public void handleEquals() {
        double result;
        double a = parseArgument(previousNumber);
        double b = parseArgument(currentNumber);

        switch (currentOperation) {
            case addition:
                result = calculator.addition(a, b);
                break;
            case subtraction:
                result = calculator.subtract(a, b);
                break;
            case division:
                result = calculator.division(a, b);
                break;
            case multiplication:
                result = calculator.multiplication(a, b);
                break;
        }
        currentNumber = "";
        previousNumber = "";
        currentOperation = null;
    }

    public void handleClear() {
        currentOperation = null;
        currentNumber = "";
        previousNumber = "";
    }
}
