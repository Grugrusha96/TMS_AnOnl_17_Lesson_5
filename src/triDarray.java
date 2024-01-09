import java.util.Scanner;


// 1. Шахматная доска
// Создать программу для раскраски шахматной доски с помощью цикла.
// Создать двумерный массив стрингов 8х8. С помощью циклов задать элементам
// циклам значения В(Black) или W(White).

public class triDarray {
    public static void main(String[] args){

        String[][] chessboard = new String[8][8];
        for (int i =0; i < chessboard.length; i++){
            for (int j = 0; j < chessboard.length; j++){
                if ((i+j) % 2 ==0) {
                    chessboard[i][j] = "W";
                } else {
                    chessboard[i][j]="B";
                }
                System.out.println(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }

}
