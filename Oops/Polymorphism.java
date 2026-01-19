public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog Constructor");
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }
}