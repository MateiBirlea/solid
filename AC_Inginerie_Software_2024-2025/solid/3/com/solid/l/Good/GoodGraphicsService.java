package com.solid.l.Good;

public class GoodGraphicsService {
    public void checkForArea(Shape shape) {
        int area = shape.getArea();
        System.out.println("The area of this " + shape.getClass().getSimpleName() + " is: " + area);
    }
}
