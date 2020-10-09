package com.example.task03;

/**
 * Класс комплексных чисел
 */
public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public static Complex sum(Complex val1, Complex val2) {
        if (val1 == null) {
            throw new IllegalArgumentException("первый аргумент пуст");
        }
        if (val2 == null){
            throw new IllegalArgumentException("второй аргумент пуст");
        }
        return new Complex(val2.getRe() + val1.getRe(), val2.getIm() + val1.getIm());
    }

    public static Complex multiply(Complex val1, Complex val2) {
        if (val1 == null) {
            throw new IllegalArgumentException("первый аргумент пуст");
        }
        if (val2 == null){
            throw new IllegalArgumentException("второй аргумент пуст");
        }
        return new Complex(val1.getRe() * val2.getRe() - val1.getIm() * val2.getIm(), val1.getRe() * val2.getIm() + val1.getIm() * val2.getRe());
    }

    public String toString() {
        return String.format("%.2f+%.2fi", re, im);
    }
}
