package lr3;

import java.util.Scanner;

/*
Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения.
*/
public class Task6 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Введите число больше и равное 0 ");
        var size = in.nextInt();
        if (size < 0) {
            System.out.println("Ошибка: вы ввели отрицательнео число.");
            return;
        }

        int[] numbers = new int[size];

        int summed = 0;
        int i = 0;
        while (summed != size) {
            if (i % 5 == 2) {

                numbers[summed] = i;
                System.out.println("[" + summed + "] = " + i);
                summed++;

            }
            i++;
        }

        in.close();
    }
}
