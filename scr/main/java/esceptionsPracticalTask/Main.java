// Task:
// Create two classes.
//Implement the next code inside them:
//Thread.sleep(); with parameter of 3 seconds
//in two different ways
// via try/catch
//  specify the type of generated exception when declaring the method
//      2. Create class Main.
//In any place of the code, insert the following line
// int zero = 5/0;
//When executing this code in the console, we will get an exception java.lang.ArithmeticException
// Use try/catch to catch the generated exception and replace it with the text You shall not fall!

package esceptionsPracticalTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExceptionsTryCatch excTryCatch = new ExceptionsTryCatch();
        ExceptionsThrows excThrows = new ExceptionsThrows();
        excTryCatch.sleepTryCatch();
        excThrows.sleepThrows();

        try {
            System.out.println("Division by zero test:");
            int result = 5 / 0;
            System.out.println("Division by zero test:");
        } catch (ArithmeticException e) {
            System.out.println("You shall not fall!");
        }
    }
}
