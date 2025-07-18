package Collections;

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