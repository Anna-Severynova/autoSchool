package reviewArraysConditionsOopStrings.conditionsPractical;

public class Task111 {
    public static void main (String [] args){
        int i = 0; // считаем количество строки
        while (i<10){
            int j = 0; // счетчик для подсчета символов в каждой строчке

            while (j<10){
                System.out.print("S");
                j++;
            }
            System.out.println();// после каждой итерации переходим на новую строку
            i++;
        }
    }
}