package lr6;

import java.util.Arrays;

//Напишите программу со статическим методом, аргументом которому передается
//произвольное количество целочисленных аргументов. Результатом метод возвращает
//массив из двух элементов: это значения наибольшего и наименьшего значений среди
//аргументов, переданных методу.
class Stats {
    static public int[] stats(int[] ints) {
        var max = Integer.MIN_VALUE;
        var min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            max = Math.max(max, ints[i]);
            min = Math.min(min, ints[i]);

        }
        return new int[]{max, min};
    }
}

public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Stats.stats(new int[]{1, 2, 3, 4, 5})));
    }
}
