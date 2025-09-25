//Task 16.
//        1) Create a dictionary (Map<String, String>) and enter ten entries in it according to the principle "last name" - "first name".
//        2) Delete people who have the same names.

package collectionsPracticalTasks;

import java.util.*;

public class Task16 {
    public static void main(String[] args) {

        Map<String, String> people = new HashMap<>();

        people.put("Osipenko", "Maksim");
        people.put("Potapova", "Olena"); // should be deleted
        people.put("Shubina", "Olena"); // should be deleted
        people.put("Tavridow", "Pavel");
        people.put("Klimenko", "Olexander");
        people.put("Fedorovq", "Fedor");
        people.put("Fedorov", "Petro"); // should be deleted
        people.put("Petrov", "Petro"); // should be deleted
        people.put("Vasilenko", "Olena"); // should be deleted
        people.put("Vasilenko1", "Anastasiya");

        System.out.println(" ");
        System.out.println("Before delete:");

        for (Map.Entry<String, String> i : people.entrySet()) {
            String lastName = i.getKey();
            String firstName = i.getValue();
            System.out.println(lastName + ": " + firstName);
        }

        System.out.println(" ");
        System.out.println("Count the same names:");

        // map for counting the same names
        Map<String, Integer> countNames = new HashMap<>(); // create new map -- key:first name and value:counterl
        for (Map.Entry<String, String> i : people.entrySet()) {
            String firstName = i.getValue();
            Integer count = countNames.get(firstName); // counter for repetitions

            if (count == null) {
                firstName = i.getValue();
                count = 1;
                countNames.put(firstName, count);
            } else { // if the name was repeated (count != null)
                count++;
                countNames.put(firstName, count);
            }
        }
        System.out.println(countNames);
        System.out.println(" ");
        System.out.println("Finish result:");

        // iterator for removing the strings with the same names
        Iterator<Map.Entry<String, String>> iterator = people.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> mapWithoutDuplicate = iterator.next();
            String firstName = mapWithoutDuplicate.getValue();
            Integer count = countNames.get(firstName); // get the value (Integer count, from countNames map) by key (firstName с той же мапы)

            if (count > 1) {
                iterator.remove();
            } else {
                String lastName = mapWithoutDuplicate.getKey();
                String firstName1 = mapWithoutDuplicate.getValue();
                System.out.println(lastName + " " + firstName1);
            }
        }
    }
}