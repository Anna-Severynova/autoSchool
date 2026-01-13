package conditionalOperatorsPracticalTasks;

public class Task12 {
    public static void main(String[] args) {
        int num =1;
        int count;

        while(num<=10){
            int num2 =1;
            while(num2<=10){
                count = num*num2;
                System.out.print(count+" ");
                num2++;
            }
            System.out.println();
            num++;
        }

    }
}

//package conditionalOperatorsPracticeTasks;
//
//public class Task14 {
//    public static void main(String[] args) {
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=10;j++){
//                int count = i*j;
//                System.out.print(count+" ");
//            }
//            System.out.println();
//        }
//    }
//}
