package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователю предлагается
//ввести название дня недели. По введенному названию программа определяет
//порядковый номер дня в неделе. Если пользователь вводит неправильное
//название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов и
//на основе оператора выбора switch.
public class Task2 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Введите день недели");
        var day = in.next();

        int dayNumber = 1;
        switch (day.toLowerCase()) {
            case "понедельник" -> dayNumber = 1;
            case "вторник" -> dayNumber = 2;
            case "среда" -> dayNumber = 3;
            case "четверг" -> dayNumber = 4;
            case "пятница" -> dayNumber = 5;
            case "суббота" -> dayNumber = 6;
            case "воскресенье" -> dayNumber = 7;

            default -> {
                System.out.println("не знаю такого дня");
                return;
            }
        }

        System.out.println(day + " это " + dayNumber + " день недели.");
        in.close();
    }
}
