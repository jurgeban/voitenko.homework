package de.telran.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String balance = "";
        String minus = "";                           // --- in case if we have negative number
        boolean isLetter = true;
        while (isLetter) { //--------------------start While

            System.out.println("Введите целое число до 10 знаков положительное или отрицательное: ");
            String firstStr = scanner.nextLine();        // --- get data as a string
               minus = "";
            if (firstStr.charAt(0) == '-' ) {        // --- check if the first letter is minus
                String str = firstStr.substring(1);
                if (!str.contains("-")) {            // ---- check if in other part of string isn't any minus more - to get possibility of a negative number
                    minus = "-";                     // ----------------- save minus for future
                    firstStr = str;
                }
            }
           //-------------------
            balance = "";
            String[] numbers = firstStr.split("[^0-9]");        //----- get rid of all symbols except digits

            for (int i = 0; i < numbers.length; i++) {                // ------ replace array in string
                balance += numbers[i];
            }

            if (balance.length() > 0 && firstStr.length() == balance.length() && balance.length() <= 9) {
                isLetter = false;          //-------- if everything ok - exit While
            } else {
                if (balance.length() > 0 && firstStr.length() == balance.length() && balance.length() > 9) {
                    System.out.print("Вы ввели число, но оно превышает 9 знаков. Попробуйте еще раз. ");
                } else {
                    if (balance.length() > 0 && firstStr.length() > balance.length()) {
                        System.out.print("Помимо цыфр Вы также ввели другие знаки. Попробуйте еще раз. ");
                    } else {
                        if (balance.length() == 0 && firstStr.length() > 0) {
                            System.out.print("Вы не ввели ни одной цыфры. Попробуйте еще раз. ");
                        }
                    }
                }
            }
        } // ------------------------------end while


        System.out.print("Число "  + minus + balance + " -> ");         //----- output the main number

        for (int i = 0; i < balance.length(); i++) {                    // ---- output all digits in turn
               if (balance.charAt(i) == '0') {                          // ---- digit 0 can't be negative
                   if (i == balance.length()-1) {
                       System.out.print(balance.charAt(i));             // ----- output without comma
                   } else {
                       System.out.print(balance.charAt(i) + ", ");
                   }
               } else {
                   if (i == balance.length()-1) {
                       System.out.print(minus + balance.charAt(i));        // ----- output without comma
                   } else {
                       System.out.print(minus + balance.charAt(i) + ", ");
                   }
               }
        }
    }
}
