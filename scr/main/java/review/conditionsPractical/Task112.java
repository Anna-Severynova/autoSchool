package review.conditionsPractical;

public class Task112 {
    public static void main (String [] args){
        int i = 1; // числа НА КОТОРЫЕ будем умножать
        while (i<11){
            int j = 1; // числа КОТОРЫЕ умножаем
            while (j<11){
                System.out.print(i*j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
