package conditionalOperatorsPracticeTasks;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();
        int secret = random.nextInt(21);
        System.out.println("secret num is: "+secret);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 7 numbers (from 0 to 20): ");

        boolean guessed = false;
        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();

            if (num < secret) {
                System.out.println("Secret number is greater than your number");
            } else if (num > secret) {
                System.out.println("Secret number is less than your number");
            } else {
                System.out.println("Guessed :)");
                guessed = true;
                break;
            }
        }
        if (!guessed) {
            System.out.println("Did not guess :(");
        }
    }
}
