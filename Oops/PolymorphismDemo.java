// Base class
abstract class Animal {
    // common behavior
    abstract void eat();
}

// Child class 1
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog eats bones");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }
}

// Main class
public class PolymorphismDemo {

    // Polymorphic method
    static void makeEat(Animal a) {
        a.eat();  // runtime polymorphism
    }

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        makeEat(dog);  // Dog's eat() is called
        makeEat(cat);  // Cat's eat() is called

        // OR directly:
        makeEat(new Dog());
        makeEat(new Cat());
    }
}
