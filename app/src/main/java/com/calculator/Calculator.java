package com.calculator;

public class Calculator {
    String currentNumber;
    String previousNumber;
    enum currentOperation {
        addition,
        subtraction,
        multiplication,
        division,
    }

    public double subtract (double a, double b) {
        if (a == b){return 0;}
        return a-b;
    }

    public double addition (double a, double b) {
        return a+b;
    }

    public double multiplication (double a, double b) {
        return a*b;
    }

    public double division (double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
