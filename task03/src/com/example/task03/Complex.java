package com.example.task03;
import java.util.Objects;

/**
 * Класс комплексных чисел
 */
public class Complex {
    private double Im;
    private double Re;

    public Complex(double Re, double Im){
        this.Im = Im;
        this.Re = Re;
    }

    public double getIm() {
        return Im;
    }

    public double getRe() {
        return Re;
    }

    public void setIm(double im) {
        Im = im;
    }

    public void setRe(double re) {
        Re = re;
    }

    /**
     * Операция сложения двух комплексных чисел
     * @param rhs - второй операнд сложения
     * @return результат сложения
     */
    public Complex add(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs, "Exception : rhs is null!");

        return new Complex(this.Re + rhs.Re, this.Im + rhs.Im);
    }

    /**
     * Операция вычитания двух комплексных чисел
     * @param rhs - второй операнд вычитания
     * @return результат вычитания
     */
    public Complex sub(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs, "Exception : rhs is null!");

        return new Complex(this.Re - rhs.Re, this.Im - rhs.Im);
    }

    /**
     * Операция умножения двух комплексных чисел
     * @param rhs - второй операнд умножения
     * @return - результат умножения
     */
    public Complex mult(Complex rhs) throws NullPointerException {
        Objects.requireNonNull(rhs, "Exception : rhs is null!");

        return new Complex(this.Re * rhs.Re - this.Im * rhs.Im, this.Im * rhs.Re + this.Re * rhs.Im);
    }

    @Override
    public String toString() {
        return new String(Im+"+"+"(" + Re + ")i");
    }

    public void print(){
        System.out.println(this.toString());
    }

}
