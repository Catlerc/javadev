package lr1;

import java.util.Scanner;

// Напишите программу для вычисления суммы двух чисел.
// Оба числа вводятся пользователем.
// Для вычисления суммы используйте оператор +.
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        float a = in.nextFloat();
        System.out.println("Введите второе число");
        float b = in.nextFloat();
        System.out.println("Их сумма равна " + (a + b));
        in.close();
    }
}
