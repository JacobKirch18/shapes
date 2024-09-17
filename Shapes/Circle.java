package Shapes;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeType() {
        return "Circle";
    }

    public double getPerimeter() { // (circumference)
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
