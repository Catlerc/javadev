package lr1;

import java.util.Scanner;

// Напишите программу, в которой Пользователь вводит два числа,
// а программой вычисляется и отображается сумма и разность этих чисел.
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        float a = in.nextFloat();
        System.out.println("Введите второе число");
        float b = in.nextFloat();
        System.out.println("Сумма = " + (a + b) + ". Разность " + (a - b));
        in.close();
    }
}
