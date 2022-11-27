package lr1;

import java.util.Scanner;

// Напишите программу, в которой Пользователь вводит имя и год рождения,
// в программа отображает сообщение содержащее имя пользователя и его возраст.
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        int name = in.nextInt();
        System.out.println("Введите год рождения");
        int year = in.nextInt();
        System.out.println(name + ", вам " + (2022 - year) + " лет");
        in.close();
    }
}
