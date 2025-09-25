//Task 11. Delete the last line and insert it at the beginning
//        1) Create a list of strings.
//        2) Add 5 lines to it from the keyboard.
//        3) Delete the last line and insert it at the beginning. Repeat 13 times.
//        4) Using a loop, display the contents on the screen, each value on a new line

package collectionsPracticalTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task11 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");

        List<String> listForDelete = new LinkedList<>();

        for (int i = 0; i < 5; i++){
            listForDelete.add(sc.nextLine());
        }

        listForDelete.removeFirst();
        listForDelete.removeLast();

        for(String str: listForDelete){
            System.out.println(str);
        }
    }
}
