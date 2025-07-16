package Collections;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("Test", 1);
        map.put("Test2", "java");
        map.put("Test3", 2.987);
        map.put("Test4", true);
        map.put("Test5", " ");
        map.put("Test6", 154789);
        map.put("Test7", false);
        map.put("Tes8", null);
        map.put("Test9", "test");
        map.put("Test10", 0);

        for (Map.Entry<String, Object> maps : map.entrySet()) {
            String keys = maps.getKey();
            Object values = maps.getValue();
            System.out.println(keys + " - " + values);
        }
    }
}
