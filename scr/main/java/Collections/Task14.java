package Collections;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Severynova", "Anna");
        map.put("Onishenko", "Stanislav");
        map.put("Strelets", "Anna");
        map.put("Ivanov", "Stanislav");
        map.put("Yakovenko", "Pavel");
        map.put("Osipov", "Pavel");
        map.put("Lozova", "Anna");
        map.put("Lozova", "Oksana");

        String name = "Anna";
        int count = 0;
        for (Map.Entry<String, String> i : map.entrySet()) {
            if (i.getValue() == name || i.getKey() == name) {
                count++;
            }
        }
        System.out.println("The number people with the same first or last name: " + count);
    }
}