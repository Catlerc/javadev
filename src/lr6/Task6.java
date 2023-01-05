package lr6;

//Напишите программу со статическим методом, которому аргументом передается
//целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//массив, который получается из исходного массива (переданного первым аргументом
//методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//аргумент метода больше длины массива, переданного первым аргументом, то методом
//создается копия исходного массива и возвращается ссылка на эту копию.

import java.sql.Array;
import java.util.Arrays;

class ArraySyntax {
    public static int[] sub(int[] array, int n) {
        if (n >= array.length) return array.clone();
        var tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }
}

public class Task6 {
    public static void main(String[] args) {
        var someArray = new int[] {1,2,3,4};

        System.out.println("array: "+ Arrays.toString(someArray));
        System.out.println("2 symbols of array: "+ Arrays.toString(ArraySyntax.sub(someArray, 2)));
        System.out.println("20 symbols of array: "+ Arrays.toString(ArraySyntax.sub(someArray, 20)));

    }
}
