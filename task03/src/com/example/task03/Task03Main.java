package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(1,2);
        Complex b = new Complex(10, -5);
        System.out.printf("a = %s%n", a);
        System.out.printf("b = %s%n", b);
        System.out.printf("a + b = %s%n", a.add(b));
        System.out.printf("a * b = %s%n", a.multiple(b));
    }
}
