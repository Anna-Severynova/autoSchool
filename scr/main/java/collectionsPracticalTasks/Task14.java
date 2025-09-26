//Task 14.
//        1) Create a dictionary (Map<String, String>) with ten entries according to the principle "Last Name" - "First Name".
//        2) Check how many people have the same first or last name as the given one.

package collectionsPracticalTasks;

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

        String name = "Lozova";
        int count = 0;
        for (Map.Entry<String, String> i : map.entrySet()) {
            if (i.getValue() == name || i.getKey() == name) {
                count++;
            }
        }
        System.out.println("The number people with the same first or last name: " + count);
    }
}