package lr3;

import java.util.Scanner;

/*
Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла
*/
public class Task3 {
    public static void goFor(int size) {
        int nOld = 0;
        int n = 1;
        for (int i = 0; i < size; i++) {
            System.out.println(n);

            var nNew = n + nOld;
            nOld = n;
            n = nNew;
        }
    }

    public static void goWhile(int size) {
        int nOld = 0;
        int n = 1;
        int i = 0;
        while (i < size) {
            System.out.println(n);

            var nNew = n + nOld;
            nOld = n;
            n = nNew;
            i++;
        }
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
