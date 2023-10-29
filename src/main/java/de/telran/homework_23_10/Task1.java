package de.telran.homework_23_10;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] randomArr = generateArrWithoutANumber();
        System.out.print("Random generated Array has "+ randomArr.length + " numbers: " + Arrays.toString(randomArr));
        System.out.println(" But there should be " + (randomArr.length + 1) + " elements");
        Arrays.sort(randomArr);
        int missingNum = 100;
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[0] == 2) {
                missingNum = 1;
                break;
            } else {
                if(i != randomArr.length-1 && randomArr[i] != randomArr[i+1]-1) {
                    if(randomArr[i+1]-1 == 1){
                        missingNum = 1;
                    } else {
                        missingNum = randomArr[i+1]-1;
                    }
                }
            }
            //----------
        }
        System.out.println("Missing Number is: " + missingNum);
    }
    public static int[] generateArrWithoutANumber() {
        Random random = new Random();
        int randomLength = random.nextInt(5) + 5; // from 5 to 10
        int [] arr = new int[randomLength];
        int missing = random.nextInt(randomLength);
        for (int i = 0; i < arr.length; i++) {
            if (i != missing) {
                arr[i] = (i+1);
            } else {
                arr[i] = arr.length+1;
            }
        }
        //----- перемешиваем массив
        for (int i = arr.length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            int step = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = step;
        }
        return arr;
    }
}
