package de.telran.homework_11_Okt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Вы ввели год " + year + " - это " + isLeap(year));

    }
     static String isLeap(int year) {
         boolean leapyear = (
                 year > 1584 &&
                         (
                                 (year % 400 == 0) ||
                                         (year %4 == 0 && year % 100 != 0)
                         )
         );
         if (leapyear)  {return "високосный год";}
         else return "не високосный год";
     }
}
