package lr3;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/*
Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.
 */
public class Task10 {
    public static void main(String[] args) {


        Random random = new Random();
        int size = 10;
        Integer[] numbers = new Integer[size];


        for (int i = 0; i < size; i++) {
            var number = random.nextInt();
            numbers[i] = number;
        }

        Arrays.sort(numbers, Comparator.reverseOrder()); // мы же не будем писать свои велосипеды :D

        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);
        }

    }
}
