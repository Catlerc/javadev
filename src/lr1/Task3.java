package lr1;

import java.util.Scanner;

// Напишите программу, в которой Пользователь последовательно вводит название текущего дня недели,
// название месяца и дату (номер дня в месяце).
// Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = in.next();
        System.out.println("Введите название месяца");
        String month = in.next();
        System.out.println("Введите сегодняшнюю дату");
        String data = in.next();
        System.out.println("Сегодня " + day + ", " + data + " день месяца " + month);
        in.close();
    }
}
