package com.demo;


public class Point {

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    private int x;
    private int y;

    private int z;

    Point(int x) {
        System.out.println("constructor");
        this.x = x;
    }

    Point() {

    }

    @Override
    public String toString() {
        return "x =" + x + ",y=" + y + "z=" + z;
    }
}
