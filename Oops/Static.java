public class Static {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter  counter2 = new Counter();

        System.out.println(counter.count);
        System.out.println(counter2.count);
        System.out.println(counter.count);

        counter.sayHello();
    }
}



class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void sayHello() {
        System.out.println("Hello World");
    }
}