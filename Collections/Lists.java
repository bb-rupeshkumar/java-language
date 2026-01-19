import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        System.out.println(list);
        System.out.println(list.get(0));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(String s: list) {
            System.out.println(s);
        }
    }
}