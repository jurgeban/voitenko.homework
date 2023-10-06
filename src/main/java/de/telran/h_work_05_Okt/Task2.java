package de.telran.h_work_05_Okt;

public class Task2 {
    public static void main(String[] args) {

          int overFlow = getPizzasCalories(28, 40) - getPizzasCalories(24, 40);
          System.out.println("Лишних калорий будет: " + overFlow);
    }

    public static int getPizzasCalories(double diameter, int calories) {
        double radius = diameter / 2;
        return (int) (Math.PI * Math.pow(radius, 2) * calories);
    }
}
