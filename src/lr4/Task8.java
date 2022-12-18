package lr4;

import java.util.Scanner;

//Напишите программу «Шифр Цезаря», которая зашифровывает
//введенный текст. Используете кодовую таблицу символов. При запуске
//программы в консоль необходимо вывести сообщение: «Введите текст для
//шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//После того как введены все данные, необходимо вывести преобразованную
//строку с сообщением «Текст после преобразования : ». Далее необходимо
//задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//если пользователь вводит «y», тогда выполнить обратное преобразование.
//Если пользователь вводит «n», того программа выводит сообщение «До
//свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//то программа ему выводит сообщение: «Введите корректный ответ».
public class Task8 {

    static String encode(String str, int shift) {
        var encodedStr = "";
        for (int i = 0; i < str.length(); i++) {
            encodedStr += (char) ((int) str.charAt(i) + shift);
        }
        return encodedStr;
    }

    static String decode(String str, int shift) {
        return encode(str, -shift);
    }

    public static void main(String[] args) {
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
