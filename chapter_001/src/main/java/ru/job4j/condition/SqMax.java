package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                    return result;
                }
            }
        }  if (second > third) {
            if (second > forth) {
                result = second;
                return result;
            }
        }  if (third > forth) {
            result = third;
            return result;
        }
        return result;
    }
}

