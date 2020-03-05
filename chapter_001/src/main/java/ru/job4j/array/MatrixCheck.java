package ru.job4j.array;

/**
 * Моно строка в матрице. Нужно будет проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'.
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
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
}
