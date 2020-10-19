package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex z1 = new Complex(2, -3);
        Complex z2 = new Complex(-3, 5);

        Complex z3 = z2.add(z1);
        z3.print();
        Complex z4 = z3.mult(z2);
        z4.print();
    }
}
