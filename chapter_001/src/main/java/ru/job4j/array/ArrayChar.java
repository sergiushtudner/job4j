package ru.job4j.array;

/**
 * Метод принимает два массива символов. Вам нужно в цикле for c индексом сравнить значения ячеек с одинаковым индексом
 */
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if ((pref[index] != word[index])) {
                result = false;
                return result;
            }
        }
        return result;
    }
}
