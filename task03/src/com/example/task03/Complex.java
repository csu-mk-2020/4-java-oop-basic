package com.example.task03;

import java.util.Objects;
public class Complex {

    double re;
    double im;

    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    Complex sum(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        return new Complex(this.re + rhs.re, this.im + rhs.im);
    }

    Complex mult(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        return new Complex(
                this.re * rhs.re - this.im * rhs.im,
                this.im * rhs.re + this.re * rhs.im);
    }

    public String toString() {
        return String.format("%f %fi", this.re, this.im);
    }
}