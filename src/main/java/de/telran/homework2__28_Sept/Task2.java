package de.telran.homework2__28_Sept;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 4;

        int sum = addNumbers(num1, num2);
        int substr = subtractNumbers(num1, num2);
        int mult = multiplyNumbers(num1, num2);
        double division = divideNumbers(num1, num2);

        System.out.println("Сумма = "+sum+"\nВычетание = "+substr+"\nУмножение = "+mult+ "\nДеление = "+division);
    }
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }
    public static double divideNumbers(int num1, int num2) {
        if (num2 != 0) {      // ---- is impossible to divide by '0'
            return (double) num1 / num2;
        } else {
            return num1;
        }
    }
}
