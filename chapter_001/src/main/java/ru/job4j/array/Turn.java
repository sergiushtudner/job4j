package ru.job4j.array;

/**
 * Turn - Метод должен перевернуть массив задом наперёд.
 * backOdd - метод переворачивающий элементы массива с нечётным числом
 * backEven - метод переворачивающий элементы массива с чётным числом
 *
 */
public class Turn {
    public static int[] back(int[] array) {
    for (int index = 0; index < (array.length)/2; index++) {
            int temp = array[index];
            array[index] = array[array.length-index-1];
            array[array.length-index-1] = temp;
     }
        return array;
   }
    public static int[] backOdd(int[] array) {
        for (int index = 0; index < (array.length)/2; index++) {
            if (index % 2 == 0) {
                int temp = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }

        }
        return array;
    }
    public static int[] backEven(int[] array) {
        for (int index = 0; index < (array.length)/2; index++) {
            if (index % 2 > 0) {
                int temp = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }
        }
        return array;
    }
}
