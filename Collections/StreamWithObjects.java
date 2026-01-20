import java.util.*;
import java.util.stream.*;

public class StreamWithObjects {
    public static void main(String[] args) {
        List<Employee> emp = List.of(
                new Employee("A", 300000),
                new Employee("B", 500000),
                new Employee("C", 800000)
        );

        emp.stream().filter(e -> e.salary >= 500000).map(e -> e.name).forEach(System.out::println);
    }
}

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}