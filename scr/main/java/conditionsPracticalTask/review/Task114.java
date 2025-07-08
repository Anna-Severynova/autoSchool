package conditionsPracticalTask.review;

import java.util.Scanner;

public class Task114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m-number:");
        int m = sc.nextInt();
        //int i = 0; // счетчик для количества строк
        System.out.println("Enter n-number");
        int n = sc.nextInt();
        //int j = 0; // счетчик для количества элементов в строке
        for (int i = m; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
