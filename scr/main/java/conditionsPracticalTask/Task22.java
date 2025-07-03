package conditionsPracticalTask;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter four numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int maxNum = 0;

            if (num1>num2&&num1>num3&&num1>num4){
                maxNum = num1;
            }
            else if (num2>num1&&num2>num3&&num2>num4){
                maxNum = num2;
            }
            else if(num3>num1&&num3>num2&&num3>num4){
                maxNum = num3;
            }
            else{
                maxNum = num4;
            }
            System.out.println("The max num is "+maxNum);
        }
}
