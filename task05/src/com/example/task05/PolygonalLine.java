package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final ArrayList<Point> points = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {

        if (points != null) {
            this.points.clear();
            for (Point p : points) {
                if (p != null) {
                    this.points.add(new Point(p.getX(), p.getY()));
                } else {
                    this.points.clear();
                    throw new IllegalArgumentException("пустой экземпляр внутри ломанной линии");
                }
            }
        } else {
            throw new IllegalArgumentException("аргумент пуст");
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (point != null) {
            points.add(new Point(point.getX(), point.getY()));
        } else throw new IllegalArgumentException("аргумент пуст");
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).getLength(points.get(i + 1));
        }
        return length;
    }

}
