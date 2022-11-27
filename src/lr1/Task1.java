package lr1;

import java.util.Scanner;

// Напишите программу, в которой Пользователь вводит сначала фамилию, затем имя, затем отчество.
// После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>».
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String family = in.next();
        System.out.println("Введите имя");
        String name = in.next();
        System.out.println("Введите отчество");
        String patronymic = in.next();
        System.out.println("Hello " + family + ", " + name + ", " + patronymic);
        in.close();
    }
}
