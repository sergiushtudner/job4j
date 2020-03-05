package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        // Моно строка в матрице. Нужно будет проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'.
        boolean result = true;
            for (int cell = 0; cell < board.length; cell++) {
//                if ( board[row][cell] != board[row][1] ) {
                if ( board[row][cell] != 'X' ) {
                result = false;
                break;
            }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        // Моно столбец в матрице. Нужно будет проверить то, что столбец в двухмерном массиве целиком заполнен символом 'X'.
         boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if ( board[row][column] != 'X' ) {
                result = false;
                break;
            }
        }
        return result;
    }
}
