package ru.job4j.array;

/**
 * monoHorizontal - Моно строка в матрице. Нужно будет проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'.
 * monoVertical - Моно столбец в матрице. Нужно будет проверить то, что столбец в двухмерном массиве целиком заполнен символом 'X'.
 * extractDiagonal - В этом задании вам нужно будет заполнить одномерный массив элементами диагонали из двухмерного массива.
 *     public static boolean isWin(char[][] board) {
 * /**
 *  * В этом задании вам нужно будет написать код проверки выигрышной ситуации в игре сокобан.
 *  * Игровое поле представляет собой массив, заполненный символами '_' (подчеркивание) и 'X' - крестик.
 *  *
 *  * Цель игры - расположить крестики в линию на 5 элементов.
 *  * Элементы X должны располагаться либо вертикально, либо горизонтально.
 *
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int cell = 0; cell < board.length; cell++) {
                if ( board[row][cell] != 'X' ) {
                result = false;
                break;
            }
            }
        return result;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if ( board[row][column] != 'X' ) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
                }
        return rsl;
    }
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
                if (monoHorizontal(board, index) || monoVertical(board, index))  {
                    result = true;
                    break;
                }
            }
        return result;
    }
}
