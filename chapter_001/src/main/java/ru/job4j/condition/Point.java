package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(5, 5, 100, 100);
        System.out.println("result for distance form (5, 5) to (1000, 1000) " + result1);
        double result2 = Point.distance(99, 199, 5000, 6000);
        System.out.println("result for distance form (99, 199) to (5000, 6000) " + result2);
        double result3 = Point.distance(50, 55, 19999, 29999);
        System.out.println("result for distance form (50, 55) to (19999, 29999) " + result3);
    }
}
