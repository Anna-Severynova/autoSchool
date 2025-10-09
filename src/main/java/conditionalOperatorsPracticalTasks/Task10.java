package conditionalOperatorsPracticalTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line = sc.nextLine();
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Fail");
        } else {
            while (number > 0) {
                System.out.println(line);
                number--;
            }
        }
    }
}
