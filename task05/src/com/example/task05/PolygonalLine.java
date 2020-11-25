package com.example.task05;
import java.util.ArrayList;
import java.util.Objects;

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
    public void setPoints(Point[] points) throws NullPointerException{
        // TODO: реализовать
        Objects.requireNonNull(points);
        for (Point point: points) {
            Objects.requireNonNull(point);
        }
        this.points.clear();
        for (Point point : points) {
            this.points.add(new Point(point));
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
        this.points.add(new Point(point));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        /*
        // TODO: реализовать
        throw new AssertionError();
        */
        double length = 0d;
        for (int i = 0; i < this.points.size() - 1; i++) {
            length += this.points.get(i).getLength(this.points.get(i + 1));
        }
        return length;
    }

}
