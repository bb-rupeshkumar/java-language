import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",10);
        map.put("banana", 20);

        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " " + value);
        }

        System.out.println(map.get("apple"));
    }
}