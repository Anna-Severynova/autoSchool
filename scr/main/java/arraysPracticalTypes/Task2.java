package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an 8 strings: ");
        String s = sc.nextLine();

        String[] strings = new String[10];
        for (int i = 0; i < 8; i++) {
            strings[i] = sc.nextLine();
        }

System.out.println(Arrays.toString(strings));
        System.out.println("Reverse array: ");
    }
}
