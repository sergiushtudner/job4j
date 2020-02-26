package ru.job4j.loop;
// нужно нарисовать крест в консоле.
public class Slash {
  public static void draw(int size) {
       for (int row = 0; row < size; row++) {
           for (int cell = 0; cell < size; cell++) {
//              boolean left = (row - cell) == 0; // добавить условие, по которому нужно определить ставить ли символ или нет.
//              boolean right = ((row + cell) == size-1); // добавить условие, что нужно ставить элемент в правый угол.
               boolean left = (row==cell); // добавить условие, по которому нужно определить ставить ли символ или нет.
               boolean right = ((row + cell) == size - 1); // добавить условие, что нужно ставить элемент в правый угол.

//               boolean left = ((cell + row) % 2 == 0); // добавить условие, по которому нужно определить ставить ли символ или нет.
//               boolean right = ((cell + row) % 2 == 0); // добавить условие, что нужно ставить элемент в правый угол.

               if ((left) || (right)) {
                System.out.print("0");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
       System.out.println();
   }

   public static void main(String[] args) {
       System.out.println("Draw by 3");
      draw(3);
       System.out.println("Draw by 5");
       draw(5);
   }
}
