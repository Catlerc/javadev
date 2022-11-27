package lr1;

import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит имя и возраст.
//Программа отображает сообщение об имени и возрасте пользователя.

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.next();
        System.out.println("Сколько вам лет?");
        String years = in.next();
        System.out.println(name + ", вам " + years + " лет :(");
        in.close();
    }
}
