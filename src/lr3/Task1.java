package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователь вводит целое число
//в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//Если введенное пользователем число выходит за допустимый диапазон,
//выводится сообщение о том, что введено некорректное значение. Используйте
//оператор выбора switch
public class Task1 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7.");
        var number = in.nextInt();

        if (number < 1 || number > 7) {
            System.out.println("Вы ввели неправильное число");
            return;
        }

        String day = "invalid";
        switch (number) {
            case 1 -> day = "понедельник";
            case 2 -> day = "вторник";
            case 3 -> day = "среда";
            case 4 -> day = "четверг";
            case 5 -> day = "пятница";
            case 6 -> day = "суббота";
            case 7 -> day = "воскресенье";
        }

        System.out.println("Сегодня " + day);

        in.close();
    }
}
