import java.util.Scanner;

// 4. Создайте двумерный массив. Выведете на консоль диагонали массива
public class twodimensionaldiagonal {
    public static void main (String[] args){
        int size = 5;
        int [] [] array = new int[size][size];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array [i][j] = (int) (Math.random() * 10);
                if (i == j){
                    System.out.print(array[i][j] +" ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
