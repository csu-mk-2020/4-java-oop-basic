package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(13, 42);
        ComplexNumber c2 = new ComplexNumber(-5, 21);
        System.out.println(c1.add(c2).toString());
        System.out.println(c1.mult(c2).toString());
    }
}
