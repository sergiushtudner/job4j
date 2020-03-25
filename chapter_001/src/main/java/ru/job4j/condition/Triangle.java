package ru.job4j.condition;
/**
 * В этом задании нужно проверить, что треугольник может существовать.
 * Напомню, что треугольник может существовать, если сумма двух сторон больше значения третьей для всех комбинаций.
 * Допустим у нас заданы три переменные
 * double ab, ac, dc - это длины сторон.
 */
public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        if (ab + ac > bc &&  ac + bc > ab &&  ab + bc > ac) return true;
        return false;
    }
}
