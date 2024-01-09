import java.util.Scanner;


// 3. Создайте двумерный массив целых чисел.
// Выведете на консоль сумму всех элементов массива.

public class twodimensionalarray {
    public static void main(String[] agrs) {
        int twodimensionalarray = 31;
        int [][] array = {{3,5,4,9},{5,6,4,8}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                twodimensionalarray += array [i][j];

            }
        }
        System.out.print(twodimensionalarray);
    }
}
