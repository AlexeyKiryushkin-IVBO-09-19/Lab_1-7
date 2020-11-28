package Lab_4;

import static java.lang.Math.PI;

public class Circle extends Shape {
    protected double radius;

    public Circle() {}
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }
    @Override
    public String toString() {
        return "Radius = " + radius;
    }
}
