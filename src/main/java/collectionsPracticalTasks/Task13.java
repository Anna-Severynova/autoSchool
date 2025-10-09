//Task 13.
//        1) Create a set of numbers (Set<Integer>), put 20 different numbers in it.
//        2) Remove all numbers greater than 10 from the set.

package collectionsPracticalTasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task13 {
    public static void main(String[] args) {

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
        intSet.add(13);
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(19);
        intSet.add(20);

        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 10) {
                iterator.remove();
            }
        }

        for (int num: intSet){
            System.out.println(num);
        }
    }
}
