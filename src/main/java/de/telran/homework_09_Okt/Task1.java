package de.telran.homework_09_Okt;

public class Task1 {
    public static void main(String[] args) {
//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.


        int mainNum = 10;
        double m = 15;
        double n = -12;
        double diff1 = (m > mainNum) ? m - mainNum: mainNum - m;
        double diff2 = (n > mainNum) ? n - mainNum: mainNum - n;

         if(diff1 == diff2) {
             System.out.println("Эти числа находятся на одинаковом расстоянии до числа " + mainNum );
         } else if(diff1 < diff2) {
             System.out.println("Число " + m + " ближе к " + mainNum );
         } else {
             System.out.println("Число " + n + " ближе к " + mainNum );
         }

//        ..----------
    }
}
