package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> _points = new ArrayList<Point>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) throws NullPointerException {
        Objects.requireNonNull(points);
        for(int i = 0; i < points.length; ++i) {
            addPoint(points[i]);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) throws NullPointerException {
        Objects.requireNonNull(point);
        _points.add(new Point(point));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        _points.add(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for(int i = 0; i < _points.size() - 1; ++i) {
            length += _points.get(i).getLength(_points.get(i + 1));
        }
        return length;
    }

}
