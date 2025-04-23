

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 3.0);
        double aera = circle.calculateArea();
        System.out.println("Area: "+ aera);
        circle.display();
    }
}

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();
void display() {
        System.out.println("This is a shape with color: " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

