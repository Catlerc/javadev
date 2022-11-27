package lr1;


import java.util.Scanner;

//Напишите программу, в которой по году рождения определяется возраст пользователя.
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения");
        int year = in.nextInt();
        System.out.println("Вам " + (2022 - year) + " лет");
        in.close();
    }
}
