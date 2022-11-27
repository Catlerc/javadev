package lr1;

import java.util.Scanner;

// Напишите программу, в которой пользователь вводит число,
// а программой отображается последовательность из четырех чисел: число,
// на единицу меньше введённого, введенное число и число, на единицу больше введенного.
// Четвертое число должно быть квадратом суммы первых трех чисел.
public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        float a = in.nextFloat();
        System.out.println((a - 1) + " " + a + " " + (a + 1) + " " + (Math.pow(a * 3, 2)));
        in.close();
    }
}
