import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово с четным количеством букв: ");
        String firstWord = scanner.nextLine();

        System.out.println("Введите второе слово с четным количеством букв: ");
        String secondWord = scanner.nextLine();

       //---------------
        if(firstWord.length() % 2 > 0) {
            System.out.println("Вы ввели первое слово с нечетным количеством букв. Попробуйте еще раз: ");
            firstWord = scanner.nextLine();
        }
        if(secondWord.length() % 2 > 0) {
            System.out.println("Вы ввели второе слово с нечетным количеством букв. Попробуйте еще раз: ");
            secondWord = scanner.nextLine();
        }

        //----------
        String first = firstWord.substring(0, firstWord.length() / 2);
        String second = secondWord.substring(secondWord.length() / 2);

        System.out.println("Слово из двух половин  будет: "+ first + second);


    }
}