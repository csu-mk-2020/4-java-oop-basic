package com.example.task05;

import java.util.Objects;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private double _x;
    private double _y;

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public Point(double x, double y) {
        _x = x;
        _y = y;
    }

    public Point(Point p) throws NullPointerException {
        Objects.requireNonNull(p);
        _x = p._x;
        _y = p._y;
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        return _x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        return _y;
    }

    /**
     * Устанавливает координату точки по оси абсцисс
     *
     * @param x координата точки по оси X
     */
    public void setX(double x) {
        _x = x;
    }

    /**
     * Устанавливает координату точки по оси ординат
     *
     * @param y координата точки по оси Y
     */
    public void setY(double y) {
        _y = y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        Objects.requireNonNull(point);
        double dx = Math.abs(this._x - point._x);
        double dy = Math.abs(this._y - point._y);

        return Math.hypot(dx, dy);
    }

}
