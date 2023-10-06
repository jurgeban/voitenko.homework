package de.telran.h_work_05_Okt;

import static java.lang.Long.parseLong;

public class Task1 {
    public static void main(String[] args) {
          System.out.println("1) " + convertNumbers(333, 16, 10));
          System.out.println("2) " + convertNumbers(819, 10, 16));
          System.out.println("3) " + convertNumbers(101101, 2, 10));
          System.out.println("4) " + convertNumbers(124, 10, 2));

    }
    public static String convertNumbers(long num1, int currentSystem, int systemTo) {
        long number = Long.parseLong(num1+"", currentSystem);
        String numberOutStr = Long.toString(number, systemTo);
        return numberOutStr;
    }
}
