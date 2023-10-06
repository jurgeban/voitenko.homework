public class Task2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;

        System.out.println("Сложения двух чисел: " + add(num1, num2) + "\n" +
                           "Вычитания двух чисел: " + substract(num1, num2) + "\n" +
                           "Умножения двух чисел: " + multiply(num1, num2) + "\n" +
                           "Деления двух чисел: " + divide(num1, num2)
                          );
    }

    public static int add(int par1, int par2) {
        return par1 + par2;
    }
    public static int substract(int par1, int par2) {
        return par1 - par2;
    }
    public static int multiply(int par1, int par2) {
        return par1 * par2;
    }
    public static double divide(int par1, int par2) {
        if (par2 != 0) {      // ---- is impossible to divide by '0'
            return (double) par1 / par2;
        } else {
            return par1;
        }
    }
}
