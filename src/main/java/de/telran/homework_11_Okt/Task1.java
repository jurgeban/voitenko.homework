package de.telran.homework_11_Okt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String edeka = "Edeka", rewe = "Rewe";
        boolean isEdekaOpen = askIfOpen(edeka), isReweOpen = askIfOpen(rewe);


        if (canBuy(isEdekaOpen, isReweOpen)) {
            System.out.println("Я могу купить еду, потому что как минимум один магазин открыт");
        } else {
            System.out.println("Я не могу купить еду, потому что ни один магазин не открыт");
        }
    }  //--------------- end Main
    static boolean askIfOpen(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Магазин "+ str +" сейчас открыт? " + "Введите Д для \"Да\", любой другой знак для \"Нет\"");
        String answer = scanner.nextLine();
        if (answer.equals("д") || answer.equals("Д") || answer.equals("да") || answer.equals("Да") || answer.equals("ДА")) {
            return true;
        } else {
            return false;
        }
    }
    //-----------
    static boolean canBuy( boolean bool1, boolean bool2) {
        return ( (bool1) || (bool2) ) ? true: false;
    }
}

//        1) Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того
//        открыты магазины или нет. Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение.
