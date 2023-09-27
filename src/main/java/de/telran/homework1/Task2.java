package de.telran.homework1;

public class Task2 {
    public static void main(String[] args) {
         int num = 345;

       if (num < 100 || num > 999) {
           System.out.println("Переменная \"num\" должна быть трёхзначным числом");
       } else {
           int rest10= num % 10;
           int rest100 = num % 100;
           int rest1000 = num % 1000;

           System.out.print("Число " + num + " -> ");
           System.out.print((rest1000 - rest100) / 100);
           System.out.print(", " + (rest100 - rest10) / 10);
           System.out.print(", " + rest10);
       }
    }
}
