package ru.job4j.array;

/**
 * mono - Метод должен проверить, что все элементы в массиве являются или true или false.
 * monoOdd -  Метод должен проверить, что нечётные элементы в массиве являются или true или false.
 * monoEven - Метод должен проверить, что чётные элементы в массиве являются или true или false.
 */
public class Check {
    public static boolean mono(boolean[] data) {
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
