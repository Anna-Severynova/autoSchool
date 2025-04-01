package conditionalOperatorsPracticeTasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name+" loves me");
        }
    }
}
