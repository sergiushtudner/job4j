package ru.job4j.condition;

public class Max { // Метод Max должен возвращать максимальное число из first и second.
    public static int max(int first, int second) {
        int result = (first > second)? first : second;
        return result;
    }
}
