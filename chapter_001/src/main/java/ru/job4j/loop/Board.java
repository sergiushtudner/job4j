package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
 //               if ((cell % 2 == 0) && ( row % 2 == 0)) {
 //               if ((((row%2)==0) && ((cell%2)==0)) || (((row%1)==0) && ((cell%1)==0)))  {
                if ((cell + row) % 2 == 0)  {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        paint(50, 50);
    }
/*    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                //печатаем X - width раз.
                System.out.print("X");
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
*/}
