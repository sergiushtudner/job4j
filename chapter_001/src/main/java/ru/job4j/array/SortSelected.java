package ru.job4j.array;

/**
 * Сортировка упорядочивает массив элементов по возрастанию и убывания.
 * В этом задании вам нужно реализовать сортировку методом выборки.
 * Смысл этого метод в поиске минимального элемента из оставшихся.
 */
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
        int min = MinDiapason.findMin(data, i, data.length-1); // находим мин значение в данном массиве
            int index = FindLoop.indexOf(data, min, i, data.length); // находим номер ячейки где лежит мин значение массива
               int temp = data[i];
               data[i] = data[index];
               data[index] = temp;
        }
        return data;
    }
}
