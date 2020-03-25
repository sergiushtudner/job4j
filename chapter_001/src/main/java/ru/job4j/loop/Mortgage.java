package ru.job4j.loop;
/**
 * Mortgage calc
 *
 * @author Sergiu Studner (sergiu.shtudner@gmail.com)
 * В этом задании нужно посчитать количество лет необходимых для погашения кредита.
 * Кредитная сумма перерасчитывается каждый год от остатка суммы умноженной на процент.
*/
/**
 * year - calculates number of years for paying amount with percent from salary
 * @param amount - amount
 * @param salary - salary
 * @param percent - percent
 */
 public class Mortgage {
     public int year(double amount, double salary, double percent) {
         int year = 0;
         while (0 < (amount + amount * (percent / 100))) {
            amount = (amount + amount * (percent / 100)) - salary;
            year++;
         }   return year;
    }
}
