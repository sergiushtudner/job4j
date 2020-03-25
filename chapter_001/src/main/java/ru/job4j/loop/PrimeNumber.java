package ru.job4j.loop;
/**
 * В этом задании нужно посчитать количество простых чисел от 1 до x.
 * Простое число считается, число которое делится только на себя и на единицу.
 */
public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
