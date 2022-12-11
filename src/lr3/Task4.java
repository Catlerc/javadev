package lr3;

import java.util.Scanner;

/*
Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).
*/

public class Task4 {
    public static void goFor(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public static void goWhile(int min, int max) {
        int i = min;
        while (i <= max) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Введите первое число");
        var n1 = in.nextInt();
        System.out.println("Введите второе число");
        var n2 = in.nextInt();

        var min = Math.min(n1, n2);
        var max = Math.max(n1, n2);


        System.out.println("Введите вариант цикла: for, while");
        var forType = in.next();

        switch (forType) {
            case "for" -> goFor(min, max);
            case "while" -> goWhile(min, max);
            default -> {
                System.out.println("не знаю такого вида циклов");
                return;
            }

        }

        in.close();
    }


}
