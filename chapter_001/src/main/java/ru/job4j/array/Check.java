package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        // Метод должен проверить, что все элементы в массиве являются или true или false.
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
             if (data[index] != data[0]){
                 result = false;
                 return result;
             }
        }
        return result;
    }
    public static boolean monoOdd(boolean[] data) {
        // Метод должен проверить, что нечётные элементы в массиве являются или true или false.
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if ((((index + 1) % 2 != 0)) && (data[index] != data[0])) {
                result = false;
               return result;
            }
        }
        return result;
        }


    public static boolean monoEven(boolean[] data) {
        // Метод должен проверить, что чётные элементы в массиве являются или true или false.
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if ((((index + 1) % 2 == 0)) && (data[index] != data[0])) {
                result = false;
                return result;
            }
        }
        return result;
        }
}
