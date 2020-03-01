package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        // Метод должен проверить, что все элементы в массиве являются или true или false.
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
             if (data[index] == data[0]);
             else result = false;
        }
        return result;
    }
    public static boolean monoOdd(boolean[] data) {
        // Метод должен проверить, что все элементы в массиве являются или true или false для нечётного количества элементов в массиве.
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (index % 2 == 0) {
                if (data[index] == data[0]);
                else result = false;
            }
        }
        return result;
    }
    public static boolean monoEven(boolean[] data) {
        // Метод должен проверить, что все элементы в массиве являются или true или false для чётного количества элементов в массиве.
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (index % 2 > 0) {
                if (data[index] == data[0]);
                else result = false;
            }
        }
        return result;
    }
}
