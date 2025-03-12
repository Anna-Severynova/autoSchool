import java.util.Scanner;

public class HelloWorldInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input username");
        String input = sc.nextLine();
        System.out.println("Hello, "+input);

    }
}
