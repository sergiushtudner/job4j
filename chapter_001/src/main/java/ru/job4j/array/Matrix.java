package ru.job4j.array;

/**
 * Реализуйте метод int[][] multiple(int size)
 * size - указывает на размер таблицы. В элементах таблицы вам нужно записать элементы таблицы умножения.
 * Элементы получать перемножением индексов.
 */
public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j]= (i + 1) * (j + 1);
            }
        }
/*
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

 */
        return table;
    }
}
