package Shapes;

public class Rectangle implements Shape {

    double length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String getShapeType() {
        if (isSquare()) {
            return "Square";
        }
        return "Rectangle";
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    private boolean isSquare() {
        return length == width;
    }

}
