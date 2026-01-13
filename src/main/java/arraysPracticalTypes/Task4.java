package arraysPracticalTypes;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int [] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
