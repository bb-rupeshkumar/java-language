@FunctionalInterface
interface Task {
    void run();
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
//        Tast t = new Task() {
//            public void run() {
//                System.out.println("Running");
//            }
//        }

        Task t = () -> System.out.println("Running");
        t.run();
    }
}