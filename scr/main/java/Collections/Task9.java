package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 strings: ");

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        int min = Integer.MAX_VALUE;
        for (String str : list) {
            if (str.length() < min) {
                min = str.length();
            }
        }

        List<String> newList = new ArrayList<>();
        for (String str : list) {
            if (min == str.length()) {
                newList.add(str);
            }
        }
        System.out.println("The string(s) with min symbols: ");
        for(String str: newList){
            System.out.println(str);
        }
    }
}
