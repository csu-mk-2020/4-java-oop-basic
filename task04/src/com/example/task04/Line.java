package com.example.task04;

import java.util.Objects;

public class Line {
    private final Point _p1;
    private final Point _p2;
    public Line(Point p1, Point p2) throws NullPointerException {
        _p1 = Objects.requireNonNull(p1);
        _p2 = Objects.requireNonNull(p2);
    }

    public Point getP1() {
        return _p1;
    }

    public Point getP2() {
        return _p2;
    }

    public boolean isCollinearLine(Point p) throws NullPointerException {
        Objects.requireNonNull(p);
        return (p.x * (_p2.y - _p1.y) - p.y * (_p2.x - _p1.x) == _p1.x * (_p2.y - _p2.x) * _p1.y);
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", _p1, _p2);
    }
}
