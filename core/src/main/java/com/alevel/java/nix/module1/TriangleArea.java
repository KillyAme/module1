package com.alevel.java.nix.module1;

public class TriangleArea {
    private int xCoordinatePointA;
    private int yCoordinatePointA;
    private int xCoordinatePointB;
    private int yCoordinatePointB;
    private int xCoordinatePointC;
    private int yCoordinatePointC;

    public TriangleArea(int xCoordinatePointA, int yCoordinatePointA,
                        int xCoordinatepointB, int yCoordinatePointB,
                        int xCoordinatepointC, int yCoordinatePointC) {
        this.xCoordinatePointA = xCoordinatePointA;
        this.yCoordinatePointA = yCoordinatePointA;
        this.xCoordinatePointB = xCoordinatepointB;
        this.yCoordinatePointB = yCoordinatePointB;
        this.xCoordinatePointC = xCoordinatepointC;
        this.yCoordinatePointC = yCoordinatePointC;
    }

    public double areaOfTriangle() {
        double result = Math.abs(0.5
                * ((xCoordinatePointA - xCoordinatePointC)
                * (yCoordinatePointB - yCoordinatePointC)
                - (yCoordinatePointA - yCoordinatePointC)
                * (xCoordinatePointB - xCoordinatePointC)));
        return result;
    }

    public static void main(String[] args) {
        TriangleArea triangleArea = new TriangleArea(1, 1, 2, 5, 5, 3);
        System.out.println(triangleArea.areaOfTriangle());
    }
}
