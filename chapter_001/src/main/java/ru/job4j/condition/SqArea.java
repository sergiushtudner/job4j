package ru.job4j.condition;

// Стороны прямоугольника.В этом задании необходимо вычислить площадь прямоугольника.
// Известны периметр и соотношение сторон прямоугольника.

public class SqArea {
    public static double square(int p, int k) {
        double rsl = ((p / (2 * (k + 1))) * k) * (p / (2 * (k + 1)));
        return rsl;

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, S = " + result1);
    }
}
