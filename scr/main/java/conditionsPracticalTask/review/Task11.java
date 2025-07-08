package conditionsPracticalTask.review;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int minNum = 0;

        if (num1 < num2) {
            minNum = num1;
        } else if (num2 < num1) {
            minNum = num2;
        } else {
            System.out.println("The numbers is equal");
        }
        System.out.println("The max number is " + minNum);
    }
}
