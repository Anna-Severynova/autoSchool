package typeConversionsPracticalTask.calculate;

import java.util.Scanner;

public class Task2 {
    int number;
    int digit1;
    int digit2;
    int sum;

    public int getScan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2-digit number: ");
        //int num = sc.nextInt();
        return sc.nextInt();
    }

    public void setDigits(int number) {
        this.number = number;
        this.digit1 = number/10;
        this.digit2 = number%10;
        this.sum = digit1+digit2;
    }
    public int getSum() {
        return sum;
    }
}
