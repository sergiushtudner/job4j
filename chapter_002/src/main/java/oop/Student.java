package oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }
    public void song() {
        System.out.println("I believe I can fly");
    }
    public void dance() {
        System.out.println(" Petya is dacing");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
        petya.dance();
        petya.dance();
        petya.dance();
    }
}
