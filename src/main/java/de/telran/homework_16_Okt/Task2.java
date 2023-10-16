package de.telran.homework_16_Okt;

public class Task2 {
    public static void main(String[] args) {
        int bankAccount = 21;
        System.out.println("Дней = " + getPeriodOfTime(bankAccount));
    }
    static public int getPeriodOfTime(int sum) {
        int cash = sum;
        int countDays = 0;

        while (cash > 0) {
            int divider = 0;
            for(int i = 1; i <= cash; i++) {
                if (cash % i == 0 && i > divider && i != cash) {
                    divider = i;
                }
            } // end for
            countDays++;
            cash = cash - divider;
            System.out.println("Снято "+ divider +". Осталось = " + cash);
            if (cash == 1) {
                cash--;
                countDays++;
                System.out.println("Снято "+ divider +". Осталось = " + cash);
            }
        } // end While
        return countDays;
    }
}
//    У вас на банковском счету N долларов.
//        Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//        Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//
//        Ввод:  N = 21
//        Выход:  7
//        Объяснение:  N = 21
//        Снято 7, осталось = 14
//        Снято 7, осталось = 7
//        Снято 1, осталось = 6
//        Снято 3, осталось = 3
//        Снято 1, осталось = 2
//        Снято 1, Осталось = 1
//        Снято 1, осталось = 0
