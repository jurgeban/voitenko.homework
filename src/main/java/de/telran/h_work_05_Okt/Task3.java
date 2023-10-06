package de.telran.h_work_05_Okt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

          Scanner scanner =  new Scanner(System.in);
          System.out.println("Введите сумму в Евро, которую Вы хотите конвертировать: ");
          double euro = scanner.nextDouble();
          double dollarSum = convert(euro);
          System.out.println("Ваша сумма: " + euro + " €, будет сконвертирована в долларовую сумму: " + dollarSum + " $");
    }
    public static double convert(double euroSum) {
        double currentExchangeCurs = 1.10;
        DecimalFormat round = new DecimalFormat("0.0");
        return Double.parseDouble(round.format(euroSum * currentExchangeCurs));
    }
}