package task3;

import task3.Shape;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}