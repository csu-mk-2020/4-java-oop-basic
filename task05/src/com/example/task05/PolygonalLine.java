package com.example.task05;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    private final ArrayList<Point> Line = new ArrayList<>();

    public void setPoints(Point[] points) {
        // TODO: реализовать
        Objects.requireNonNull(points);
        for (Point p1: points) {
            Line.add(new Point(p1));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        Objects.requireNonNull(point);
        Line.add(new Point(point));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Line.add(new Point(x, y));
        // TODO: реализовать
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double res = 0;
        for (int i = 1; i < this.Line.toArray().length; i++) {
            res += this.Line.get(i).getLength(this.Line.get(i - 1));
        }
        // TODO: реализовать
        return res;
    }

}
