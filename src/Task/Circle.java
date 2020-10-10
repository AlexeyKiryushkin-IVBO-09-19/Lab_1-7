package Task;

public class Circle {
    protected double r;
    protected double d;
    protected double length;
    protected double area;
    Circle (double radius) {
        this.r = radius;
        this.d = radius*2;
        this.length = Math.PI*2*radius;
        this.area = Math.PI*radius*radius;
    }
    public void setRadius (double newRadius) {
        this.r = newRadius;
        this.d = newRadius*2;
        this.length = Math.PI*2*newRadius;
        this.area = Math.PI*newRadius*newRadius;
    }
    public void setDiameter (double newDiameter) {
        this.r = newDiameter/2;
        this.d = newDiameter;
        this.length = Math.PI*newDiameter;
        this.area = Math.PI*newDiameter*newDiameter/4;
    }
    public void setLength (double newLength) {
        this.r = newLength/Math.PI/2;
        this.d = newLength/Math.PI;
        this.length = newLength;
        this.area = newLength*newLength/Math.PI/4;
    }
    public void setArea (double newArea) {
        this.r = Math.sqrt(newArea/Math.PI);
        this.d = Math.sqrt(newArea/Math.PI)*2;
        this.length = newArea/Math.sqrt(newArea/Math.PI)*2;
        this.area = newArea;
    }
    public double getRadius() {
        return r;
    }
    public double getDiameter() {
        return d;
    }
    public double getLength() {
        return length;
    }
    public double getArea() {
        return area;
    }
    public void outputAllInfo() {
        System.out.println("Radius = " + r);
        System.out.println("Diameter = " + d);
        System.out.println("Length = " + length);
        System.out.println("Area = " + area);
        System.out.println();
    }
}
