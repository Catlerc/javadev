package lr1;

import java.util.Scanner;

// Напишите программу, в которой по возрасту определяется год рождения.
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        int years = in.nextInt();
        System.out.println("Вы родились в " + (2022 - years) + " году");
        in.close();
    }
}
