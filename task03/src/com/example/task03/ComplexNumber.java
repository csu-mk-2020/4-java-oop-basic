package com.example.task03;

import java.util.Objects;

public class ComplexNumber {
    double re;
    double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber add(ComplexNumber rhs) {
        Objects.requireNonNull(rhs);
        return new ComplexNumber(this.re + rhs.re, this.im + rhs.im);
    }

    public ComplexNumber sub(ComplexNumber rhs) {
        Objects.requireNonNull(rhs);
        return new ComplexNumber(this.re - rhs.re, this.im - rhs.im);
    }

    public ComplexNumber mult(ComplexNumber rhs) {
        Objects.requireNonNull(rhs);
        return new ComplexNumber(this.re * rhs.re - this.im * rhs.im, this.im * rhs.re + this.re * rhs.im);
    }

    public String toString() {
        return String.format("%g %+gi", this.re, this.im);
    }
}
