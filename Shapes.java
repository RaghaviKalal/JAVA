class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {
    void circleArea() {
        double radius = 5;
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    void rectangleArea() {
        double length = 10;
        double width = 5;
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.circleArea();
        r.rectangleArea();
    }
}