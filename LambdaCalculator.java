interface Calculator {
    int calculate(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        Calculator add = (a,b) -> a + b;
        Calculator sub = (a,b) -> a - b;
        Calculator mul = (a,b) -> a * b;
        Calculator div = (a,b) -> a / b;

        System.out.println("Add: " + add.calculate(10, 20));
        System.out.println("Subtract: " + sub.calculate(20, 10));
        System.out.println("Multiply: " + mul.calculate(20, 10));
        System.out.println("Divide: " + div.calculate(20, 10));
    }
}