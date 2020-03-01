package ru.job4j.array;

/**
 * Метод должен перевернуть массив задом наперёд.
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
        /*
         * backOdd, метод переворачивающий элементы массива с нечётным числом
         */
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
        /*
         * backEven, метод переворачивающий элементы массива с чётным числом
         */
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
