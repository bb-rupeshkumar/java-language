/*

    Stream API (Java 8) is used to process collections of data in a functional, declarative way.

    it lets us:
        Filter data
        Transform data
        Aggregate results

        Without changing the original collection.

 */

import java.util.*;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {
//        OLD WAY (IMPERATIVE)
        List<Integer> list = Arrays.asList(1,2,3,4,5);
//
//        List<Integer> even = new ArrayList<>();
//
//        for(int n : list) {
//            if(n%2==0) {
//                even.add(n);
//            }
//        }

//        STREAM WAY (DECLARATIVE)
        List<Integer> even = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(even);
    }
}