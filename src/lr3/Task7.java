package lr3;

import java.util.Scanner;

/*
Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной.
 */
public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        char[] chars = new char[size];

        for (int i = 0; i < size; i++) {
            chars[i] = (char) ((int) 'a' + i * 2);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(chars[i]);
        }
        System.out.println("");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }



    }
}
