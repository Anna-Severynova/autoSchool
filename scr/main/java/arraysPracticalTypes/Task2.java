package arraysPracticalTypes;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] array = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 lines: ");

        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextLine();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}