package ru.job4j.converter;
/**
 *  expected - переменная, для записи ожидаемого результата.
 *  out - переменная содержащее вычисленное значение нашего кода.
 *  passed = в переменную мы записываем сравнение двух переменных ожидаемое значение и вычисленное.
 *
 */
public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро.
        return rsl;
    }
    public static int EuroToRuble(int value) {
        int rsl = value * 70; // формула перевода евро в рубли.
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }
    public static int DollarToRuble(int value) {
        int rsl = value * 60; // формула перевода доллоры в рубли.
        return rsl;
    }
    public static void main(String[] args) {
        int in1 = 140;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed1);
        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = (expected2 == out2);
        System.out.println("120 rubles are 2 Dollar. Test result : " + passed2);
    }
}
