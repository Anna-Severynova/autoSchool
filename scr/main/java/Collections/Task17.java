//Task 17.
//        1) Create a Map dictionary (<String, String>) and add 10 people to it in the form "LastName"-"FirstName".
//        2) Let there be people with the same first name among these 10 people.
//        3) Let there be people with the same last names among these 10 people. Note the number of entries in the resulting collection.
//        4) Display the contents of the Map on the screen.

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

        for (Map.Entry<String, String> keyAndValues : mapOfNames.entrySet()) {
            String key = keyAndValues.getKey();
            String value = keyAndValues.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
