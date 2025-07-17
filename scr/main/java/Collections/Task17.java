package Collections;

import java.util.HashMap;
import java.util.Map;

public class Task17 {
    public static void main(String[] args) {

        Map<String, String> mapOfNames = new HashMap<>();

        mapOfNames.put("Osipenko", "Maksim");
        mapOfNames.put("Potapova", "Olena");
        mapOfNames.put("Shubina", "Ekaterina");
        mapOfNames.put("Tavridow", "Pavel");
        mapOfNames.put("Klimenko", "Olexander");
        mapOfNames.put("Fedorov", "Fedor");
        mapOfNames.put("Fedorov", "Petro");
        mapOfNames.put("Petrov", "Petro");
        mapOfNames.put("Vasilenko", "Olena");
        mapOfNames.put("Vasilenko", "Pavel");

        for (Map.Entry<String, String> i : mapOfNames.entrySet()) {
            String key = i.getKey();
            String value = i.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
