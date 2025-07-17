package Collections;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Deque<String> tenStrings = new LinkedList<>();

        for (int i = 0; i < 10; i++){
            tenStrings.addFirst("str"+i);
        }
        System.out.println(tenStrings);
    }
}