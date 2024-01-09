import java.util.Arrays;
import java.util.Scanner;


// умнажение двух матриц

public class matrixmultiplication {
    public static void main(String[] args){
        int [][] array1 = {{1,0,0,0}, {0,1,0,0},{0,0,0,0}};
        int [][] array2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int [][] arrayRavno = new int[3][3];

        for (int i = 0; i < array1.length; i++){
            for (int j =0; j< array2[i].length; j++){
                arrayRavno [i][j] = array1[i][j] * array2 [i][j];
            }
        }
        System.out.printf("матрица 1: %S \n", Arrays.deepToString(array1));
        System.out.printf("матрица 2: %S \n", Arrays.deepToString(array2));
        System.out.printf("равно:  %S \n", Arrays.deepToString(arrayRavno));

    }
}

