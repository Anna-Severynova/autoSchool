package conditionalOperatorsPracticeTasks;

public class Task12 {
    public static void main(String[] args) {
        int num =1;
        int num2 =1;
        int count;

        while(num<=10){
            while(num2<=10){
                count = num*num2;
                System.out.print(count+" ");
                num2++; // 2
            }
            System.out.println();
            num++;
        }

    }
}
