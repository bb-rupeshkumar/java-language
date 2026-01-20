import java.util.*;

public class EqualsHashcode {
    public static void main(String[] args) {

        Person p1 = new Person("Ram");
        Person p2 = new Person("Ram");

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println(set.size());
    }
}

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}