package lr4;

import java.util.Scanner;

//* (дополнительная задача). Напишите программу «Шифр Цезаря», в которой
//необходимо реализовать собственный алфавит, остальные условия идентичны
//задаче 8.
public class Task9 {
    static String alphabet = "абвгдОПРСьэюя АБВГУТопрстуфхцчшЪЫЬЮеёжзийклЗИЙКЛЭмнДЕЁщъыФХЦЧШЩЖМНЯ";

    static String encode(String str, int shift) throws Exception {
        var encodedStr = "";
        for (int i = 0; i < str.length(); i++) {
            var chr = str.substring(i, i + 1);
            if (!alphabet.contains(str.substring(i, i + 1))) throw new Exception("Буквы " + chr + " нет в алфавите");
            var index = (alphabet.indexOf(chr) + shift) % alphabet.length();
            encodedStr += alphabet.charAt(index);
        }
        return encodedStr;
    }

    static String decode(String str, int shift) throws Exception {
        return encode(str, -shift);
    }

    public static void main(String[] args) throws Exception {
        var in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");

        var str = in.nextLine();

        System.out.println("Введите ключ");

        var shift = in.nextInt();

        var encoded = encode(str, shift);

        System.out.println("Текст после преобразования: " + encoded);

        var goSelect = true;
        while (goSelect) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            var select = in.next();
            switch (select) {
                case "y":
                    System.out.println("Введите ключ");

                    var shiftDecode = in.nextInt();

                    var decoded = decode(encoded, shiftDecode);

                    System.out.println("Текст после преобразования: " + decoded);

                    goSelect = false;
                    break;
                case "n":

                    System.out.println("До свидания!");
                    goSelect = false;
                    break;
                default:
                    System.out.println("Введите корректный ответ");
                    break;
            }
        }
    }
}
