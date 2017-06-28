package com.demo;


public class Circle implements Shape {

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    Point point;

    @Override
    public void drawShape() {
        System.out.println("Drawing Circle");
    }

    @Override
    public String toString() {
        return "center=(" + point + ")";
    }
}
