package lr3;

import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
 */
public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int[] numbers = new int[size];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            var number = random.nextInt();
            numbers[i] = number;
            if (number < min) min = number;
            System.out.println("["+i+"] = "+number);
        }

        System.out.println("min: "+min);
        System.out.println("индексы элементов с минимальным  значением");

        for (int i = 0; i < size; i++) {
            if (numbers[i]==min )
                System.out.println(i);
        }


    }
}
