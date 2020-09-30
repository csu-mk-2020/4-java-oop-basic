package com.example.task03;

import java.util.Objects;

public class Complex {
    public double re;
    public double im;

    public Complex() {
        this(0,0);
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        return new Complex(re + rhs.re, im + rhs.im);
    }

    public Complex multiple(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        Complex product = new Complex();
        product.re = this.re * rhs.re - this.im * rhs.im;
        product.im = this.im * rhs.re + this.re * rhs.im;
        return product;
    }

    @Override
    public String toString() {
        char sign = im >= 0 ? '+' : '\0';
        return String.format("%g%c%gi", re, sign, im);
    }
}
