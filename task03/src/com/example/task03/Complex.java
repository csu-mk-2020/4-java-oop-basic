package com.example.task03;

import java.util.Objects;

public class Complex {

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        return new Complex(this.re + rhs.re, this.im + rhs.im);
    }

    public Complex sub(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        return new Complex(this.re - rhs.re, this.im - rhs.im);
    }

    public Complex mult(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs);
        return new Complex(
                this.re * rhs.re - this.im * rhs.im,
                this.im * rhs.re + this.re * rhs.im);
    }

    public String toString() {
        return String.format("%g %+gi", this.re, this.im);
    }
}