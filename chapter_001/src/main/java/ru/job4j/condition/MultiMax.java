package ru.job4j.condition;

/**
 * Максимум из трех чисел[#234676]
 */

public class MultiMax {
    public int max(int first, int second, int third) {
        int result1 = (first > second) && (first > third) && (second > third)? first : second;
        int result2 = (result1 > third) ? result1 : third;
        return result2;

    }
}
