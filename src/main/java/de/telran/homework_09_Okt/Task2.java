package de.telran.homework_09_Okt;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int n = 1 + random.nextInt(28800 - 1 + 1);

        System.out.println("1) " + n + " сек.");
        System.out.println("2) " + getHour(n,3600));
        System.out.println("3) " + getMinSec(n,3600));
    }

    static String getHour(int num1, int num2) {
        int res = num1 / num2;
        if(res == 0) {
           return "Осталось менее часа";
        } else if (res == 1) {
           return "Остался " + res + " час";                // 1
        } else if (res > 1 && res < 5) {
            return "Осталось " + res + " часа";             // 2,3,4
        } else {
            return "Осталось " + res +" часов";             // 5,6,7,8
        }
    }
    static String getMinSec(int num1, int num2) {
        String minutes = (num1 % 3600) / 60 + "";
        String seconds =  ((num1 % 3600) % 60) + "";
        minutes = (minutes.length() < 2) ? "0" + minutes: minutes;
        seconds = (seconds.length() < 2) ? "0" + seconds: seconds;
        return "Осталось 0" + (num1 / num2) + ":" + minutes + ":" + seconds;
    }
}
