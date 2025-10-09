//Task 10. 10 lines to the top of the list
//        1) Create a list of strings in the main method.
//        2) Add 10 lines to it from the keyboard, but only add not to the end of the list, but to the beginning.
//        3) Using a loop, print the contents to the screen, each value on a new line.

package collectionsPracticalTasks;

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