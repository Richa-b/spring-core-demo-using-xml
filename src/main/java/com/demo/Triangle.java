package com.demo;


import java.util.List;
import java.util.Map;

public class Triangle implements Shape {

    private int height;
    private int altitude;
    private Point point1;
    private Point point2;
    private Point point3;
    private String type;

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int b) {
        System.out.println("setting altitude");
        this.altitude = b;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int a) {
        System.out.println("setting Height");
        this.height = a;
    }

    Triangle(int height, int altitude) {
        System.out.println("inside the constructor");
        this.height = height;
        this.altitude = altitude;
    }

    // Constructor injection Using type
    Triangle(int height, String type) {
        System.out.println("inside the constructor");
        this.height = height;
        this.type = type;
    }


    Triangle(Point point1) {
        System.out.println("inside the constructor:: populating point1");
        this.point1 = point1;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        System.out.println("inside Setter Point1");
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }


    Triangle() {

    }

    // For List Demo
    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        System.out.println("setting point list");
        this.pointList = pointList;
    }

    List<Point> pointList;


    // For Map Demo
   /* public Map<String, Point> getPointMap() {
        return pointMap;
    }

    public void setPointMap(Map<String, Point> pointMap) {
        this.pointMap = pointMap;
    }

    Map<String , Point> pointMap;*/


    public void drawShape() {
        System.out.println("Drawing triangle");
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "Height =" + height + ",altitude=" + altitude + ",Point1=(" + point1 + ") Point2=(" + point2 + ") Point3=(" + point3 + ")";
    }
}


