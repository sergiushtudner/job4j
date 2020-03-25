package ru.job4j.array;

/**
 * В этой задаче мы познакомимся с классическим способом поиска элемента в массиве.
 *Способ действительно очень простой. У нас задан массив элементов.
 * Нам необходимо найти индекс элемента, удовлетворяющего условию.
 *Решение этой задачи сводится в последовательному перебору каждого элемента.
 * Если элемент подходит под условие, мы останавливаем цикл и возвращаем индекс нашего элемента.
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}

