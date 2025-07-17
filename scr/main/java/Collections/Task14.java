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
        map.put("Lisenko", "Oksana");

        String name = "Anna";
        int count = 0;
        for (Map.Entry<String, String> i : map.entrySet()) {
            if (i.getValue() == name) {
                count++;
            }
        }
        System.out.println(count);
//        int count = 0;
//        String[] values = map.values().toArray(new String[0]);
//        for (int i = 0; i < values.length; i++) {
//            for (int j = i + 1; j < values.length; j++) {
//                if (values[i].equals(values[j])) {
//                    count++;
//                }
//            }
//        }
//        System.out.println("The number people with same name: " + count);
    }
}