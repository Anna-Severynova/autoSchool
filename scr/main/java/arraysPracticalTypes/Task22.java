package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        String[] arr1 = createStringArr();
        fillStrings(arr1);
        stringOutput(arr1);
    }

    public static String[] createStringArr() {
        return new String[5];
    }

    public static void fillStrings(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 strings: ");

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextLine();
        }
    }

    public static void stringOutput(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
