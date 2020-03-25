package ru.job4j.array;

/**
 * Метод перемещает заполненные ячейки массива в начало, а пустые в конец.
 */
public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) { // находим нулл эелемент
              int point = index + 1; // указатель, на не null ячейку.
                  while (point < array.length && array[point] == null) {
                     point++;
                 }
                        if (point < array.length) {
                            array[index] = array[point];
                            array[point] = null;
                        }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
