public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

class Animal {
    Animal(String name) {}
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
//    @Override
//    void eat() {
//        System.out.println("Dog eats bones");
//    }

    Dog() {
        super("DOG");
    }

    void eat() {
        super.eat();
        System.out.println("Dog eats bones");
    }
}