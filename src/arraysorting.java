import java.util.Arrays;
import java.util.Scanner;

// 5. Создайте двумерный массив целых чисел.
// Отсотрируйте элементы в строках двумерного массива по возрастанию.
public class arraysorting {
    public static void main (String[] args){
        int size = 9;
        int [][] array = new int[size][size];
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array.length; j++){
                array[i][j] = (int) (Math.random() * 11);
                System.out.print (array[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] sort : array){
        }
        System.out.println(Arrays.deepToString(array));
    }
}
