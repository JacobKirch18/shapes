package Shapes;

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getShapeType());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Shape square = new Rectangle(5, 5);
        System.out.println(square.getShapeType());
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

        Shape circle = new Circle(5);
        System.out.println(circle.getShapeType());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }

}
