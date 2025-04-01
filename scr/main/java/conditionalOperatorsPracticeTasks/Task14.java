package conditionalOperatorsPracticeTasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) { // количество строк
            for (int j = 1; j < n; j++) { // символы в строке
                System.out.print("8");
            }
            System.out.println("8");
        }
    }
}
