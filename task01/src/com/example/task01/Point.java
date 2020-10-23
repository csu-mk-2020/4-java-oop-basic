package com.example.task01;


import java.util.Objects;
/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;


    /**
     * @param x - координата точки по оси X
     * @param y - координата точки по оси Y
     */
   public Point(int x, int y){
        this.x = x;
        this.y = y;
   }

    /**
     * Разворот точки на 180 градусов
     */
    public void flip(){
        int tmp = -this.y;
        this.y = -this.x;
        this.x = tmp;
    }

    /**
     * Расчет дистанции между двумя точками
     * @param point - точка до которой рассчитывается расстояние
     * @return расстояние
     */
    public double distance(Point point) throws NullPointerException {
        Objects.requireNonNull(point, "Second point is null!\n");
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    /**
     * Представление точки в строковом формате
     *
     * @return строка с координатами
     */
    public String toString(){
        return String.format("Point: (%d, %d)", this.x, this.y);
    }

    /**
     * Вывод координат точки
     */
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
