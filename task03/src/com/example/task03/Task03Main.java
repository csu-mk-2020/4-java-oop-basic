package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumbers num1 = new ComplexNumbers(0, 1.1);
        ComplexNumbers num2 = new ComplexNumbers(1.5, -2);
        System.out.println(num1.add(num2).toString());
        System.out.println(num1.mult(num2).toString());
    }
}
