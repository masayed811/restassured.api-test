package com.student.model;

public class Circle implements IArea {
    private int radius;
    public Circle(int r){
        radius = r;
    }

    public double getArea()
    {
        return 3.14 * radius * radius /2;
    }
}
