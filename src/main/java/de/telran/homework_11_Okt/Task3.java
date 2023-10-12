package de.telran.homework_11_Okt;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье целое число: ");
        int num3 = scanner.nextInt();

        System.out.println(num1 + num2 + num3);
        System.out.println("Наибольшее число = " + getMax(num1, num2, num3));
    } //-------------

    static int getMax(int n1, int n2, int n3) {
        if (n1 >= n2 && n1>= n3) {
            return n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return n2;
        } else if (n3 >= n1 && n3 >= n2) {
            return n3;
        }
        return 0;
    }
}
//        Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
//        Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
//        Напечатает максимум из трех чисел.
