package lr1;

import java.util.Scanner;

// Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце.
// Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней.
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String month = in.next();
        System.out.println("Сколько в нём дней?");
        String daysCount = in.next();
        System.out.println("В " + month + " " + daysCount + " дней!");
        in.close();
    }
}
