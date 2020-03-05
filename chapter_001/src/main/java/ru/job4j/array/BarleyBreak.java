package ru.job4j.array;

/**
 * Заполните двойной массив 3 на 3 цифрами от 1 до 9.
 */
public class BarleyBreak {
    public static void main(String[] args) {
 
        int[][] array1 = new int[3][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;
        array1[2][0] = 7;
        array1[2][1] = 8;
        array1[2][2] = 9;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }


        int[][] array2 = new int[3][3];
         int sum = 0;
         for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum++;
                array2[i][j]=sum;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
