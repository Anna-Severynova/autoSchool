import java.util.Scanner;

public class HelloWorldInput {
    public static void main(String[] args) {
printHelloName();
    }
    public static void printHelloName() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name = sc.nextLine();
       System.out.println("Hello, "+name);
    }
}
