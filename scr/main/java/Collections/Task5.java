package Collections;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("lime", "yellow");
        map.put("tomato", "red");
        map.put("apple", "green");
        map.put("potato", "brown");
        map.put("onion", "white");
        map.put("mango", "orange");
        map.put("orange", "orange");
        map.put("grape", "violet");
        map.put("pepper", "red");
        map.put("cherry", "burgundy");

        for (Map.Entry<String, String> maps : map.entrySet()) {
            String values = maps.getValue();
            System.out.println(values);
        }
    }
}