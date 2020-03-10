package com.student.model;

public class Rectangular implements IArea{
    private int length;
    private int width;
    public Rectangular(int l, int w){
        length = l;
        width = w;
    }
    public double getArea(){
        return length * width;
    }
}
