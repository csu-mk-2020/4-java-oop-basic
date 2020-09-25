package com.example.task03;

import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.omg.CORBA.IMP_LIMIT;

public class Complex {
    double Re;
    double Im;

    Complex() {
    }

    Complex(double r) {
        Re = r;
        Im = 0;
    }

    Complex(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }

    public Complex(Complex com) {
        this.Re = com.Re;
        this.Im = com.Im;
    }

    double abs() {
        return Math.sqrt(Re * Re + Im * Im);
    }

    Complex sum(Complex com) {

        return new Complex(this.Re + com.Re, this.Im + com.Im);
    }

    Complex mul(Complex com) {
        return new Complex(this.Re * com.Re - this.Im * com.Im, this.Re * com.Im + this.Im * com.Re);
    }

    public String toString() {

        return String.format("(%f %fi)", this.Re, this.Im);
    }

}
