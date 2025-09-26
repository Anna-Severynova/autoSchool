package review.conditionsPractical;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two names: ");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("The names are identical");
        } else if (name1.length() == name2.length()) {
            System.out.println("The lengths of the names are equal");
        } else {
            System.out.println("The names aren't identical and The lengths of the names aren't equal");
        }
    }
}
