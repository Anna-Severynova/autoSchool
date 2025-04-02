package conditionalOperatorsPracticeTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = 0;
        int med = 0;
        int max = 0;

        if (a < b && a < c) {
            min = a;
            if (b > c) {
                med = c;
                max = b;
            } else {
                med = b;
                max = c;
            }

        } else if (b < a && b < c) {
            min = b;
            if (a > c) {
                med = c;
                max = a;
            } else {
                med = a;
                max = c;
            }

        } else if (c < a && c < b) {
            min = c;
            if (a > b) {
                med = b;
                max = a;
            } else {
                med = a;
                max = c;
            }
        }
        System.out.println("minimum number is: " + min);
        System.out.println("median number is:  " + med);
        System.out.println("maximum number is: " + max);
    }
}