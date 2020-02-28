package ru.job4j.array;

/**
 * Метод swapBorder - меняет местами нулевой элемент и последний элемент в массиве.
 * Это код падает с ошибкой java.lang.ArrayIndexOutOfBoundsException.Ваша задача устранить эту ошибку.
 */
/**
 * Метод SwitchArray - меняет местами произвольные элементы в массиве.
 */
public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
//        array[0] = array[array.length];
        array[0] = array.length;
//        array[array.length] = temp;
        array[array.length-1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
