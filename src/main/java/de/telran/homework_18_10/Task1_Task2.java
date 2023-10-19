package de.telran.homework_18_10;

import java.util.Arrays;
import java.util.Random;

public class Task1_Task2 {
    public static void main(String[] args) {
        // Task1
        int[] randomArr = generateRandomArr(8, 1, 50);
        replaceOddAndPrint(randomArr);
        // Task2
        int[] randoArr2 = generateRandomArr(5, 10, 99);
        // int[] array = {1,2,3,4,5,6};
        proveIndexIncreasing(randoArr2);

    }
    //---------
    private static int[] generateRandomArr(int size, int from, int to) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(to) + from;
        }
        System.out.println("Массив с " + size + "-ю случайными числами от " + from + " до " + to + " сгенерирован " + Arrays.toString(arr));
        return arr;
    }
    //-------
    private static void replaceOddAndPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) arr[i] = 0;
        }
        System.out.println("С учетом замены в массиве нечетных чисел на ноль ------ " + Arrays.toString(arr));
    }
    //-----
    private static void proveIndexIncreasing(int[] arr) {
        String answer = "";
        //---
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1 && arr[i] >= arr[i + 1]) {
                answer = " не";
                break;
            }
        }
        System.out.println("Данный массив" + answer + " является строго возрастающим");
    }
}

//     1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
//     Выведите массив на консоль в строку.
//     Замените каждый элемент с нечетным индексом на ноль.
//     Снова выведете массив на консоль в отдельной строке.

//    2) Создайте массив из 5 случайных целых чисел из интервала [10;99]
//    Выведите его на консоль в строку.
//    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
