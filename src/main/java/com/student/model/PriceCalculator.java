package com.student.model;

import java.awt.*;

public class PriceCalculator {
    private int unitPrice = 2;

    public double calculatePrice(IArea r) {
        return r.getArea() * unitPrice;
    }
}



