import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do{                   //do while сначала проверяет инструкции, а потом проверяет условие
            System.out.println("Enter a number 5");
            x = sc.nextInt();
        } while (x!=5);
        System.out.println("You entered 5");
    }
}
