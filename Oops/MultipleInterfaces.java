interface A {
    void a();
}

interface B {
    void b();
}

interface Logger {
    default void log(String msg) {
        System.out.println(msg);
    }
}

class C implements A,B {
    @Override
    public void a() {}
    @Override
    public void b() {}
}

public class MultipleInterfaces {
    public static void main(String[] args) {

    }
}