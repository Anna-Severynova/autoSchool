package conditionsPracticalTask.review;

import java.util.Random;
import java.util.Scanner;

public class Task77 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        System.out.println(secret);
        System.out.println("Guess a number for seven attempts");
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 8; i++) {
            System.out.println("The attempt #" + i + ":");
            int number = sc.nextInt();

            if (number == secret) {
                System.out.println("Guessed!");
                break;
            } else if (number < secret) {
                System.out.println("Little");
            } else {
                System.out.println("Much");
            }
        }
        System.out.println("Did not guess:(");
    }
}
