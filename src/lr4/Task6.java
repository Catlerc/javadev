package lr4;

import java.util.Random;

//Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел.
public class Task6 {
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
        var random = new Random();

        var w = 5;
        var h = 5;

        var removeColumnIndex = random.nextInt(0, w);
        var removeRowIndex = random.nextInt(0, h);

        var initArray = new int[w][h];
        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++)
                initArray[x][y] = random.nextInt();

        System.out.println("Стартовый массив");

        draw2DArray(initArray);

        var truncatedArray = new int[w - 1][h - 1];

        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++) {
                var vx = x < removeColumnIndex + 1 ? x : x - 1;
                var vy = y < removeRowIndex + 1 ? y : y - 1;
                truncatedArray[vx][vy] = initArray[x][y];
            }


        System.out.println("Массив после удаления");
        System.out.println("Индекс удаляемой строки: " + removeRowIndex);
        System.out.println("Индекс удаляемого столбца: " + removeColumnIndex);

        draw2DArray(truncatedArray);

    }
}
