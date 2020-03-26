package oop;
/**
 * 1.1. Создание объекта[#234849]
 * Здесь мы создаем переменную типа Dog с именем polkan, sharik, zhychka.
 * Далее мы записываем в эту переменную объект типа Dog.
 * Важный момент. Оператор new резервирует кусок памяти и записывает в нее данные объекта класса Dog.
 */
public class Dog {
    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
    }
}
