package de.telran.homework_16_Okt;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int temperature1 = random.nextInt(101) + 50; // from 50 to 150
        int temperature2 = random.nextInt(101) + 50;
        System.out.println("Температура колб: " + temperature1 + ", " + temperature2);

        if (proveDevice(temperature1, temperature2)) {
            System.out.println("Прибор работает в исправности.");
            printWhy(temperature1, temperature2);
        } else {
            System.out.println("К сожалению, прибор не работает.");
            printWhy(temperature1, temperature2);
        }
    }
    static public boolean proveDevice(int grade1, int grade2) {
        return (grade1 > 100) && (grade2 < 100);
    }
    static public void printWhy(int grade1, int grade2) {
        if(grade1 > 100) {
            System.out.print("(Температура 1-й колбы корректна. ");
        } else {
            System.out.print("(Температура 1-й колбы переохлажденна. ");
        }
        //---
        if(grade2 < 100) {
            System.out.print("Температура 2-й колбы корректна.)");
        } else {
            System.out.print("Температура 2-й колбы перегрета.)");
        }
    }
}
//        Представим, что у нас есть устройство, в котором две колбы.
//        Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//        Вы должны написать метод, который проверяет это устройство.
//        Ваша программа должна иметь переменные temperature1 и temperature2.
//        В результате метод возвращает true или false.
