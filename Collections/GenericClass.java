public class GenericClass {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("Hello");

        b.print(b);
    }
}

class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    static <T> void print(T value) {
        System.out.println(value);
    }
}