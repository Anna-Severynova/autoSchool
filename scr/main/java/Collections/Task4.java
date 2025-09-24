//Task 4. Display the list of keys
//        1) There is a collection of HashMap<String, String>, there are 10 different strings.
//        2) Display the list of keys, each element with a new line.

package Collections;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {

        Map<String, String> mapStr = new HashMap<>();

        mapStr.put("lime", "yellow");
        mapStr.put("tomato", "red");
        mapStr.put("apple", "green");
        mapStr.put("potato", "brown");
        mapStr.put("onion", "white");
        mapStr.put("mango", "orange");
        mapStr.put("orange", "orange");
        mapStr.put("grape", "violet");
        mapStr.put("pepper", "red");
        mapStr.put("cherry", "burgundy");

        for (Map.Entry<String, String> str : mapStr.entrySet()) {
            String keys = str.getKey();
            System.out.println(keys);
        }
    }
}