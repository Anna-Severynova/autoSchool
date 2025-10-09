package arraysPracticalTypes;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String[] array = new String[10];
        int[] arrNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 lines of array: ");

        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            arrNum[i] = array[i].length();
            System.out.println(arrNum[i]);
        }
    }
}

