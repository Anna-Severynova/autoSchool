//Task 15.
//        1) Create a dictionary (Map<String, LocalDate>) and enter ten entries into it according to the principle: "last name" - "date of birth".
//        2) Remove all people born in summer from the dictionary.

package Collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task15 {
    public static void main (String[] args){
        Map<String, LocalDate> map = new HashMap<>();
            map.put("Anna", LocalDate.parse("1996-07-25")); // del
            map.put("Olena", LocalDate.parse("1996-01-25"));
            map.put("Stanislav", LocalDate.parse("1996-06-25")); // del
            map.put("Peter", LocalDate.parse("1996-08-25")); // del
            map.put("David", LocalDate.parse("1996-03-25"));

            System.out.println("Before delete:");
            for(Map.Entry<String, LocalDate> i: map.entrySet()){
                String name = i.getKey();
                LocalDate date = i.getValue();
                System.out.println(name+": "+date);
            }

        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            LocalDate date = iterator.next().getValue();
            if (date.getMonthValue() == 6 || date.getMonthValue() == 7 || date.getMonthValue() == 8) {
                iterator.remove();
            }
        }

        System.out.println(" ");
        System.out.println("After delete:");
        for (Map.Entry<String, LocalDate> i: map.entrySet()){
            String name = i.getKey();
            LocalDate date = i.getValue();
            System.out.println(name+": "+date);
        }
    }
}
