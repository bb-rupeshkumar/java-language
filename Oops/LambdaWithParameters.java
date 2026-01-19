interface Calculator {
    int add(int a, int b);
}

public class LambdaWithParameters {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;
        System.out.println(c.add(2, 3));
    }
}

/*
    Interface	Method

    Runnable	run()
    Consumer<T>	accept(T)
    Supplier<T>	get()
    Function<T,R>	apply(T)
    Predicate<T>	test(T)

    Example:

    Consumer<String> printer = s -> System.out.println(s);
    printer.accept("Hello");

 */