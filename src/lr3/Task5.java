package lr3;

import java.util.Scanner;

/*
Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.
*/
public class Task5 {
    public static void goFor(int size) {
        int sum = 0;
        int summed = 0;

        for (int i = 0; summed < size; i++)
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum += i;
                summed++;
            }
        System.out.println("Сумма: " + sum);
    }

    public static void goWhile(int size) {
        int sum = 0;
        int i = 0;
        int summed = 0;
        while (summed < size) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum += i;
                summed++;
            }
            i++;
        }
        System.out.println("Сумма: " + sum);
    }

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Введите число");
        var size = in.nextInt();
        System.out.println("Введите вариант цикла: for, while");

        var forType = in.next();

        switch (forType) {
            case "for" -> goFor(size);
            case "while" -> goWhile(size);
            default -> {
                System.out.println("не знаю такого вида циклов");
                return;
            }

        }

        in.close();
    }

}
