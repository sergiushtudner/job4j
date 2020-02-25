package ru.job4j.loop;
//В этом задании нужно посчитать количество лет необходимых для погашения кредита.
//Кредитная сумма перерасчитывается каждый год от остатка суммы умноженной на процент.
public class Mortgage {
    public int year(double amount, double salary, double percent) {
        int year = 1;
        while (salary < (amount + amount * (percent / 100))) {
            amount = (amount + amount * (percent / 100)) - salary;
            year++;

        }   return year;
    }
}
