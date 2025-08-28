package com.example.calculator;

public class Calculator {
    private final MathOperations mathOps;
    
    public Calculator() {
        this.mathOps = new MathOperations();
    }
    
    public Calculator(MathOperations mathOps) {
        this.mathOps = mathOps;
    }
    
    public int performAddition(int a, int b) {
        return mathOps.add(a, b);
    }
    
    public int performSubtraction(int a, int b) {
        return mathOps.subtract(a, b);
    }
    
    public int performMultiplication(int a, int b) {
        return mathOps.multiply(a, b);
    }
    
    public double performDivision(int a, int b) {
        return mathOps.divide(a, b);
    }
    
    public String checkNumberType(int number) {
        if (mathOps.isEven(number)) {
            return mathOps.isPrime(number) ? "Even Prime" : "Even";
        } else {
            return mathOps.isPrime(number) ? "Odd Prime" : "Odd";
        }
    }
}