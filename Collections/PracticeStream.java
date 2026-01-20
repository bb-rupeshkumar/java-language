import java.util.*;
import java.util.stream.*;

public class PracticeStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        list.stream().map(n -> n*n).forEach(System.out::println);
    }
}