package ru.job4j.loop;
/*
В тренажерный зал пришли новые спортсмены - Иван и Николай. Они хотят прогрессировать очень быстро и поэтому употребляют много протеина.
 Иван за месяц увеличивает силу тяги в 3 раза за счет такой диеты, а Николай - за месяц увеличивает силу тяги в 2 раза.
 Иван хочет узнать, сколько месяцев ему нужно тренироваться, чтобы обогнать Николая в тяге.
 */
public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3; //ivan = ivan * 3;
            nik *= 2;
            month++;
//            month =  ivan / nik + month++;
//              System.out.println(month);
        }   return month;
    }
}
