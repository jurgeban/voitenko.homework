package de.telran.homework2__28_Sept;

public class Task1 {
    public static void main(String[] args) {

        // 1 - Создайте строку через new - I study Basic Java!

        String str = new String("I study Basic Java!");

        doSomething(str);
    }

    // - 2
    public static void doSomething(String str) {
        // - 3;
         System.out.println("Предпоследний символ строки: " + str.charAt(str.length()-2));
         // - 4
       boolean isInside = str.contains("Java");
       if (isInside) {
           System.out.println("Данная строка содержит подстроку \"Java\"");
       } else {
           System.out.println("Данная строка не содержит подстроку \"Java\"");
       }
        // - 5
        String newStr = str.substring(14,18);
        System.out.println("newStr = " + newStr);
        // - 6
        String changedStr = str.replace("a", "o");
        System.out.println("changedStr = " + changedStr);
        // - 7
        str = str.toUpperCase();
        System.out.println("ABC = " + str);
        //- 8
        str = str.toLowerCase();
        System.out.println("abc = " + str);
    }



}
