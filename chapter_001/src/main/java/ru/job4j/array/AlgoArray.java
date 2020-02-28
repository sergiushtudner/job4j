package ru.job4j.array;

/**
 * Чтобы поменять местами элементы, нам нужно воспользоваться дополнительной переменной.
 * А зачем? Представьте у вас два ведра. В одном ведре картошка, а в другом лежит морковка.
 * Вам нужно пересыпать морковку в первое ведро, а картошку во второе.
 * Чтобы сделать эту операцию, нужно третье ведро.
 */

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

        temp = array[1]; // переменная для временного хранения значение ячейки с индексом 1.
        array[1] = array[2]; // записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        array[2] = temp; // записываем в ячейку с индексом 2 значение временной переменной.

        temp = array[3]; // переменная для временного хранения значение ячейки с индексом 3.
        array[3] = array[4]; // записываем в ячейку с индексом 3 значение ячейки с индексом 4.
        array[4] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}