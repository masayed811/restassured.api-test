package com.student.model;

public class Square implements IArea {
    private int length;
    public Square(int l){
        length = l;
    }
    public double getArea(){
        return length * length;
    }
}

