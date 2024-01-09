import java.util.Scanner;
public class Chessboard {
    // 0. Создать трехмерный массив из целых чисел.
// С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
// заданное число. Пусть число, на которое будет увеличиваться каждый элемент,задается из консоли.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = 9;
        int [][][] array = new int [size] [size] [size];
        System.out.println("число для увеличения массива: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] += number;
                    System.out.print(array[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
