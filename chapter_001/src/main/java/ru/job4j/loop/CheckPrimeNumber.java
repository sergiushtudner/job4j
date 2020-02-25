package ru.job4j.loop;
//В этом задании нужно проверить, что число является простым.
// Простое число считается число, которое делится только на себя и на единицу.
public class CheckPrimeNumber {
    public static boolean check(int number) {
//        int hold = 0;
            boolean prime = true;
        if (number <2) {
            prime = false;}
        for (int index = 2; index < number; index++) {
//            int temp = number % index;
            if ((number % index) == 0) {
               prime = false;
//                return prime;
                break;
//           } else if ((number % number) > 0) {
//            } else  break; {
 //               boolean prime = false;
 //               break;
          }
        }
            return prime;
    }
}
