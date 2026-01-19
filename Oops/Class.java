public class Class {
    public static void main(String[] args) {
//        Car c1 = new Car(); // MEMORY ALLOCATED IN HEAP
//        Car c2 = new Car();
//        c1.color = "Red";
//        c2.color = "Blue";
//
//        c1.speed = 120;
//        c2.speed = 140;
//
//        System.out.println(c1.color);
//        System.out.println(c1.speed);
//        System.out.println(c2.color);
//        System.out.println(c2.speed);

        Car c = new Car("Black", 150);
        System.out.println(c.color);
        System.out.println(c.speed);

        c.accelerate();
        System.out.println(c.speed);
    }
}

class Car {
    String color;
    int speed;

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void accelerate() {
        this.speed *= 2;
    }

    int getSpeed() {
        return this.speed;
    }
}