package typeConversionsPracticalTask.calculate;

import java.util.Scanner;

public class Task4 {
    int a;
    int b;
    int c;

    public int getScanNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number: ");
        this.a = scan.nextInt();
        return a;
    }
    public int getScanNum2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number_1: ");
        this.b = scan.nextInt();
        return b;
    }
    public int getScanNum3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number_1: ");
        this.c = scan.nextInt();
        return c;
    }

    public int getSumAB(){
        this.a = a + b;
        return a;
    }

    public int getSubCA(){
        this.b = c - a;
        return b;
    }

    public int getSumABC(){
        this.c = a+b+c;
        return c;
    }
}
