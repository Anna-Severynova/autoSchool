package autoSchool.arrays;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int [][] matrice = {{1,2,3,4,5},
                            {4,5},
                            {7,8,9}};

System.out.println(matrice[2][2]);// 1 число - строки, 2 число - столбцы

        //двумерная матрица строк
        String sMatrice [][] = new String[2][3];
        sMatrice[0][0]="A";
        System.out.println(sMatrice[0][0]);
    }

}
