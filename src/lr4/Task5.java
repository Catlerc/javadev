package lr4;

import java.util.Random;

//Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строи и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов.
public class Task5 {
    public static void draw2DArray(int[][] array) {
        for (int y = 0; y < array.length; y++) {
            var line = "";
            for (int x = 0; x < array[y].length; x++) {
                line += array[y][x] + " ";
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        var w = 3;
        var h = 5;

        var initArray = new int[w][h];

        var random = new Random();

        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++)
                initArray[x][y] = random.nextInt();

        System.out.println("стартовый массив");

        draw2DArray(initArray);

        var transposedArray = new int[h][w];
        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++)
                transposedArray[y][x] = initArray[x][y];

        System.out.println("Транспонированынй массив");


        draw2DArray(transposedArray);


    }
}
