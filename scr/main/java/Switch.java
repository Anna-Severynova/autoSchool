import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch (age) {
            case 0: System.out.println("You born");
            break;
            case 7: System.out.println("You're a school student");
            break;
            case 18: System.out.println("You finished the school");
            break;
        }
    }
}
