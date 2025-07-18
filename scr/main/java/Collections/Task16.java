package Collections;

import java.util.*;

public class Task16 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Osipenko", "Maksim");
        map.put("Potapova", "Olena"); // should be deleted
        map.put("Shubina", "Ekaterina");
        map.put("Tavridow", "Pavel");
        map.put("Klimenko", "Olexander");
        map.put("Fedorov", "Fedor");
        map.put("Fedorov", "Petro"); // should be deleted
        map.put("Petrov", "Petro"); // should be deleted
        map.put("Vasilenko", "Olena"); // should be deleted
        map.put("Vasilenko", "Anastasiya");

        Map<String, String> nonDupMap = new HashMap<>(); // мапа которая будет хранить только уникальные велью

        for (Map.Entry<String, String> maps : map.entrySet()) {
            String key = maps.getKey();
            String value = maps.getValue();
            if (!nonDupMap.containsValue(value)) {
                nonDupMap.put(key, value);
            }
        }
        for (Map.Entry<String, String> maps : nonDupMap.entrySet()) {
            String key = maps.getKey();
            String value = maps.getValue();
            System.out.println("Unique pair: " + key + " - " + value);
        }
    }
}