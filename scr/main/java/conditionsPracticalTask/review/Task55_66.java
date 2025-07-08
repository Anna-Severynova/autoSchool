package conditionsPracticalTask.review;

import java.util.Scanner;

public class Task55_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println(name + ", grow up more");
        } else if (age > 20) {
            System.out.println(name + ", 18 is enough");
        } else {
            System.out.println(name + ", your age between 18 and 20");
        }
    }
}
