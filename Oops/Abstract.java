public class Abstract {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.area());
    }
}

abstract class Shape {
    abstract double area();

    void print() {
        System.out.println("Shape print");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}