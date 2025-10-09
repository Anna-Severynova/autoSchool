//Task 1.  HashSet from plants
//        1) Create a HashSet collection with element type String.
//        2) Add 10 strings to it: watermelon, banana, cherry, pear, melon, blackberry, shen-hen, strawberry, iris, potato.
//        3) Display the contents of the collection on the screen, each item on a new line.
//        4) See how the order of the added items has changed.

package collectionsPracticalTasks;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        Set<String> setFruit = new HashSet<>();

        setFruit.add("watermelon");
        setFruit.add("banana");
        setFruit.add("cherry");
        setFruit.add("pear");
        setFruit.add("melon");
        setFruit.add("blackberry");
        setFruit.add("shen-hen");
        setFruit.add("strawberry");
        setFruit.add("iris");
        setFruit.add("potato");

        for (String fruit : setFruit) {
            System.out.println(fruit);
        }
    }
}