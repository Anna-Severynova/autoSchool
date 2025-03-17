package TypeConversions.calculations;

public class Task2 {

    public void getSumOfDigits(int number) {
        int num1 = number / 10;
        int num2 = number % 10;

        System.out.println("Sum of digits: " + (num1 + num2));
    }
}
