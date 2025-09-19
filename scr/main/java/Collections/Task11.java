package Collections;

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
