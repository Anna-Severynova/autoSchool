package Collections;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 strings: ");

        Deque<String> tenStrings = new LinkedList<>();

        for (int i = 0; i < 10; i++){
            tenStrings.addFirst(sc.nextLine());
        }

        for(String str: tenStrings){
            System.out.println(str);
        }
    }
}